import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[10];
        Arrays.sort(numbers);
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i == numbers[j]){
                    arr[i]++;
                    break;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                answer += i;
            }
        }
        System.out.println(Arrays.toString(arr));
        
        return answer;
    }
}