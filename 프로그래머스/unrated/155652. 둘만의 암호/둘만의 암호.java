import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        char ch = 97;
        for (int i = 0; i < 26; i++) {
            list.add(String.valueOf((char)(ch + i)));;
        }
        String[] skipArr = skip.split("");
        for (String sk : skipArr) {
            list.remove(sk);
        }

        String[] sArr = s.split("");
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (sArr[i].equals(list.get(j))) {
                    answer += list.get((j + index)%(26-skip.length()));
                    break;
                }
            }
        }

        return answer;
    }
}