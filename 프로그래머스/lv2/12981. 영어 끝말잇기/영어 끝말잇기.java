import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Map<String, Integer> map = new HashMap<>();

        int num1 = 0;

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0)+1);
            num1++;
            if (map.get(words[i]) > 1) {
                break;
            }
            if (i < words.length-1) {
                boolean wordChain = words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0);
                if (wordChain) {
                    num1++;
                    break;
                }
            }
            if (num1 == words.length) {
                return answer;
            }
        }

        for (int i = 1; i < num1; i++) {
            if(n * i >= num1){
                answer[1] = i;
                answer[0] = num1 % n == 0 ? n : num1 % n;
                break;
            }
        }
        return answer;
    }
}