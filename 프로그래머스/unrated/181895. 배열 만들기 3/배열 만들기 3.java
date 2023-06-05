import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
//        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            list.add(arr[i]);
        }
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            list.add(arr[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

//        int[] answer = list.stream().mapToInt(i->i).toArray();
//        System.out.println(Arrays.toString(answer));
        return answer;
    }
}