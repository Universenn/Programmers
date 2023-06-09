
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public int[] solution(int[] answers) {

        int[] first = {1,2,3,4,5}; // 5개씩 반복
        int[] second = {2,1,2,3,2,4,2,5}; // 8개씩 반복
        int[] third = {3,3,1,1,2,2,4,4,5,5}; // 10개씩 반복
        int[] score = {0,0,0}; // 각 수포자들의 점수

        int maxScore = 0;

        //점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i%5]) score[0]++;
            if (answers[i] == second[i%8]) score[1]++;
            if (answers[i] == third[i%10]) score[2]++;
        }

        //가장 높은 점수
        maxScore = Math.max(score[0], score[1]);
        maxScore = Math.max(maxScore, score[2]);

        //max와 같으면 add
        List<Integer> arr = new ArrayList<>();
        if (maxScore == score[0]){
            arr.add(1);
        }if (maxScore == score[1]) {
            arr.add(2);
        }if (maxScore == score[2]) {
            arr.add(3);
        }

        //list를 int형으로 변환
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}