class Solution {
    public int solution(String myString, String pat) {
        String result = "";
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                result += "B";
            }else{
                result += "A";
            }
        }
        
        return result.contains(pat) ? 1 : 0;
    }
}