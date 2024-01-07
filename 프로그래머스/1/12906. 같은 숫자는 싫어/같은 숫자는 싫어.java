import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int a : arr){
            if(stack.isEmpty()){
                stack.add(a);
            }else{
                if(stack.peek() != a)
                    stack.add(a);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}