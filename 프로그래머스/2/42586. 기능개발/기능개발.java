import java.util.*;
class Solution {
    class Ps{
        int progresses;
        int speeds;

        public Ps(int progresses, int speeds) {
            this.progresses = progresses;
            this.speeds = speeds;
        }
    }
    public int[] solution(int[] progresses, int[] speeds) {
         ArrayList<Ps> list = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            list.add(new Ps(progresses[i], speeds[i]));
        }
        ArrayList<Integer> ps = new ArrayList<>();
        int countRemove = 0;
        while (!list.isEmpty()) {

            // 전체 다 더해준다.
            for (Ps p : list) {
                if (p.progresses < 100) {
                    p.progresses += p.speeds;
                }
            }

            // 한개 이상 있고 첫번째 인덱스가 100 이상이면 remove
            while (!list.isEmpty() && list.get(0).progresses >= 100){
                if (list.get(0).progresses >= 100) {
                    list.remove(0);
                    countRemove++;
                }
            }
            
            // 한개라도 삭제 되었으면 add 후 0으로 초기화
            if (countRemove > 0) {
                ps.add(countRemove);
                countRemove = 0;
            }
        }

        return ps.stream().mapToInt(Integer::intValue).toArray();
    }
}