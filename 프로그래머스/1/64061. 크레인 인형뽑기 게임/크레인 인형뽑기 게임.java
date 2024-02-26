import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[][] boardHeight = new int[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < board.length; j++) {
                arrayList.add(board[j][i]);
            }
            boardHeight[i] = arrayList.stream().mapToInt(Integer::intValue).toArray();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < boardHeight.length; j++) {
                if (boardHeight[moves[i] - 1][j] != 0) {
                    list.add(boardHeight[moves[i] - 1][j]);
                    boardHeight[moves[i] - 1][j] = 0;
                    break;
                }
            }
            if (list.size() >= 2 &&list.get(list.size()-1) == list.get(list.size()-2)) {
                list.remove(list.size()-1);
                answer++;
                list.remove(list.size()-1);
                answer++;
            }
        }
        return answer;
    }
}