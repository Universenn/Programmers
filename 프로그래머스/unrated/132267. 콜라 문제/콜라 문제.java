class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int lastCoke = 0;
        while (n >= a) {
            answer = answer + ((n / a) * b);
            lastCoke = n % a;
            n = n / a * b + lastCoke;
            System.out.println(n);
        }
        return answer;
    }
}