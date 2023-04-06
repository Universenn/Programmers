class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int bigger = sides[0] > sides[1] ? sides[0] : sides[1];
        int smaller = sides[0] > sides[1] ? sides[1] : sides[0];

        int a = 0;
        // 첫번째 제일 큰수가 sides 에 있을때 같아도 안됨
        // bigger(6)  < smaller(3) + (4,5,6)
        for (int i = 0; i <= bigger; i++) {
            if (bigger < smaller + i) {
                System.out.println(i);
                answer++;
            }
        }

        // 미지의 수가 제일 큰 수 일때
        // ?6<(7,8)<9 < bigger(6) + smaller(3)
        for (int i = bigger; i <= bigger+smaller; i++) {
            if (bigger < i && i < bigger+smaller) {
                System.out.println(i);
                answer++;
            }
        }

        return answer;
    }
}