import java.util.*;

class Solution {
      public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);

        int j = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (i == indices[j]) {
                if (j < indices.length-1) {
                    j++;
                }
            } else {
                answer += my_string.charAt(i);
            }

        }

        System.out.println(answer);
        return answer;
    }
}