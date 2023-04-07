class Solution {
    public int solution(String my_String){
        int answer = 0;
        my_String =my_String.toUpperCase();
        String[] arr_my_string = {"A","B","C","D","E","F","G","H","I","J","K","L","N","M","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for (int i = 0; i < arr_my_string.length; i++) {
            my_String = my_String.replaceAll(arr_my_string[i], "@");
        }
        String[] arr = my_String.split("@");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}