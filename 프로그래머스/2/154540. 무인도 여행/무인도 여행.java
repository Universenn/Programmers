import java.util.*;
class Solution {
    ArrayList<List> list = new ArrayList<>();
    boolean[][] visited;
    
    public int[] solution(String[] maps) {
        int[] answer = {};
        visited = new boolean[maps.length][maps[0].length()];
        for(int j = 0; j < visited.length; j++){
            for(int i = 0; i < visited[j].length; i++){
                System.out.print(visited[j][i]);
            }
            System.out.println();
        }
        
        
        // X == y++
        // y == maps.lengt() 이면 x++ y==0;
        // maps == length, y == maps.length == 이면 break;
//         for(int i = 0; i < mpas.length; i++){
//             for(int j = 0; j < maps[i].length(); j++){
                
//             }
//         }
        
        return answer;
    }
    void bfs(int x,int y, String maps){
        
//         if(maps[x].charAt(y) == 'X'){
            
//         }
    }
}