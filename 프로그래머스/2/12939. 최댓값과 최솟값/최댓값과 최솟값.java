import java.util.*;
class Solution {
    public String solution(String s) {

        String[] s1 = s.split(" ");
        
        int[] arr = new int[s1.length];
        
        int i = 0;
        for(String s2 : s1){
            arr[i]= Integer.parseInt(s2);
            i++;
        }
        
        Arrays.sort(arr);
        
        String answer = Math.min(arr[0], arr[arr.length-1]) + " " +Math.max(arr[0], arr[arr.length-1]);
        
        return answer;
    }
}