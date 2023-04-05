class Solution {
    public int solution(String[] spell, String[] dic) {
       int answer = 2;
        int[] check = new int[dic.length];
        for (int i = 0; i < dic.length; i++) {
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    check[i]++;
                }
            }
            if (check[i] == spell.length) {
                answer = 1;
            }
        }
        return answer;
    }
}