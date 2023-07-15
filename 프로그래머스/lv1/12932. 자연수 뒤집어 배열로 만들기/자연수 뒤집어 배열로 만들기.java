class Solution {
    public int[] solution(long n) {
        
        StringBuffer sb = new StringBuffer();
        char[] c = sb.append(n).reverse().toString().toCharArray();
        int[] answer = new int[c.length];
        for(int i = 0; i < c.length; i++){
            answer[i] = c[i]-48;
        }
        
        
        
        return answer;
    }
}