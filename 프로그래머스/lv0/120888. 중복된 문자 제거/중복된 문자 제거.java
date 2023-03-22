import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        
        
        char[] ch_my_string = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = i+1; j < my_string.length(); j++) {
                if (ch_my_string[i] == ch_my_string[j]) {
                    ch_my_string[j] = '0';
                }
            }
            answer += ch_my_string[i];
        }


        return answer.replaceAll("0","");
    }
}