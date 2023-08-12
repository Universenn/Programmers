import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();
        for(String s1 : arr){
            sb.append(s1);
        }
        return sb.reverse().toString();
    }
}