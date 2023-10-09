import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
       Queue<String> caches = new LinkedList<>();
        int answer = 0;

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (String city : cities) {
            String cityLowerCase = city.toLowerCase();
            if (caches.contains(cityLowerCase)) { 
                caches.remove(cityLowerCase); 
                caches.offer(cityLowerCase);
                answer++;
            } else {
                if (caches.size() < cacheSize) {
                    caches.offer(cityLowerCase);
                } else {
                    caches.poll();
                    caches.offer(cityLowerCase);
                }
                answer += 5;
            }
        }
        return answer;
    }
}