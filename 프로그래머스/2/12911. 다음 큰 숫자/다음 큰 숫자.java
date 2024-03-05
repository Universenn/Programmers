class Solution {
    public int solution(int n) {
        int bitCount = Integer.bitCount(n);
        while(true){
            n++;
            int nextCount = Integer.bitCount(n);
            if(bitCount == nextCount) return n;
        }
    }
}