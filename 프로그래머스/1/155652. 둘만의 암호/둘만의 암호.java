class Solution {
    public String solution(String s, String skip, int index) {
        StringBuffer sb = new StringBuffer();
            
        for(char c : s.toCharArray()){
            int temp = 0;
            while(temp < index){
                c = (c == 'z') ? 'a' : (char)(c + 1);
                temp += skip.contains(String.valueOf(c)) ? 0 : 1;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}