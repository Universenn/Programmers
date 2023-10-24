import java.util.*;
class Solution {
   
    HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;
        recursive("", numbers);

        Iterator<Integer> iterator = set.iterator();
        // iterator.hasNext() 다음 수가 있냐
        while (iterator.hasNext()) {
            // 다음 수를 꺼낸다.
            int next = iterator.next();
            // 꺼낸 수가 소수인지 확인
            if (isPrime(next)) {
                answer++;
            }
        }
        return answer;
    }

    void recursive(String comb, String numbers) {
        if (!comb.equals("")) set.add(Integer.valueOf(comb));

        for (int i = 0; i < numbers.length(); i++) {
            recursive(comb + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }

    boolean isPrime(int num){
        if (num == 1 || num == 0) return false;

        int sqrtNum = (int)Math.sqrt(num);

        for (int i = 2; i <= sqrtNum; i++)
            if (num % i == 0) return false;

        return true;
    }
}