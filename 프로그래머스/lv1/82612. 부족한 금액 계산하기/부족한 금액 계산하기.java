class Solution {
    public long solution(int price, int money, int count) {
        Long result = 0L;
        for (Long i = 1L; i <= count; i++) {
            result += price*i;
        }
        
        return result - money > 0 ? result - money : 0;
    }
}