import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        HashMap<String, Integer> zisu = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> result = new HashMap<>();
        
        
        for(String friend : friends){
            zisu.put(friend, 0);
            result.put(friend, 0);
        }
    
        for(String gift : gifts){
            int i = 0;
            map.put(gift, map.getOrDefault(gift, 0) + 1);
            String[] g = gift.split(" ");
            zisu.put(g[0], zisu.get(g[0]) + 1);
            zisu.put(g[1], zisu.get(g[1]) - 1);
        }
        
        for(int i = 0; i < friends.length; i++){
            for(int j = i + 1; j < friends.length; j++){
                String from = friends[i];
                String target = friends[j];
                
                String fromTarget = from + " " + target;
                String targetFrom = target + " " + from;
                
                map.put(fromTarget, map.getOrDefault(fromTarget, 0));
                map.put(targetFrom, map.getOrDefault(targetFrom, 0));
                
                if(map.get(fromTarget) != map.get(targetFrom)){
                    if(map.get(fromTarget) > map.get(targetFrom)) result.put(from, result.get(from) + 1);
                    else result.put(target, result.get(target) + 1);
                }else{
                    if(zisu.get(from) == zisu.get(target)) continue;
                    else {
                        if(zisu.get(from) > zisu.get(target)) result.put(from, result.get(from) + 1);
                        else result.put(target, result.get(target) + 1);    
                    }
                }
            }
        }
        
        for(String friend : friends){
            answer = Math.max(answer ,result.get(friend));
        }
        return answer;
    }
}