import java.util.*;
class Solution {
    
    HashMap<String, Integer> hashMap = new HashMap<>();
    ArrayList<String> answerList = new ArrayList<>();
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        // orders 정렬
        for (int i = 0; i < orders.length; i++) {
            char[] chars = orders[i].toCharArray();
            Arrays.sort(chars);
            orders[i] = String.valueOf(chars);
        }

        // course 별로 조합 만들기
        for (int courseLength : course) {
            for (String order : orders)
                combination("", order, courseLength);
                // 가장 많은 조합을 answer 에 저장
            if (!hashMap.isEmpty()) {
                List<Integer> countList = new ArrayList<>(hashMap.values());
                int max = Collections.max(countList);

                if (max > 1)
                    for (String key : hashMap.keySet())
                        if (hashMap.get(key) == max)
                            answerList.add(key);
                hashMap.clear();
            }

        }
        Collections.sort(answerList);
        answer = new String[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    private void combination(String order, String orders, int courseLength) {
        
        // 탈출 조건
        if (courseLength == 0) {
            hashMap.put(order, hashMap.getOrDefault(order, 0) + 1);
            return;
        }
        // 수행 동작
        for (int i = 0; i < orders.length(); i++) {
            combination(order + orders.charAt(i), orders.substring(i + 1), courseLength - 1);
        }
    }

}