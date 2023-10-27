import java.util.*;
class Solution {

    HashMap<String, Integer> hashMap = new HashMap<>();
    ArrayList<String> arrayList = new ArrayList<>();

    public String[] solution(String[] orders, int[] course) {

        // orders 정렬
        for (int i = 0; i < orders.length; i++) {
            char[] chars = orders[i].toCharArray();
            Arrays.sort(chars);
            orders[i] = String.valueOf(chars);
        }
        
        // course 수만큼 order 정렬
        for (int count : course) {
            for (String order : orders) {
                combination("", order, count);
            }
            if (!hashMap.isEmpty()) {
                List<Integer> list = new ArrayList<>(hashMap.values());
                int max = Collections.max(list);
                if (max > 1 ){
                    for (String key : hashMap.keySet()) {
                        if (hashMap.get(key) == max) {
                            arrayList.add(key);
                        }
                    }
                }
            }
            hashMap.clear();
        }
        Collections.sort(arrayList);
        String[] answer = new String[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }

    void combination(String order, String orders, int count) {
        if (count == 0) {
            hashMap.put(order, hashMap.getOrDefault(order, 0) + 1);
            return;
        }
        for (int i = 0; i < orders.length(); i++) {
            combination(order + orders.charAt(i), orders.substring(i + 1), count - 1);
        }
    }
}