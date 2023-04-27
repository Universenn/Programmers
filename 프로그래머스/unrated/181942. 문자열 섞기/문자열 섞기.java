class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();
        for(int i = 0; i < arrStr1.length; i++){
            answer = answer + arrStr1[i] + arrStr2[i];
        }
        
        return answer;
    }
}