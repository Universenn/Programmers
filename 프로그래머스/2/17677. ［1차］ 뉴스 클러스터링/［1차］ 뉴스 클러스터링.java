import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
             int answer = 0;
        int count = 0;
        int combination = 0;
        str1 = str1.toUpperCase().replaceAll("[^A-Z]","@");
        str2 = str2.toUpperCase().replaceAll("[^A-Z]","@");;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        extracted(str1, map1);
        extracted(str2, map2);

        if (map1.size() == 0 && map2.size() == 0) return 65536;
        
        for (String s : map1.keySet()) {
            if (map2.get(s) != null) {
                count += Math.min(map2.get(s), map1.get(s));
                combination += Math.max(map2.get(s), map1.get(s));
            } else 
                combination += map1.get(s);
            
        }
        for (String s : map2.keySet()) 
            if (map1.get(s) == null) 
                combination += map2.get(s);
        
        answer = (int) (((double) count / combination) * 65536);
        return answer;
    }

    private static void extracted(String str2, HashMap<String, Integer> map2) {
        for (int i = 0; i < str2.length()-1; i++) {
            String substring2 = str2.substring(i, i + 2);
            if (!substring2.contains("@")) {
                map2.put(substring2, map2.getOrDefault(substring2, 0) + 1);
            }
        }
    }
}