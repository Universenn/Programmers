class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String dartResultCopy = dartResult;
        dartResultCopy = dartResultCopy.replaceAll("[*,#]", "");
        dartResultCopy = dartResultCopy.replaceAll("[A-Z]",",");
        String[] nums = dartResultCopy.split(",");
        String[] strings = dartResult.split("[0-9]");
        int[] sumArr = new int[3];
        int temp = 0;
        for (int i = 0; i < strings.length; i++) {

            if (!strings[i].equals("")) {
                if (strings[i].contains("S")) {
                    sumArr[temp] = Integer.parseInt(nums[temp]);
                    extracted(strings, sumArr, temp, i);
                }
                if (strings[i].contains("D")) {
                    sumArr[temp] = (int) Math.pow(Integer.parseInt(nums[temp]),2);
                    extracted(strings, sumArr, temp, i);
                }
                if (strings[i].contains("T")) {
                    sumArr[temp] = (int) Math.pow(Integer.parseInt(nums[temp]),3);
                    extracted(strings, sumArr, temp, i);
                }
                temp++;
            }

        }
        for (int i : sumArr) {
            answer += i;
        }
        return answer;
    }

    private static void extracted(String[] strings, int[] sumArr, int temp, int i) {
        if (strings[i].contains("#")) {
            sumArr[temp] *= -1;
        }
        if (strings[i].contains("*")) {
            if (temp > 0) {
                sumArr[temp -1] *= 2;
            }
            sumArr[temp] *= 2;
        }
    }

}