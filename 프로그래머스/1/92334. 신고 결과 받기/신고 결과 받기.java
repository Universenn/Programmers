import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> set = new HashSet<>(Arrays.asList(report));

        Map<String, Integer> reportMap = new HashMap<>();
        Map<String, Boolean> stopMap = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();
        for (String s : id_list) {
            stopMap.put(s, false);
            resultMap.put(s, 0);
        }
        for (String s : set) {
            String[] reportS = s.split(" ");
            reportMap.put(reportS[1], reportMap.getOrDefault(reportS[1], 0) + 1);
        }
        for (String s : reportMap.keySet()) {
            if(reportMap.get(s) >= k){
                stopMap.put(s, true);
            };
        }
        for (String s : set) {
            String[] reportS = s.split(" ");
            if(stopMap.get(reportS[1]))
                resultMap.put(reportS[0], resultMap.getOrDefault(reportS[0], 0) + 1);
        }
        int[] answer = new int[id_list.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = resultMap.get(id_list[i]);
        }
        return answer;
    }
}