import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int num = 0;
        list.add(n);
        while(n != 1){
            if(n%2==0){
                n = n/2;
            }else{
                n = 3 * n + 1;
            }
            list.add(n);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}