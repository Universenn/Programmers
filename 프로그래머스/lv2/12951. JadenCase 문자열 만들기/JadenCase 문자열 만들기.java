class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toLowerCase().toCharArray();
        chars[0] = 96 < chars[0] ? (char) (chars[0] - 32) : chars[0];
        

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                sb.append(" ");
                if (i != chars.length-1) {
                    if (chars[i+1] != ' ') {
                        i++;
                        if(96 < chars[i]){
                            sb.append((char) (chars[i] - 32));
                        }else{
                            sb.append(chars[i]);
                        }
                    }
                }
            }else{
                sb.append(chars[i]);
            }

        }
        return sb.toString();
    }
}