class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int x = 0;
        for(int i = 1; i < n+1; i++){
            if(i%k ==0){
                answer[x] = i;
                x++;
            }
        }
        return answer;
    }
}