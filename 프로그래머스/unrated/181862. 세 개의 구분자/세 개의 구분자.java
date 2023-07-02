class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", " ").trim();
        String[] answer = myStr.split(" +");
        if(answer[0].equals("")){
            answer[0] = "EMPTY";
        }
        return answer;
    }
}