import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
		int sum = 0;
		int answer = 0; 

		for(int i = 0; i < truck_weights.length; i++) {
			int truck = truck_weights[i];

			while(true) {
				if(queue.isEmpty()) { 
					queue.add(truck);
					sum += truck;
					answer++;
					break;
				} else if(queue.size() == bridge_length) {
					sum -= queue.poll();
				} else  { 
                    answer++;
					if(sum + truck <= weight) {
						queue.add(truck);
						sum += truck;
						break;
					} else {
						queue.add(0);
					}
				}
			}
		}
		return answer + bridge_length; 
    }
}