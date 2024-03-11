import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Map<String, Integer> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        for(String word : words){
            char cF = word.charAt(0);
            char cL = word.charAt(word.length()-1);
            i++;
            map.put(word, map.getOrDefault(word, 0) + 1);
            if(map.get(word) == 2 || !stack.isEmpty() && stack.peek() != cF) {
                answer[0] = i % n == 0 ? n : i % n;
                answer[1] = i % n == 0 ? i / n : i / n  + 1;
                break;
            } 
            stack.push(cL);
        }
        return answer;
    }
}