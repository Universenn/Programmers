import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer ={};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (list.get(i) == arr[0]) {
                list.remove(i);
                break;
            }
        }
        return arr.length == 1 ? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }
}