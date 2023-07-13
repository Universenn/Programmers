import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : arr){
            list.add(a);
        }        
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < delete_list.length; j++){
                if (list.get(i) == delete_list[j]){
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}