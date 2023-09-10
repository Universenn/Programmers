import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 경우의수를 다 뽑는다.
        ArrayList<Integer> numbersCase = getIntegers(nums);

        // 오름 차순 한뒤 max 까지 에라토스테네스 체로 소수를 판별한다.
        int max = getMax(nums);
        boolean[] primeArr = primeArr(max);

        // 경우의 수와 판별한 소수를 비교해서 count 해준다.
        for (Integer num : numbersCase) {
            if(!primeArr[num]) answer++;
        }
        
        return answer;
    }

    private static ArrayList<Integer> getIntegers(int[] nums) {
        ArrayList<Integer> numbersCase = new ArrayList<>();
        for (int i = 0; i <= nums.length-3; i++) {
            for (int j = i+1; j <= nums.length-2; j++) {
                for (int k = j+1; k <= nums.length-1; k++) {
                    numbersCase.add(nums[i]+ nums[j]+ nums[k]);
                }
            }
        }
        return numbersCase;
    }

    private static int getMax(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1] + nums[nums.length-2] + nums[nums.length-3];
        return max;
    }

    private static boolean[] primeArr(int num) {
        boolean[] prime = new boolean[num+1];
        prime[0] = prime[1] = true;


        for (int i = 2; i * i <= num; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= num; j+=i) {
                    prime[j] = true;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (!prime[i]) list.add(i);
        }
        return prime;
    }
}