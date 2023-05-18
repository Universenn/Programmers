class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        // String[] answer = new String[my_string.length()];
        for(int i = my_string.length()-1; i >= 0; i--){
            if(my_string.substring(i).equals(is_suffix)){
                answer = 1;
            };
        }
        
        return answer;
    }
}