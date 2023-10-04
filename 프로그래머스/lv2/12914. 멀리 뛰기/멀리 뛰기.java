class Solution {
    public long solution(int n) {
        long[] temp = new long[2001];
        temp[1] = 1;
        temp[2] = 2;
        if (n >= 3) {
            for (int i = 3; i < n + 1; i++) {
                temp[i] = (temp[i - 1] + temp[i - 2]) % 1234567;
            }
        }
        return temp[n];
    }
}