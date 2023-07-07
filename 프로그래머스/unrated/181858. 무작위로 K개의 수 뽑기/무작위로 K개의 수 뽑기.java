import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : arr) {
            if (!seenNumbers.contains(num)) {
                result.add(num);
                seenNumbers.add(num);
                if (result.size() == k) {
                    break;
                }
            }
        }

        while (result.size() < k) {
            result.add(-1);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}