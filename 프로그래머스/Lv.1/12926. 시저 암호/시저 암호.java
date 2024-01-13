class Solution {
    public String solution(String s, int n) {
        String answer = "";
        System.out.println('Z'+1);
        for(char c : s.toCharArray()){
            if(c == ' '){
                answer += " ";
            }else{
                if(c >= 'a'){
                    int ch = (c + n > 122) ? (c + n - 26) : (c + n) ;
                    answer += (char)ch;                    
                }else{
                    int ch = (c + n > 90) ? (c + n - 26) : (c + n) ;
                    answer += (char)ch;                    
                }
            }
        }
        return answer;
    }
}