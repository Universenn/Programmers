class Solution {
    int[] numbers;
    int target;
    int answer;

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;
        bfs(0,0);
        return answer;
    }
    void bfs(int index, int sum){
        // 1. 탈출로직
        if(index == numbers.length){
            if(sum == target) answer++;
            return;
        }
        // 2. 수행로직
        bfs(index + 1, sum + numbers[index]);
        bfs(index + 1, sum - numbers[index]);
    }
}