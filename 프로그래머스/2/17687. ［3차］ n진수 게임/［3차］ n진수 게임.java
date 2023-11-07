class Solution {
      public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuffer sbEntire = new StringBuffer();
        StringBuffer sbDivide = new StringBuffer();

        for (int i = 0, j =0; i <= t*m; i++, j++) {
            sbEntire.append(Integer.toString(i, n));
        }

        char[] chars = sbEntire.toString().toCharArray();

        for (int i = p-1; i < chars.length; i+=m) {
            sbDivide.append(chars[i]);
        }

        String substring = sbDivide.toString().substring(0, t).toUpperCase();
        return substring;
    }
}