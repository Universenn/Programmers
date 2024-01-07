class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m), min = Math.min(n, m);
        answer[0] = gcd(max, min);
        answer[1] = n * m / answer[0];
        return answer;
    }
    int gcd(int max, int min){
        if (max % min == 0) {
            return min;
        } else {
            return gcd(min, max % min);
        }
    }
}