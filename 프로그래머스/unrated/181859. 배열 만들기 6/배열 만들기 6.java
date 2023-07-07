import java.util.Stack;


class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i= 0; i < arr.length; i++){
            if (stack.empty()){
                stack.add(arr[i]);
            } else if (stack.peek() == arr[i]) {
                stack.pop();
            } else if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        if(stack.empty()) {
            stack.push(-1);
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}