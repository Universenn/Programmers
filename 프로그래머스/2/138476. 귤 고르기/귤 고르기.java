import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {        
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(tangerine);
        int temp = tangerine[0];
        int count = 0;
        for(int t : tangerine){
            if(temp != t){
                temp = t;
                list.add(count);
                count = 0;
            }
            count++;
        }
        
        list.add(count);
        Collections.sort(list);
        
        count = 0;
        
        for(int i = 0; i < list.size(); i++){
            k -= list.get(list.size() - i - 1);
            count++;
            if(k <= 0) {
                return count;
            }
        }
        
        return count;
    }
}