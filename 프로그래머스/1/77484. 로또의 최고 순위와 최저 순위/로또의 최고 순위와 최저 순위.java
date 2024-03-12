import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int lottos_length = lottos.length; 
        int zeroCount = 0;
        int matched = 0;
        for(int i = 0; i < 6; i++){
            if(lottos[i] == 0){
                zeroCount++;
            }
            for(int j = 0; j < lottos_length; j++){
                if(lottos[i] == win_nums[j]){
                    matched++;
                }
                if(lottos[i] < win_nums[j]){
                    break;
                }
            }
        }
        return new int[]{rank(matched+zeroCount), rank(matched)};
    }
    
    public static int rank(int num){
        switch(num){
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default : return 6;
        }
    }
}
