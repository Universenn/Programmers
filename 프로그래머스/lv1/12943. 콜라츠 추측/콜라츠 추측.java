class Solution {
    public int solution(int num) {
        int answer = 0;
        long numL = Long.valueOf(num);
        while(numL != 1L){
            numL = (numL % 2 == 0) ? numL / 2 : numL * 3 + 1;
            answer++;
            if(answer >= 500){
                return -1;
            }
        }
        return answer;
    }
}