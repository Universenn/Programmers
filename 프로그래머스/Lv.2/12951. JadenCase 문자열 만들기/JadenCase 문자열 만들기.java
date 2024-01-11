class Solution {
    public String solution(String s) {
        String answer = "";
        s += "1"; 
        String[] str = s.toLowerCase().split(" ");
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length(); j++){
                if(j == 0 && str[i].charAt(j) >= 'a'){
                    sb.append((char)(str[i].charAt(j) - 32));
                }
                else if(str[i].charAt(j) == ' '){
                    sb.append(" ");
                }
                else{
                    sb.append(str[i].charAt(j));
                }
            }                
            if(i != str.length-1) sb.append(" ");
        }
        sb.delete( sb.length() -1 , sb.length());
        return sb.toString();
    }
}