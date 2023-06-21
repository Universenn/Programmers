import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int min = 0;
        int max = 0;
        for(int i = 0; i < sizes.length; i++){
            if(min < Math.min(sizes[i][0], sizes[i][1])){
                min  = Math.min(sizes[i][0], sizes[i][1]);
            }
            if(max < Math.max(sizes[i][0], sizes[i][1])){
                max = Math.max(sizes[i][0], sizes[i][1]);
            }
        }
        return max * min;
    }
}