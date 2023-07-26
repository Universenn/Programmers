class Solution {
    public int solution(int n) {
        int answer = 1;
        int result = 1;
        for(int i = 2; i <= 10; i++){
            result *= i;
            if(result == n){
                answer = i;
                break;
            }else if(result > n){
                break;
            }
            answer = i;
        }
        return answer;
    }
}