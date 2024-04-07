class Solution {
    public int[] solution(int brown, int yellow) {
        int height = 3; int width;
        int entire = brown + yellow;
        while(true){
            if(entire % height == 0){
                width = entire / height;
                if((width - 2) * (height - 2) == yellow){
                    return new int[]{width, height};
                }
            }
            height++;
        }
    }
}
