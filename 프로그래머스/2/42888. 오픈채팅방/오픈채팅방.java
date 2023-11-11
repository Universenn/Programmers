import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        // String[] answer = new int[record.length];
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        for(String str : record){
            String[] arr = str.split(" ");
            if(arr[0].equals("Enter")){
                map.put(arr[1], arr[2]);
            }else if(arr[0].equals("Change")){
                map.put(arr[1], arr[2]);
            }
        }
        
        for(int i = 0; i < record.length; i++){
            String[] arr = record[i].split(" ");
            if(arr[0].equals("Enter")){
                list.add(map.get(arr[1]) + "님이 들어왔습니다.");
            }else if(arr[0].equals("Leave")){
                list.add(map.get(arr[1]) + "님이 나갔습니다.");
            }
        }
        
        return list.toArray(new String[0]);
    }
}