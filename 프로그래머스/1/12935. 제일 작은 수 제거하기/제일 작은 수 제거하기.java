import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] arrCopy = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            arrCopy[i] = arr[i];
        }
        
        Arrays.sort(arrCopy);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int a : arr){
            if(arrCopy[0] != a){
                list.add(a);
            }
        }
        return arr.length == 1 ? new int[] {-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }
}