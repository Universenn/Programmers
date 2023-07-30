import java.util.ArrayList;
import java.util.Arrays;

class Solution {
 public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : numbers){
            list.add(num);
        }        
        if(direction.equals("right")){
            list.remove(numbers.length-1);
            list.add(0,numbers[numbers.length-1]);
        }else{
            list.remove(0);
            list.add(numbers[0]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}