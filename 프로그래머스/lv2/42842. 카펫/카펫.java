class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int a = brown/2;

        int temp = Integer.MAX_VALUE;


        for (int i = 3; i < a; i++) {
            // 나눈 값
            if ((brown + yellow) % i == 0) {

                int b = (brown + yellow) / i;
                int tempX = Math.abs(i - b);
                int x = (b - 2) * (i - 2);
                if (temp > tempX && x % yellow == 0) {
                    answer[0] = Math.max(i, b);
                    answer[1] = Math.min(i, b);
                    temp = tempX;
                }
                if (temp < tempX) {
                    break;
                }
            }

        }

        return answer;
    }
}