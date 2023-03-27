class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int Ibin1 = Integer.parseInt(bin1, 2);
        int Ibin2 = Integer.parseInt(bin2, 2);
        
        answer = Integer.toBinaryString(Ibin1+Ibin2);
        
        return answer;
    }
}