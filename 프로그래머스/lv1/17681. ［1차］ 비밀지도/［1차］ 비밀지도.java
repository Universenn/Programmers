import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] map1 = new String[arr1.length];
        String[] map2 = new String[arr2.length];
        for(int i = 0; i < map1.length; i++){
            map1[i] = Integer.toBinaryString(arr1[i]);
            map2[i] = Integer.toBinaryString(arr2[i]);
        }


        int[][] mapArr1 = new int[n][n];
        int[][] mapArr2 = new int[n][n];

        System.out.println(map1[0].charAt(1) == '1');
        for (int i = 0; i < mapArr1.length; i++) {
            for (int j = n - map1[i].length(), temp = 0; j < mapArr1[i].length; j++, temp++) {
                if (map1[i].charAt(temp) == '1') {
                    mapArr1[i][j] = 1;
                } else {
                    mapArr1[i][j] = 0;
                }
            }
            for (int k = n - map2[i].length(), temp = 0; k < mapArr2[i].length; k++, temp++) {
                if (map2[i].charAt(temp) == '1') {
                    mapArr2[i][k] = 1;
                } else {
                    mapArr2[i][k] = 0;
                }
            }
        }
        for (int i = 0; i < mapArr1.length; i++) {
            for (int j = 0; j < mapArr1[i].length; j++) {
                if (mapArr1[i][j] == 1 || mapArr2[i][j] == 1) {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
            answer[i] = answer[i].replace("null", "");
        }

        return answer;
    }
}