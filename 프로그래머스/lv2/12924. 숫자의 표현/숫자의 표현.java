class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int temp = i;
            int sum = 0;
            while(true){
                if(sum == n){
                    answer++;
                    break;
                }else if(sum > n){
                    break;
                }
                sum += temp;
                temp++;
            }
        }
        return answer;
    }
}