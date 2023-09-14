import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int max = 0;
        int min = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        for(int i  = 0;  i < lottos.length; i++){
            if(lottos[i] == 0){
                max++;
            }else{
                for(int j = 0; j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        min++;
                        max++;
                        break;
                    }
                }
            }
        }
        answer[0] = rank(max);
        answer[1] = rank(min);
        return answer;
    }
    

    private int rank(int score){
        switch(score) {
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default : return 6;
    }
    }
}