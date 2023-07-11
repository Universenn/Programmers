class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] num_str_arr = num_str.split("");
        for(String s : num_str_arr){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}