import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
    
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            if (i > 0) {
                sb.append(sb.charAt(0));
                sb.delete(0, 1);
            }
            for (char c : sb.toString().toCharArray()) {
                if (!stack.empty()) {
                    if (c == ']' && stack.peek() == '[') stack.pop();
                    else if (c == '}' && stack.peek() == '{') stack.pop();
                    else if (c == ')' && stack.peek() == '(') stack.pop();
                    else stack.push(c);
                } else {
                    stack.push(c);
                }
            }
            answer += stack.empty() ? 1 : 0;
        }

        return answer;
    }
}