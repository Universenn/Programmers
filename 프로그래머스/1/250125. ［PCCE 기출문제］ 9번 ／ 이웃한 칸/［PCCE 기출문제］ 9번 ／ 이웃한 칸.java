class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        
        // 위로
        if(h > 0 && color.equals(board[h-1][w])) answer++;                
        // 아래로
        if(h < board.length-1 && color.equals(board[h+1][w])) answer++;
        // 오른쪽
        if(w > 0 && color.equals(board[h][w-1])) answer++;                
        // 왼쪽
        if(w < board.length-1 && color.equals(board[h][w+1])) answer++;
            
        return answer;
    }
}