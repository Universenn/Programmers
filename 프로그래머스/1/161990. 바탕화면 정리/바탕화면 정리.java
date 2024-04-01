class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int lux = 50;
        int luy = 0;
        int rux = 50;
        int ruy = 0;
        
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[0].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    lux = Math.min(lux, i);
                    luy = Math.max(luy, i+1);
                    rux = Math.min(rux, j);
                    ruy = Math.max(ruy, j+1);
                }
            }
        }
        
        return new int[]{lux, rux, luy, ruy};
    }
}