class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arrS = s.split(" ");
        int[] arrI = new int[arrS.length];
        for(int i = 0; i < arrS.length; i++){
            if(arrS[i].equals("Z")){
                arrI[i] = -1*Integer.parseInt(arrS[i-1]);
            }else{
                arrI[i] = Integer.parseInt(arrS[i]);
            }
            
            answer += arrI[i];
        }
        return answer;
    }
}