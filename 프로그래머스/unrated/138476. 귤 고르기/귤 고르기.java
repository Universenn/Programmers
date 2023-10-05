import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int[] arr = new int[map.size()];

        int j = 0;
        for (int i : map.values()) {
            arr[j] = i;
            j++;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            k -= arr[arr.length - 1 - i];
            answer++;
            if (k <= 0) {
                break;
            }
        }


        return answer;
    }
}