class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeArr = before.toCharArray();
        char[] AfterArr = after.toCharArray();

        for (int i = 0; i < before.length();i++) {
            for (int j = 0; j < before.length(); j++) {
                if (beforeArr[i] == AfterArr[j]) {
                    AfterArr[j] = '0';
                    break;
                }
            }
        }
        String answerString = String.valueOf(AfterArr);
        if (answerString.replaceAll("0", "").equals("")) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}