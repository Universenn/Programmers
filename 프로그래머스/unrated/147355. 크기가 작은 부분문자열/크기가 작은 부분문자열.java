class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i <= t.length() - p.length() ; i++){
            String temp = ""+t.substring(i, i + p.length());
            // System.out.println(temp);
            // int x = Integer.parseInt(temp);
            // int y = Integer.parseInt(p);
            // System.out.println(x + " " + y);
            if(Long.parseLong(temp) <= Long.parseLong(p)){
                answer ++;
                // System.out.println(answer);
            }
            // Integer.paseInt(p);
        }
        // System.out.println(answer);
        return answer;
    }
}