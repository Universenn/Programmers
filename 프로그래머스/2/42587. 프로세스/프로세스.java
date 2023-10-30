import java.util.ArrayList;

class Solution {
     class ProcessJob{

        int location;
        int priorities;

        public ProcessJob(int location, int priorities) {
            this.location = location;
            this.priorities = priorities;
        }
    }

    public int solution(int[] priorities, int location) {
         ArrayList<ProcessJob> list = new ArrayList<>();

        // class 를 만들어 index 값 과 prior 값을 저장
        for (int i = 0; i < priorities.length; i++) {
            list.add(new ProcessJob(i, priorities[i]));
        }

        int temp = 0;
        while (!list.isEmpty()) {
            ProcessJob processJob = list.remove(0);
            // 만약 anyMatch 나 이외의 매치를 전부 비교해서 우선순위가 높은게 있다면?
            if (list.stream().anyMatch(otherJob -> processJob.priorities < otherJob.priorities)) {
                list.add(processJob);
            } else {
                temp++;
                if (processJob.location == location)
                    break;
            }
        }
        return temp;
    }
}