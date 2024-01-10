class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int xMax = 0;
        int yMax = 0;
        for(int i =0; i < sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
               xMax = Math.max(xMax, sizes[i][0]);
               yMax = Math.max(yMax, sizes[i][1]);
            }else{
               yMax = Math.max(yMax, sizes[i][0]);
               xMax = Math.max(xMax, sizes[i][1]);
            }
        }
        return xMax* yMax;
    }
}