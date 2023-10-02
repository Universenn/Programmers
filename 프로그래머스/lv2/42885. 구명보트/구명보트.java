import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
       
        Arrays.sort(people);
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : people) {
            list.add(i);
        }
        while (list.size() != 0){
            if (list.size() == 1) {
                answer++;
                break;
            }
            // 구명 보트 한명 탑승
            if (list.get(0) + list.get(list.size()- 1) > limit) {
                list.remove(list.size()-1);
                answer++;
                // 구명 보트 두명 탑승
            } else if (list.get(0) + list.get(list.size()- 1) <= limit) {
                list.remove(list.size()-1);
                list.remove(0);
                answer++;
            }
        }
        return answer;

    }
}