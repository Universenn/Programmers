class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                bfs(computers, i, visited);
                answer++;
            }
        }
        
        return answer;
    }
    boolean[] bfs(int[][] computers, int i, boolean[] visited){
        visited[i] = true;
        
        for(int j = 0; j < computers.length; j++){
            if(i != j && !visited[j] && computers[i][j] == 1){
                visited = bfs(computers, j, visited);
            }
        }
        return visited;
        
    }
}