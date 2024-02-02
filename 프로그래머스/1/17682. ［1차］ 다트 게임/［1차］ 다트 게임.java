import java.util.*;
class Solution {
    public int solution(String dartResult) {
       int answer = 0;
        String[] numbers = dartResult.replaceAll("[S D T * #]", " ").trim().split("\\s+");
        String[] area = dartResult.replaceAll("[0-9]", " ").trim().split("\\s+");

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            // 점수
            int number = Integer.parseInt(numbers[i]);
            
            // option 이 있는지 * # 
            String a = area[i];
            number = getNumber(number, a);

            // 점수 두배 및 마이너스
            if (a.length() == 2) {

                // number 두배
                if (a.charAt(1) == '*'){
                    number *= 2;
                    // 전에 점수가 있다면 두배
                    if (!stack.isEmpty())
                        stack.push(stack.pop() * 2);
                }
                // number 마이너스
                else if (a.charAt(1) == '#')
                    number *= -1;

            }
            stack.add(number);
        }
        return stack.stream().mapToInt(Integer::intValue).sum();
    }

    private static int getNumber(int number, String a) {
        if (a.charAt(0) == 'S') return (int) Math.pow(number, 1);
        else if (a.charAt(0) == 'D') return (int) Math.pow(number, 2);
        else return (int) Math.pow(number, 3);
    }
}