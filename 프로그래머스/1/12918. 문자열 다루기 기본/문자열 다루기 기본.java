class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        String copyS = s.replaceAll("[^0-9]", "");
        if(s.length() == 4 || s.length() == 6){
            answer = s.equals(copyS) ? true : false;
        }            
        return answer;
    }
}