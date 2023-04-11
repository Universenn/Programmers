class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int xMax1 = Math.max(dots[0][0], dots[1][0]);
        int xMax2 = Math.max(dots[2][0], dots[3][0]);
        int xMax = Math.max(xMax1, xMax2);
        
        int xMin1 = Math.min(dots[0][0], dots[1][0]);
        int xMin2 = Math.min(dots[2][0], dots[3][0]);
        int xMin = Math.min(xMin1, xMin2);
        
        int yMax1 = Math.max(dots[0][1], dots[1][1]);
        int yMax2 = Math.max(dots[2][1], dots[3][1]);
        int yMax = Math.max(yMax1, yMax2);
        
        int yMin1 = Math.min(dots[0][1], dots[1][1]);
        int yMin2 = Math.min(dots[2][1], dots[3][1]);
        int yMin = Math.min(yMin1, yMin2);
        
        answer = (xMax-xMin) * (yMax-yMin);
        
        return answer;
    }
}