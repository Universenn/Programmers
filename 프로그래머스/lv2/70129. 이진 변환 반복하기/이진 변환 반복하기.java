class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
         while(!s.equals("1")){
            // 0 개수 세기
            answer[1] += s.replaceAll("1", "").length();


            // 0 제거 길이 의 수를 2진코드 변환
            s = Integer.toBinaryString(s.replaceAll("0", "").length());
            answer[0]++;
        }
        return answer;
    }
}