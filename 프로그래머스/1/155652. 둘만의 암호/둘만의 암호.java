import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuffer sb = new StringBuffer();
        
        for(char c : s.toCharArray()){
            char temp = c;
            int idx = 0;
            while(idx < index){
                temp = temp == 'z' ? 'a' : (char)(temp+1);
                if(!skip.contains(String.valueOf(temp)))
                    idx++;
            }
            sb.append(temp);
            
        }
        
        return sb.toString();
    }
}