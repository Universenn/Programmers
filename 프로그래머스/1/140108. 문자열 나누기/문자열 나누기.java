import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.isEmpty()){
                answer++;
                stack.push(c);
            }
            
            count = stack.peek() == c ? count + 1 : count - 1; 
            
            if(count == 0){
                stack.clear();
            }
        }
        
        // return stack.size() == 0 ? answer : answer + 1;
        return answer;
    }
}