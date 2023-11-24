import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuffer sb = new StringBuffer();
        int index = 0;
        for (int i = 0; i < number.length() - k; i++) {
            int max = 0;
            for (int j = index; j <= i+k; j++) {
                int nextNum = number.charAt(j) - '0';
                if (max < nextNum) {
                    max = nextNum;
                    index = j + 1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}