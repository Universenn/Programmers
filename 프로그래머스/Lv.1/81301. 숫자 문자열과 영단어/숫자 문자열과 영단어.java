class Solution {
    public int solution(String s) {
        String[] numberE = {"zero", "one", "two", "three", "four" , "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < numberE.length; i++){
            s = s.replaceAll(numberE[i], i+"");
        }
        return Integer.parseInt(s);
    }
}