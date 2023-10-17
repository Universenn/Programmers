import java.util.*;

class Solution {
        public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parking = new HashMap<>();
        Map<String, Boolean> inOut = new HashMap<>();

        for (String record : records) {
            String[] split = record.split(" ");
            if (split[2].equals("IN")) {
                inOut.put(split[1], true);
            } else {
                inOut.put(split[1], false);
            }
            String NumberPlusInOut = split[1] + split[2];
            parking.put(NumberPlusInOut, parking.getOrDefault(NumberPlusInOut, 0) + timeMinus(split[0]));
        }
        String[] numberArr = new String[inOut.size()];
        int temp = 0;
        for (String s : inOut.keySet()) {
            if (inOut.get(s)) {
                String numberOut = s + "OUT";
                parking.put(numberOut, parking.getOrDefault(numberOut, 0) + 1439);
            }
            numberArr[temp] = s;
            temp++;
        }
        int[] answer = new int[inOut.size()];
        Arrays.sort(numberArr);

        for (int i = 0; i < answer.length; i++) {
            int time = parking.get(numberArr[i] + "OUT") - parking.get(numberArr[i] + "IN");
            if (time <= fees[0]) {
                answer[i] = fees[1];
            } else {
                int timeMinus = time - fees[0];
                int addCharge = timeMinus % fees[2] == 0 ? timeMinus / fees[2] : timeMinus / fees[2] + 1;
                answer[i] = fees[1] + addCharge * fees[3];
            }
        }
        return answer;
    }
    public int timeMinus(String str) {
        int time = 0;
        time += Integer.parseInt(str.split(":")[0])* 60 ;
        time += Integer.parseInt(str.split(":")[1]) ;

        return time;
    }
}