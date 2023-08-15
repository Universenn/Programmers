import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; ){
            if(st.empty()){
                st.push(arr[i]);
                i++;
                
            }
            else if(st.peek() < arr[i]){
                st.push(arr[i]);
                i++;
            }
            else{
                st.pop();
            }
        }
        return st.stream().mapToInt(Integer::intValue).toArray();
    }
}