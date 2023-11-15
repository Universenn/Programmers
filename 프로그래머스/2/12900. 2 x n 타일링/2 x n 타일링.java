
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] nArr = new int[60000];
        nArr[1] = 1;
        nArr[2] = 2;
        if(n > 2){
            for(int i = 2; i < n; i++){
                nArr[i+1] = (nArr[i] + nArr[i-1]) % 1000000007;
            }
        }
        return nArr[n];
    }
}