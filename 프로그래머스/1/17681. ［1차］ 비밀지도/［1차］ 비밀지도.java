class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
         String[] answer = new String[n];
        boolean[][] map = new boolean[n][n];


        for(int i = 0; i < n; i++){
            answer[i] = "";

            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);

            s1 = String.format("%"+n+"s", s1);
            s2 = String.format("%"+n+"s", s2);


            for(int j = 0; j < n; j++){
                if(s1.charAt(j) == '1' || s2.charAt(j) == '1'){
                    map[i][j] = true;
                }
            }
        }

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i] += map[i][j] ? "#" : " ";
            }
        }
        return answer;
    }
}