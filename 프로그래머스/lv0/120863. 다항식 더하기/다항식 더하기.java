class Solution {
 public String solution(String polynomial) {
        String answer = "";
        String[] pArr = polynomial.split(" +");
        int xNum = 0;
        int num = 0;
        for (int i = 0; i < pArr.length; i++) {
            if (pArr[i].contains("x")) {
                if (pArr[i].equals("x")) {
                    pArr[i] = "1x";
                }
                xNum += Integer.parseInt(pArr[i].replaceAll("x", ""));
            } else {
                if (!pArr[i].contains("+")) {
                    num += Integer.parseInt(pArr[i]);
                }
            }
        }
        if (num != 0 && xNum != 0) {
            if (xNum == 1) {
                answer = "x + " + num;
            } else {
                answer = xNum + "x + " + num;
            }
        } else {
            if (xNum == 1) {
                answer = "x";
            }
            if (xNum !=1 && num == 0) {
                answer = xNum + "x";
            }
            if (xNum == 0) {
                answer = String.valueOf(num);
            }
        }
        return answer;
    }
}