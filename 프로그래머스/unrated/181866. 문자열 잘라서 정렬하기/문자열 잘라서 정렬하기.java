import java.util.*; 

class Solution {
   public String[] solution(String myString) {
        String[] result = myString.split("x");
        Arrays.sort(result);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            if (!result[i].equals("")) {
                list.add(result[i]);
            }
        }
        System.out.println(Arrays.toString(result));

        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}