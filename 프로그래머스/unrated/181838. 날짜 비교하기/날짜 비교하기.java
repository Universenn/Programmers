class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int sumDate1 = date1[0]*1000 + date1[1]*100 + date1[2];
        int sumDate2 = date2[0]*1000 + date2[1]*100 + date2[2];

        return sumDate1 >= sumDate2 ? 0 : 1;
    }
}