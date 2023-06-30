import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        String[] result = my_string.trim().split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < result.length; i++){
            if(!result[i].equals("")){
                list.add(result[i]);
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}