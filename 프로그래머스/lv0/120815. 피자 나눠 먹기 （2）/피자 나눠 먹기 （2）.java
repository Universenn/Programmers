class Solution {
    public int solution(int n) {
        int temp = n;
        while(n % 6 != 0){
            n += temp;
        }
        return n/6;
    }
}