class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenNum = "";
        String oddNum = "";
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                evenNum += num_list[i];          
            }else{
                oddNum += num_list[i];
            }  
        }
        answer = Integer.parseInt(evenNum) + Integer.parseInt(oddNum);
        return answer;
    }
}