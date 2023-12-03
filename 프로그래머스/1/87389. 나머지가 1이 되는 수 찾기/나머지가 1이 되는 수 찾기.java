class Solution {
    public int solution(int n) {
        int answer = 0;
        int i= 2;
        while(true){
            if((n-1) % i == 0){
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }
}