class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxTime = attacks[attacks.length-1][0];
        int bandTime = 0;
        int attX = 0;
        int CHealth = health;
        for(int i = 1; i <= maxTime; i++){
            if(i == attacks[attX][0]){
                CHealth -= attacks[attX][1];
                bandTime = 0;
                attX++;
            }else{
                bandTime++;
                CHealth += bandage[1];
                if(bandTime == bandage[0]){
                    CHealth += bandage[2];
                    bandTime = 0;
                }
            }

            if(CHealth <= 0) return -1;
            if(CHealth > health) CHealth = health;
        }
        return CHealth;
    }
    
}