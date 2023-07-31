class Solution {
    public int solution(int n) {
        boolean[] bool = new boolean[n+1];
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (!bool[i]) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        bool[i] = true;
                        answer++;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}