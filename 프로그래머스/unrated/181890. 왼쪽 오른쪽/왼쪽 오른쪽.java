class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int l = -1;
        int r = -1;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                l = i;
                break;
            }
            if (str_list[i].equals("r")) {
                r = i;
                break;
            }
        }

        if (r == -1 && l == -1) {
        } else if (r == -1 && l != -1) {
            answer = new String[l];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = str_list[i];
            }
        } else if (r != -1 && l == -1) {
            answer = new String[str_list.length-r-1];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = str_list[i+r+1];
            }
        }
        return answer;
    }
}