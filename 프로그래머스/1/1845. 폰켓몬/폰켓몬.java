import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        Set<Integer> numSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            numSet.add(nums[i]);
        }
        if(numSet.size() <= nums.length/2){
            answer = numSet.size();
        }
        return answer;
    }
}