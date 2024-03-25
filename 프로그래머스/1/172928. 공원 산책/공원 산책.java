import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        // 2차원 배열 [열][행]
        // 2차원 배열 [길이][높이]
        int[][] parkMap = new int[park.length][park[0].length()];

        int x = 0;
        int xLength = park[0].length();
        int y = 0;
        int yLength = park.length;
        System.out.println("xLength = " + xLength);

        for(int i = 0; i < parkMap.length; i++){
            for(int j = 0; j < parkMap[i].length; j++){
                char c = park[i].charAt(j);
                if(c == 'S') {
                    parkMap[i][j] = 1;
                    x = j;
                    y = i;
                }
                else if(c == 'O') parkMap[i][j] = 0;
                else if(c == 'X') parkMap[i][j] = 2;
            }
        }
//        System.out.println("x = "+ x);
//        System.out.println("y = "+ y);

        for(int[] pM : parkMap){
//            System.out.println(Arrays.toString(pM));
        }

        for(String r : routes){
            String[] rSplit = r.split(" ");
            int xTemp = x;
            int yTemp = y;
            int times = Integer.parseInt(rSplit[1]);
            for(int i = 0; i < times; i++){
                if(rSplit[0].equals("E")){
                    x++;
                    if(x == xLength || parkMap[y][x] == 2){
                        x = xTemp;
                        break;
                    }
                }
                else if(rSplit[0].equals("W")){
                    x--;
                    if(x < 0 || parkMap[y][x] == 2){
                        x = xTemp;
                        break;
                    }
                }
                else if(rSplit[0].equals("N")){
                    y--;
                    if(y < 0 || parkMap[y][x] == 2){
                        y = yTemp;
                        break;
                    }
                }

                else if(rSplit[0].equals("S")){
                    y++;
                    if(y == yLength || parkMap[y][x] == 2){
                        y = yTemp;
                        break;
                    }
                }

//                System.out.println("x = "+ x);
//                System.out.println("y = "+ y);
            }

        }
        answer[0] = y;
        answer[1] = x;
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);

        return answer;
    }
}
// EE SS W
// 