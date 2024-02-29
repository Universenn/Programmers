class Solution {
    public int solution(int[][] sizes) {
        int WMax = 0; int HMax = 0;
        for(int[] size : sizes){
            WMax = Math.max(WMax, Math.max(size[0], size[1]));
            HMax = Math.max(HMax, Math.min(size[0], size[1]));
        }
        return WMax * HMax;
    }
}