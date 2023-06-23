class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] arr = my_string.split("");
        for(String a : arr){
            if(a.equals(alp)){
                answer += a.toUpperCase();
            }else{
                answer += a;
            }
        }
        return answer;
    }
}