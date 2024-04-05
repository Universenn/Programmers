class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] sArr = s.split(" ");
        for(String s1 : sArr){
            max = Math.max(Integer.parseInt(s1), max);
            min = Math.min(Integer.parseInt(s1), min);
        }
        return min + " " + max;
    }
}