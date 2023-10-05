import java.util.*;
class Solution {
    public int solution(int[] elements) {

        int[] elements2 = new int[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {
            elements2[i] = elements[i];
            elements2[elements.length + i] = elements[i];
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            int temp = 0;
            int temp2 = 0;
            for (int j = 0; j < elements.length + i; j++) {

                if (i == 0) {
                    set.add(elements2[j]);
                }else{
                    sum += elements2[j];
                    temp++;
                    if (temp == i + 1) {
                        temp2++;
                        set.add(sum);
                        sum = elements2[temp2];
                        j = temp2;
                        temp = 1;
                    }
                }
            }
        }
        return set.size();
    }
}