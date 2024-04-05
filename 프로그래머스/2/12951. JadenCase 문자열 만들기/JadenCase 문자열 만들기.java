class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        s = s.toLowerCase();
        boolean b = true;
        for(char c : s.toCharArray()){
            // System.out.println(c);
            // 공백 판별
            if(c == ' '){
                b = true;
                sb.append(c);
                continue;
            // 공백이 아니고 숫자도 아니다
            }else if(isAlphabet(c, b)){
                b = false;
                c = (char)(c - 32);
            }else{
                b = false;
            }
            sb.append(c);
            
        }
        
        return sb.toString();
    }
    public static boolean isAlphabet(Character c, boolean b){
        // 0보다 작거나, 9보다 크거나, b true 이면 
        if(c < '0' || c > '9' && b && c != ' '){
            return true;
        }else{
            return false;
        }
    }
    
}