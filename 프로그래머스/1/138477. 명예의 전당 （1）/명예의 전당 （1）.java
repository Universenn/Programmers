import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i = 0; i < score.length; i++){
            if(priorityQueue.size() < k){
                priorityQueue.add(score[i]);
            }else{
                if(priorityQueue.peek() < score[i]){
                    priorityQueue.poll();
                    priorityQueue.add(score[i]);
                };
            }
            answer[i] = priorityQueue.peek();
        }
        
        return answer;
    }
}