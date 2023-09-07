import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int[] xNumber = new int[10];
        int[] yNumber = new int[10];
        for (String c : X.split("")) {
            xNumber[Integer.parseInt(c)]++;
        }
        for (String c : Y.split("")) {
            yNumber[Integer.parseInt(c)]++;
        }

        StringBuilder sb = new StringBuilder();
        int[] xyNumber = new int[10];
        for (int i = 0; i < xyNumber.length; i++) {
            if (xNumber[i] != 0 && yNumber[i] != 0) {
                xyNumber[i] = Math.min(xNumber[i], yNumber[i]);
            }
        }

        for (int i = 0; i < xyNumber.length; i++) {
            for (int j = 0; j < xyNumber[i]; j++) {
                sb.append(i);
            }
        }

        sb.reverse();
        return sb.toString().equals("") ? "-1": sb.toString().startsWith("0") ? "0" : sb.toString();
    }
}