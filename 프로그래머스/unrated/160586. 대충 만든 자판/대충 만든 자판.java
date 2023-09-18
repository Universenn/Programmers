class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] alphabet = new int[26];

        for (int i = 0; i < 26; i++) {
            // 알파벳 시작
            char startAlphabet = 65;

            // temp 로 인덱스값이 제일 작은 것 넣어주기
            for (int j = 0; j < keymap.length; j++) {

                // 알파벳 증가
                char alpha = (char) (startAlphabet + i);
                int index = keymap[j].indexOf(alpha);
                // alphabet 0 이고, index 값이 존재 할때 (-1이 아닐때)
                if (alphabet[i] == 0 && index != -1) {
                    alphabet[i] = index+1;
                } else {
                    if (alphabet[i] > index && index != -1) {
                        alphabet[i] = index+1;
                    }
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            for (char c : targets[i].toCharArray()) {
                if(alphabet[c-65] == 0){
                    answer[i] = 0;
                    break;
                }
                answer[i] += alphabet[c-65];
            }
            if(answer[i] == 0){
                answer[i] = -1;
            }
        }
        return answer;
    }
}