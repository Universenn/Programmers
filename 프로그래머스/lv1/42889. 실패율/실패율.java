import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 가장 큰값 + 1
        double[] rate = new double[N+2];

        for (int i = 0; i < stages.length; i++) {
            rate[stages[i]]++;
        }

        double user = stages.length;

        for (int i = 0; i < rate.length; i++) {
            if (rate[i] != 0) {
                double temp = rate[i];
                rate[i] =( rate[i] / user )* 100;
                user -= temp;
            }
        }



        int[] arr = new int[N];

        double[] copyOfRange = Arrays.copyOfRange(rate, 1, rate.length - 1);


        for (int i = 0; i < rate.length; i++) {

        }

        StringBuilder sb = new StringBuilder();

        Arrays.sort(copyOfRange);

        double[] doubles = new double[copyOfRange.length];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = copyOfRange[doubles.length-i-1];
        }

        int[] answer = new int[N];

        for (int i = 0; i < doubles.length; i++) {
            for (int j = 1; j < rate.length-1; j++) {
                if (doubles[i] == rate[j]) {
                    answer[i] = j;
                    rate[j] += 1;
                    break;
                }
            }
        }


        return answer;
    }
}