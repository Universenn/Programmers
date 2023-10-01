class Solution {
    public int solution(int n) {
        String s = Integer.toBinaryString(n);
        int oneLength = Integer.bitCount(n);

        while (true) {
            n++;
            s = Integer.toBinaryString(n);
            int tempLength = Integer.bitCount(n);
            if (oneLength == tempLength) {
                return n;
            }
        }


    }
}