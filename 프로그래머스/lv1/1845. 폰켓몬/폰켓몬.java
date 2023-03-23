import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length / 2;
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(integers));

        if (length <= set.size()) {
            answer = length;
        } else {
            answer = set.size();
        }

        return answer;
    }
}