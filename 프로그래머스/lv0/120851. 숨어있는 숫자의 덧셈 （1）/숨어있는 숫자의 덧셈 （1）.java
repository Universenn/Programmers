class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[a-z A-Z]","").split("");
        for(String s : arr){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}