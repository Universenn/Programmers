import java.util.*;
class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuffer sb = new StringBuffer();
        return sb.append(ch).reverse().toString();
    }
}