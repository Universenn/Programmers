class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int temp = 0;
            for(int j = 1; j * j <= i; j++){
                if(j * j == i) temp++;
                else if(i % j == 0) temp += 2;
            }
            
            answer += temp % 2 == 0 ? i : (i * -1);
        }
        return answer;
    }
}