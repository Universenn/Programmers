import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        
        int[] X_arr = new int[10];
        int[] Y_arr = new int[10];
        
        for(int i = 0; i < X.length(); i++){
            X_arr[Integer.parseInt(X.charAt(i)+"")]++;
        }
        
        for(int i = 0; i < Y.length(); i++){
            Y_arr[Integer.parseInt(Y.charAt(i)+"")]++;
        }
        
        ArrayList<Integer> num_list = new ArrayList<>();
        
        for(int i = 0; i < X_arr.length; i++){
            if(X_arr[i] > 0 && Y_arr[i] > 0){
                if(X_arr[i] > Y_arr[i]){
                    for(int j = 0; j < Y_arr[i]; j++)
                        num_list.add(i);                  
                }else{
                    for(int j = 0; j < X_arr[i]; j++)
                        num_list.add(i);      
                }
            }
        }
    
        Collections.sort(num_list);
        
        if(num_list.size() == 0){
            return "-1";
        }else if(num_list.get(0) == 0 && num_list.get(num_list.size()-1) == 0){
            return "0";
        }
        
        
        StringBuffer sb = new StringBuffer();
        for(int i : num_list){
            sb.append(i);
        }
        return sb.reverse().toString();
    }
}