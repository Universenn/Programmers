class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] safeBoard = new int[board.length+2][board[0].length+2];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    safeBoard[i][j] = 1;
                    safeBoard[i][j+1] = 1;
                    safeBoard[i][j+2] = 1;
                    safeBoard[i+1][j] = 1;
                    safeBoard[i+1][j+1] = 1;
                    safeBoard[i+1][j+2] = 1;
                    safeBoard[i+2][j] = 1;
                    safeBoard[i+2][j+1] = 1;
                    safeBoard[i+2][j+2] = 1;
                }
            }
        }

        for (int i = 1; i < safeBoard.length-1; i++) {
            for (int j = 1; j < safeBoard[i].length-1; j++) {
                if (safeBoard[i][j] == 0) {
                    answer++;
                }
            }

        }
        System.out.println(answer);
        return answer;
    }
}