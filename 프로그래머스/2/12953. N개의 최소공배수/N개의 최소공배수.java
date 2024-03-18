class Solution {
     public int solution(int[] arr) {
        int lcm = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (i == 0) {
                int gcd = gcd(arr[0], arr[i + 1]);
                lcm = (arr[0] * arr[i + 1]) / gcd;
            } else {
                int gcd = gcd(lcm, arr[i + 1]);
                lcm = (lcm * arr[i + 1]) / gcd;
            }
        }

        return lcm;
    }

    public int gcd(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        if(min == 0){
            return max;
        }

        return gcd(min, max%min);
    }
}