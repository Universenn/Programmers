class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        int[] nums = commonDivisor(number);

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] > limit ? power : nums[i];
            answer += nums[i];
        }
        return answer;
    }
   private static int[] commonDivisor(int number) {
        int[] nums = new int[number +1];
        for (int i = 1; i <= number; i++) {
            for(int j = 1; j <= Math.sqrt(i); j++){
                if(i % j == 0){ // 약수 중 작은 수 저장
                    nums[i]++;
                    if(i / j != j){ // 약수 중 큰 수 저장
                        nums[i]++;
                    }
                }
            }
        }
        return nums;
    }
}