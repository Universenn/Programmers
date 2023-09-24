import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
         int[] answer = new int[id_list.length];
        Set<String> set = new HashSet<>(Arrays.asList(report));


        // 신고당한 수
        Map<String, Integer> reportMap = new LinkedHashMap<>();
        Map<String, Integer> stopMap = new LinkedHashMap<>();

        // map 신고 횟수
        for (String s : id_list) {
            reportMap.put(s, 0);
            stopMap.put(s, 0);
        }

        for (String s : set) {
            String[] s1 = s.split(" ");
            reportMap.put(s1[1], reportMap.getOrDefault(s1[1], 0) +1);
        }

        // 본인이 신고한사람 중 정지당한 사람의 수
        for (String s : set) {
            String[] s1 = s.split(" ");
            if (reportMap.get(s1[1]) >= k){
                stopMap.put(s1[0], stopMap.getOrDefault(s1[0], 0) +1);
            }
        }

        int i = 0;
        for (Integer value : stopMap.values()) {
            answer[i] = value;
            i++;
        }
        return answer;
    }
}