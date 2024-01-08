class Solution {
    public int solution(int n) {
        StringBuffer sb = new StringBuffer();
        int answer = Integer.parseInt(sb.append(Integer.toString(n, 3)).reverse().toString(),3);
        return answer;
    }
}