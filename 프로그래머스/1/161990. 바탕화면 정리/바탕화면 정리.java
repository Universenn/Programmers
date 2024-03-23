class Solution {
    public int[] solution(String[] wallpaper){
        int[] answer = new int[4];

        // lux
        for(int i = 0; i < wallpaper.length; i++){
            if(wallpaper[i].contains("#")){
                answer[0] = i;
                break;
            }
        }

        // rdx
        for(int i = wallpaper.length-1; i >= 0; i--){
            if(wallpaper[i].contains("#")){
                answer[2] = i+1;
                break;
            }
        }

        // luy rdy
        answer[1] = 100;
        answer[3] = 0;

        for(int i = 0; i < wallpaper.length; i++){
            int index = wallpaper[i].indexOf("#");
            if (index != -1) {
                answer[1] = Math.min(answer[1], index);
                int indexMax = wallpaper[i].lastIndexOf("#");
                if (index != indexMax) {
                    answer[3] = Math.max(answer[3], indexMax+1);
                } else {
                    answer[3] = Math.max(answer[3], index+1);
                }
            }
        }

        return answer;
    }
}