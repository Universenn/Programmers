class Solution {
    public int solution(String s) {
      char prev = '0';
        int first = 0, rest = 0, answer = 0;
        for (char c : s.toCharArray()) {
            if (prev == '0') {
                prev = c;
                first++;
                answer++;
            } else if (c == prev) {
                first++;
            } else {
                rest++;
            }
            if (first == rest) {
                prev = '0';
            }
        }
        return answer;
    }
}