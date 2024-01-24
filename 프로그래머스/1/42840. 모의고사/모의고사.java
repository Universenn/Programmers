import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] st1 = {1, 2, 3, 4, 5};
        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int index1 = 0, index2 = 0, index3 = 0, sum1 = 0, sum2 = 0, sum3 = 0;
        // 학생 한명당 인덱스를 정해놓고 끝까지 가면 다시 0으로 돌아가기
        for(int i =0; i < answers.length; i++){
            
            if(i % st1.length == 0) index1 = 0; // 5 가 되면 0
            if(i % st2.length == 0) index2 = 0; // 8 이 되면 0
            if(i % st3.length == 0) index3 = 0; // 10이 되면 0
            
            if(answers[i] == st1[index1]) sum1++;
            if(answers[i] == st2[index2]) sum2++;
            if(answers[i] == st3[index3]) sum3++;
            
            index1++;index2++;index3++;
        }
        
        int maxScore = Math.max(sum1, Math.max(sum2, sum3));
        
        ArrayList<Integer> list =  new ArrayList<>();

        if(maxScore == sum1) list.add(1);
        if(maxScore == sum2) list.add(2);
        if(maxScore == sum3) list.add(3);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}