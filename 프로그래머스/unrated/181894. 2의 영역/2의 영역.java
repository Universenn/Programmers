import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                list.add(i);            
            }
        }
        if(list.size() == 0){
            answer = new int[]{-1};
        }else{
            int start2 = list.get(0);
            int end2 = list.get(list.size()-1);
            answer = new int[end2 - start2 + 1];
            for(int i = 0; i < answer.length; i++){
                answer[i] = arr[i + start2];
            }
        }
        
        
        return answer;
    }
}