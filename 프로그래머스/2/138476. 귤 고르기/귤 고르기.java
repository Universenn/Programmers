import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int t : tangerine){
            map.put(t, map.getOrDefault(t, 0) +1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int set : map.keySet()){
            list.add(map.get(set));
        }
        
        list.sort(Comparator.reverseOrder());
        
        for(int i = 1; i <= list.size(); i++){
            k -= list.get(i-1);
            if(k <= 0){
                return i;
            }
        }
                
        return answer;
    }
}