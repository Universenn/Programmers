import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
                 int answer = 0;
        Boolean[] boatP = new Boolean[people.length];
        Arrays.fill(boatP, false);
        Arrays.sort(people);
        int temp = 0;
        for(int i = 0; i < people.length; i++){
            int last = people.length - 1 - i;
            if(!boatP[last]){
                answer++; // 보트 하나 띄우기
                boatP[last] = true; // 보트 탑승
                if(people[last] + people[temp] <= limit){
                    boatP[temp] = true;
                    temp++;
                }
            }
        }
        return answer;
    }

}