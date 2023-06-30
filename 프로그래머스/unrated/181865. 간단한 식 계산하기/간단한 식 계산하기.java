import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] result = binomial.split(" ");
        if(result[1].contains("+")){
            answer = Integer.parseInt(result[0]) + Integer.parseInt(result[2]);
        }else if(result[1].contains("-")){
            answer = Integer.parseInt(result[0]) - Integer.parseInt(result[2]);
        }else{
            answer = Integer.parseInt(result[0]) * Integer.parseInt(result[2]);
        }
        return answer;
    }
}