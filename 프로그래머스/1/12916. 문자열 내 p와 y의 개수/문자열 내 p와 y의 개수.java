class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toUpperCase();
        
        int bool = 0;
        
        for(char c : s.toCharArray()){
            if(c == 'P') bool++;
            if(c == 'Y') bool--;
        }

        return bool == 0 ? true : false;
    }
}