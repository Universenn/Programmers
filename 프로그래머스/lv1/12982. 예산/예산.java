import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        int sum = 0;
        for(int i : d){
            sum += i;
            if(sum > budget){
                break;
            }
            answer++;
        }
        return answer;
    }
}