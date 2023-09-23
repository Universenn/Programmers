import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> test = new HashMap<>();

        // 테스트 나열 
        test.put("R",0);
        test.put("T",0);
        test.put("C",0);
        test.put("F",0);
        test.put("J",0);
        test.put("M",0);
        test.put("A",0);
        test.put("N",0);

        for (int i = 0; i < survey.length; i++) {
            String str = survey[i];
            if (choices[i] > 4) {
                str = survey[i].substring(1);
                // 마지막 글자만 가져온다
                test.put(str, test.getOrDefault(str, 0) +choices[i]-4);
            } else if (choices[i] < 4) {
                // 첫번째 글자만 가져온다
                str = survey[i].substring(0,1);
                test.put(str, test.getOrDefault(str, 0) +4-choices[i]);
            }
        }

        answer += test.get("R") == test.get("T") || test.get("R") > test.get("T") ? "R" : "T";
        answer += test.get("C") == test.get("F") || test.get("C") > test.get("F") ? "C" : "F";
        answer += test.get("J") == test.get("M") || test.get("J") > test.get("M") ? "J" : "M";
        answer += test.get("A") == test.get("N") || test.get("A") > test.get("N") ? "A" : "N";

        return answer;
    }
}