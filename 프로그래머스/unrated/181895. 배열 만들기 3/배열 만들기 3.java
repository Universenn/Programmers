class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[0][1]- intervals[0][0] + intervals[1][1] - intervals[1][0] + 2];
        int temp1 = intervals[0][0];
        int temp2 = intervals[1][0];
        for(int i = 0; i < intervals[0][1]- intervals[0][0]+1; i++){
            answer[i] = arr[temp1];
            temp1++;
        }
        for(int i = intervals[0][1]- intervals[0][0]+1; i < intervals[0][1]- intervals[0][0] + intervals[1][1] - intervals[1][0] + 2; i++){
            answer[i] = arr[temp2];
            temp2++;
        }
        return answer;
    }
}