class Solution {
    private static int answer = 0;
    public int solution(int[] numbers, int target) {
        bfs(0, 0, numbers, target);        
        return answer;
    }
    static void bfs(int n, int sum, int[] numbers, int target){
        if(n == numbers.length){
            if(target == sum){
                answer++;
            }
            return;
        }
        bfs(n + 1, sum + numbers[n], numbers, target);
        bfs(n + 1, sum - numbers[n], numbers, target);
    }
}