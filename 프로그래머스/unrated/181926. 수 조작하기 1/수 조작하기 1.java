class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for(int i = 0; i < control.length(); i++){
            if('w' == control.charAt(i)){
                answer += 1;
            }
            if('s' == control.charAt(i)){
                answer -= 1;
            }
            if('d' == control.charAt(i)){
                answer += 10;
            }
            if('a' == control.charAt(i)){
                answer -= 10;
            }
        }
        return answer;
    }
}