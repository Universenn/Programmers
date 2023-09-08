import java.util.*;
class Solution {
public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean[] bol = new boolean[n + 2];
        boolean[] reserveB = new boolean[n + 2];
        Arrays.sort(lost);
        Arrays.sort(reserve);


        // bol == ture
        for (int i = 0; i < bol.length; i++) {
            bol[i] = true;
        }

        // reserveB
        for (int i = 0; i < reserve.length; i++) {
            reserveB[reserve[i]] = true;
        }

        // lost -> false
        for (int i = 0; i < lost.length; i++) {
            bol[lost[i]] = false;
        }

        for (int i = 0; i < reserve.length; i++) {
            int temp = reserve[i];
            if (!bol[temp] && reserveB[temp]) {
                bol[temp] = true;
                reserveB[temp] = false;
            }
        }

        // reserve -> true
        for (int i = 0; i < reserve.length; i++) {
            int temp = reserve[i];
             if (!bol[temp - 1] && reserveB[temp]) {
                bol[temp - 1] = true;
             } else if (!bol[temp + 1] && reserveB[temp]) {
                 bol[temp + 1] = true;
             }
        }

        // count
        for (int i = 1; i < bol.length-1; i++) {
            if (bol[i]) {
                answer++;
            }
        }
        return answer;
    }
    
}