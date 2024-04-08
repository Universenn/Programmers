import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0,0};
        
        Stack<Character> stack = new Stack<>();
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        for(String word : words){
            i++;            
            if(!stack.isEmpty() && stack.peek() == word.charAt(0)){
                stack.pop();
            }
            char c = word.charAt(word.length()-1);
            stack.push(c);
            map.put(word, map.getOrDefault(word,0) +1);
            
            if(stack.size() > 1 || map.get(word) > 1){
                answer[0] = i % n == 0 ? n : i % n;
                answer[1] = (i + n - 1) / n;
                break;
            }
        }
        


        return answer;
    }
}