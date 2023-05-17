import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> nameScore = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            nameScore.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                if(null != nameScore.get(photo[i][j])){
                    answer[i] += nameScore.get(photo[i][j]);
                }
            }
        }
        
        return answer;
    }
}