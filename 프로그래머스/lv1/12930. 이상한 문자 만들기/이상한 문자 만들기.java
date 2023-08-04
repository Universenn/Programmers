class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.charAt(s.length()-1) == ' ' ? s + "@" : s;
        boolean b = s.charAt(s.length() - 1) == '@' ? true : false;
        String[] arrS = s.split(" ");
        for(int i = 0; i < (b ? arrS.length -1 : arrS.length); i++){
            String[] temp = arrS[i].split("");
            for(int j = 0; j < temp.length; j++){
                if(j % 2 == 0){
                    answer += temp[j].toUpperCase();
                }else{
                    answer += temp[j].toLowerCase();
                }
            }
            if(i != arrS.length-1) answer += " ";
        }
        return answer;
    }
}