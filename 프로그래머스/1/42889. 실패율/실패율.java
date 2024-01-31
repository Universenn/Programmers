import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> failureRates = new HashMap<>();

        // 스테이지별 실패율 계산
        for (int stage = 1; stage <= N; stage++) {
            int totalPlayers = 0;
            int notClearedPlayers = 0;

            for (int playerStage : stages) {
                if (playerStage >= stage) {
                    totalPlayers++;
                    if (playerStage == stage) {
                        notClearedPlayers++;
                    }
                }
            }

            double failureRate = (totalPlayers == 0) ? 0 : (double) notClearedPlayers / totalPlayers;
            failureRates.put(stage, failureRate);
        }

        // 실패율을 기준으로 내림차순 정렬
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(failureRates.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // 정렬된 스테이지 번호를 배열에 저장
        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).getKey();
        }

        return answer;
    }
}