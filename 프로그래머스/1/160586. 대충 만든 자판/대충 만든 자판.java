import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        int[] alphabet = new int[26];
        
        for(String k : keymap){
            for(int i = 0; i < k.length(); i++){
                if(alphabet[k.charAt(i)-65] == 0){
                    alphabet[k.charAt(i)-65] = i + 1;
                }else{
                    int temp = alphabet[k.charAt(i)-65];
                    alphabet[k.charAt(i)-65] = Math.min(temp,i+1);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            for(int j = 0; j < targets[i].length(); j++){
                if(alphabet[targets[i].charAt(j)-65] == 0){
                    answer[i] = -1;
                    break;
                }else{
                    answer[i] += alphabet[targets[i].charAt(j)-65];
                }
            }
        }
        
        return answer;
    }
}