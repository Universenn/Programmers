class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int bigger = sides[0] > sides[1] ? sides[0] : sides[1];
        int smaller = sides[0] > sides[1] ? sides[1] : sides[0];
        for (int i = 0; i < bigger+smaller; i++) {
            if (bigger < smaller + i) {
                answer++;
            }else{
             if (bigger < i && i < bigger+smaller) {
                    answer++;
               }
            }
        }

        return answer;
    }
}