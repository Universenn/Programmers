import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int date = discount.length - 9;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }
        for(int i = 0; i < date; i++){
            int count = 0;
            Map<String, Integer> map2 = new HashMap<>();
            for(int j = i; j < 10+i; j++){
                map2.put(discount[j], map2.getOrDefault(discount[j], 0)+1);
            }
            for (String s : map.keySet()) {
                if (map2.get(s) == null) break;
                else if(map2.get(s) < map.get(s)) break;
                else if(map2.get(s) >= map.get(s)) count++;
            }
            if(count == want.length) answer++;
        }
        return answer;
    }
}