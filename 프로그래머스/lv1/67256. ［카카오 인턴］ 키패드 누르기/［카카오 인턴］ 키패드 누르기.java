class Solution {
     public String solution(int[] numbers, String hand) {
        String answer = "";
        hand = hand.equals("right") ? "R" : "L";
        int left = 10;
        int right = 12;
        int[][] keypad = new int[4][3];   
        for(int i = 0; i < numbers.length; i++){
            keypad = new int[4][3];
            int temp = numbers[i] == 0 ? 11 : numbers[i];
            int leftX = (left - 1) / 3;
            int leftY = (left - 1) % 3;
            int rightX = (right - 1) / 3;
            int rightY = (right - 1) % 3;

            keypad[leftX][leftY] = 1;
            keypad[rightX][rightY] = 1;
            if(temp == 1 || temp == 4 || temp == 7){
                answer += "L";
                left = temp;
            }else if(temp == 3 || temp == 6 || temp == 9){
                answer += "R";
                right = temp;
            }else if(temp == 2 || temp == 5 || temp == 8 || temp == 11){
                int pushX = (temp - 1) / 3;
                int pushY = (temp - 1) % 3;
                int absL = Math.abs(pushX - leftX) + Math.abs(pushY - leftY);
                int absR = Math.abs(pushX - rightX) + Math.abs(pushY - rightY);
                if (absR > absL) {
                    answer += "L";
                    left = temp;
                } else if (absR == absL) {
                    answer += hand;
                    if (hand.equals("R")) {
                        right = temp;
                    } else {
                        left = temp;
                    }
                } else {
                    answer += "R";
                    right = temp;
                }
            }
        }
        return answer;
    }
}