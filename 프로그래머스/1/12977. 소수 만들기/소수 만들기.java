import java.util.*;
class Solution {
    
    static boolean[] isPrime;
    
    public int solution(int[] nums) {
        int answer=0;
        isPrime = new boolean[3001];
        
        isPrime[0] = isPrime[1] = true;
        
        for(int i = 2; i <=Math.sqrt(3000); i++){
            if(!isPrime[i]){
                for(int j = i * i; j <= 3000; j += i){
                    isPrime[j] = true;
                }
            }
        }
        
        for(int i = 0; i < nums.length - 2; i ++){
            for(int j = i + 1; j < nums.length - 1; j ++){
                for(int k = j + 1; k < nums.length; k ++ ){
                    if(!isPrime[nums[i] + nums[j] + nums[k]]){
                        answer += 1;  
                    } 
                }
            }
        }

        return answer;
    }
}