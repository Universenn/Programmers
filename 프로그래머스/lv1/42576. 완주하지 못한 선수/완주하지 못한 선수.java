import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        // putIfAbsent 존재하는 경우, value 값 반환
        for (String str : participant) {
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1); //( 없으면 디폴트 값이 0) 값  + 1 ;
        }
        for (String str : completion) {
            hashMap.put(str, hashMap.get(str) - 1); //( 없으면 디폴트 값이 0) 값  + 1 ;
        }


        for (String s : hashMap.keySet()) {
            if (hashMap.get(s) != 0) {
                answer = s;
            }
        }

        return answer;
    }
}