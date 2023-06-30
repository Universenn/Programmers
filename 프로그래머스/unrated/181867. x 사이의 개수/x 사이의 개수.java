class Solution {
    public int[] solution(String myString) {
        String[] strLength = myString.split("x");
        
        int[] answer = new int[myString.charAt(myString.length()-1) == 'x' ? strLength.length + 1 : strLength.length];
        for(int i = 0; i < strLength.length; i++){
            answer[i] = strLength[i].length();
        }
        
        return answer;
    }
}