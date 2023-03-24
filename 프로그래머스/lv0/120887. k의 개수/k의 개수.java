class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l <= j; l++) {
            int x = l;
            while (x!=0) {
                if (x % 10 == k) {
                    answer++;
                    x = x / 10;
                } else {
                    x = x / 10;
                }
            }
        }
        return answer;
    }
}