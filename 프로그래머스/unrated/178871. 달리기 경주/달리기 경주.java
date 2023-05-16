import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
       String[] answer = new String[players.length];

        HashMap<String, Integer> hashRank = new HashMap<>();
        HashMap<Integer, String> hashPlayer = new HashMap<>();

        for(int i = 0; i < players.length; i++){
            hashPlayer.put(i, players[i]);
            hashRank.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            int playerRank = hashRank.get(callings[i]);
            String playerName = hashPlayer.get(playerRank);

            String frontPlayerName = hashPlayer.get(playerRank-1);

            hashRank.put(playerName, playerRank-1);
            hashRank.put(frontPlayerName, playerRank);

            hashPlayer.put(playerRank-1, playerName);
            hashPlayer.put(playerRank, frontPlayerName);
        }
        for (int i = 0; i < players.length; i++) {
            answer[i] = hashPlayer.get(i);
        }


        return answer;
    }
}