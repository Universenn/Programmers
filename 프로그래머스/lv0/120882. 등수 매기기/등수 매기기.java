class Solution {
  public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] rank = new int[score.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = score[i][0] + score[i][1];
        }

        for (int i = 0; i < rank.length; i++) {
            rank[i] = 1;
            for (int j = 0; j < rank.length; j++) {
                if (answer[i] < answer[j]) {
                    rank[i] += 1;
                }
            }
        }

        return rank;
    }
}