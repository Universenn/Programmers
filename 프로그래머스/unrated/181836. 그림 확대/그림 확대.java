class Solution {
    public String[] solution(String[] picture, int k) {        
        String[] answer = new String[picture.length * k];
        int temp = 0;
        for(int i = 0; i < picture.length; i++){

            for (int j = 0; j < picture[i].length(); j++) {
                 answer[temp] += String.valueOf(picture[i].charAt(j)).repeat(k);
             }
            for (int l = 1; l < k; l++) {
                answer[temp+l] = answer[temp];
            }
            temp += k;
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(4);
        }
        return answer;
    }
}