import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Queue<Integer> queue = new LinkedList<>();

        for (int price : prices) {
            queue.add(price);

        }
        for(int i = 0; i < prices.length; i++){
            int count = 0;
            int poll = queue.poll();
            for(Integer l : queue){
                count++;
                if(poll > l)
                    break;
            }
            answer[i] = count;
        }
        
        return answer;
    }
}