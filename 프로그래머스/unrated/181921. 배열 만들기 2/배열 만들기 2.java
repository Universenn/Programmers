import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();

        for (int i = l; i <= r; i++) {
            if (isZeroOrFive(i)) {
                resultList.add(i);
            }
        }

        if (resultList.isEmpty()) {
            return new int[]{-1};
        } else {
            Collections.sort(resultList);
            int[] result = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                result[i] = resultList.get(i);
            }
            return result;
        }
    }

    private boolean isZeroOrFive(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}