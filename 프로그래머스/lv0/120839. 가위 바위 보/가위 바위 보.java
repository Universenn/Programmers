class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        for(String a : arr){
            answer += a.equals("2") ? "0" : a.equals("0") ? "5" : "2";
        }
        return answer;
    }
}