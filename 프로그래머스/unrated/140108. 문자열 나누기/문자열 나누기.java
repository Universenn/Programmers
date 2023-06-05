class Solution {
    public int solution(String s) {
       int answer = 0;
        int firstX = 1;
        int RestY = 0;
        char startS = s.charAt(0);
        boolean test = false;

        for (int i = 0; i < s.length()-1; i++) {
        if (test) {
                startS = s.charAt(i);
                test = false;
            }
            if (startS != s.charAt(i+1)) {
                RestY++;
            } else {
                firstX++;
            }
            if (firstX == RestY) {
                test = true;
                answer++;
                firstX = 1;
                RestY = 0;
                if (i != s.length()-3) {
                    i++;
                }
            }
            if (s.length() - 2 ==i) {
                answer++;
            }
        }
        
        return answer == 0 ? 1: answer;
    }
}