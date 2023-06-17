import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            if(food[i] % 2 != 0){
                food[i]--;
            }
            for(int j = 0; j < food[i]/2; j++){
                answer += i + "";
            }
        }
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        
        return answer+"0"+reverse;
    }
}
// 1번 3개
// 2번 4개
// 3번 6개

// 1번 음식 1개
// 2번 음식 2개
// 3번 음식 3개