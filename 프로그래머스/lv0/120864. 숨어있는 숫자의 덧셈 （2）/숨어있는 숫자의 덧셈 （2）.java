class Solution {
    public int solution(String my_String){
        int answer = 0;
        my_String =my_String.toUpperCase();
        String[] arr = my_String.replaceAll("[A-Z]", "@").split("@");

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}