import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                if(flag[i]){
                    list.add(arr[i]);    
                    list.add(arr[i]);
                }else{
                    list.remove(list.size()-1);
                }
                
            }
        }
        
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}