class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int temp = 0;
        for(int i = 1; i <= n; i++){
            temp = i;
            while(sum < n){
                sum += temp;
                temp++;
                if(sum == n)
                    answer++;
            }
            sum = 0;
        }
        return answer;
    }
}