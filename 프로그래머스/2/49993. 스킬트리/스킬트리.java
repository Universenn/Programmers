class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String str : skill_trees){
            int count = str.length();
            int skillCA = 0;
            for(char ch : str.toCharArray()){
                // 스킬 트리에 없는 스킬이라면 그냥 count--;
                if(skill.indexOf(ch) == -1){
                    count--;
                }else if(skill.charAt(skillCA) != ch){
                    break;
                }else if(skill.charAt(skillCA) == ch){
                    count--;
                    skillCA++;
                }
                if(0 == count)
                    answer++;

            }
        }
        
        
        return answer;
    }
}