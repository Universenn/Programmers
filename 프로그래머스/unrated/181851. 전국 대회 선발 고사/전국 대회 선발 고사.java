import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                list.add(rank[i]);
            }
        }
        list.sort(Comparator.naturalOrder());
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        int[] ranking = new int[3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < rank.length; j++){
                if(result[i] == rank[j]){
                     ranking[i] = j;
                }
            }
        }
        answer = (ranking[0] * 10000) + (ranking[1] * 100) + ranking[2];
        return answer;
    }
}