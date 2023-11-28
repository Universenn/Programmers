class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[][] ds = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int n = board.length;
        
        for (int[] d : ds) {
            
            int hc = h + d[0];
            int wc = w + d[1];
            
            if (hc < 0 || hc >= n || wc < 0 || wc >=n ) continue;
            if (board[h][w].equals(board[hc][wc])) answer++;
        }

        return answer;
    }
}