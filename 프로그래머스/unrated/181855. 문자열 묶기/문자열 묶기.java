class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[31];
        int answer = 0;
        for(int i = 0; i < strArr.length; i++){
             arr[strArr[i].length()]++;
        }
        for(int i= 0; i < arr.length; i++){
            if(answer < arr[i]){
                answer = arr[i];
            }
        }
        return answer;
    }
}