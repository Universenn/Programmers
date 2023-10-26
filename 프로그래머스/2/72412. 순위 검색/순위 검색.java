import java.util.*;
class Solution {
   
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];

        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();

        for (String s : info) {
            String[] sArr = s.split(" ");
            String[] languages = {sArr[0], "-"};
            String[] jobs = {sArr[1], "-"};
            String[] exps = {sArr[2], "-"};
            String[] foods = {sArr[3], "-"};
            int score = Integer.parseInt(sArr[4]);
            for (String language : languages) {
                for (String job : jobs) {
                    for (String exp : exps) {
                        for (String food : foods) {
                            String[] keyData = {language, job, exp, food};
                            String key = String.join(" ", keyData);
                            
                            ArrayList<Integer> list = hashMap.getOrDefault(key, new ArrayList<Integer>());
                            list.add(score);

                            hashMap.put(key, list);

                        }
                    }
                }
            }
        }

        // 오름차순 정렬
        for (ArrayList<Integer> value : hashMap.values()) {
            value.sort(null);
        }


        // query 파싱
        int i = 0;
        for (String q : query) {
            String[] data = q.split(" and ");
            int score = Integer.parseInt(data[3].split(" ")[1]);
            data[3] = data[3].split(" ")[0];
            String key = String.join(" ", data);

            if (hashMap.containsKey(key)) {
                ArrayList<Integer> list = hashMap.get(key);
                int left = 0;
                int right = list.size();
                // binary search 를 통해서 lower-bound 를 한다
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) >= score) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                answer[i] = list.size() - left;

            }
            i++;
        }
        return answer;
    }
}