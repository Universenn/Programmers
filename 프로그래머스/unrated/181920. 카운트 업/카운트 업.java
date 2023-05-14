class Solution {
    public int[] solution(int start, int end) {
        int x = end - start + 1;
        int[] answer = new int[x];
        for(int i = 0; i < x; i++){
            answer[i] = i + start;
        }
        return answer;
    }
}