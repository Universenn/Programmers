import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arrS = String.valueOf(n).split("");
        Arrays.sort(arrS, Comparator.reverseOrder());
        String temp = "";
        for (String s : arrS) {
            temp += s;
        }
        answer = Long.parseLong(temp);
        return answer;
    }
}