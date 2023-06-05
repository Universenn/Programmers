import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
//        int[] answer = {};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            list.add(arr[i]);
        }
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            list.add(arr[i]);
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}