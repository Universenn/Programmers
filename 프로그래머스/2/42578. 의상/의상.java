import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            ArrayList<String> list = hashMap.getOrDefault(clothes[i][1], new ArrayList<String>());
            list.add(clothes[i][0]);
            hashMap.put(clothes[i][1], list);
        }

        for (String s : hashMap.keySet()) {
            ArrayList<String> list = hashMap.get(s);
            answer *= (list.size() + 1);
        }
        
        return answer-1;
    }
}