import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] s_1 = {1, 2, 3, 4, 5};
        int[] s_2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == s_1[i % s_1.length]) score[0]++;
            if(answers[i] == s_2[i % s_2.length]) score[1]++;
            if(answers[i] == s_3[i % s_3.length]) score[2]++;
        }
        
        int max = Math.max(score[0],Math.max(score[1],score[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            if(max == score[i]) list.add(i+1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}