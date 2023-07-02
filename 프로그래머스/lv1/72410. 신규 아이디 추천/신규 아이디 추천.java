class Solution {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();
        // 2단계
        new_id = new_id.replaceAll("[^a-z0-9-_.]","");

        // 3단계
        new_id = new_id.replaceAll("[.]+",".");
        new_id = new_id.equals(".") ? "" : new_id;

        //4
        new_id = new_id.replaceAll("^[.]|[.]$", "");

        // 5단계
        new_id = new_id.equals("") ? "a" : new_id;

        // 6단계
        new_id = new_id.length() >= 16 ? startLastPoint(new_id.substring(0, 15)) : new_id;


        // 7단계
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length()-1);
        }
        return new_id;
    }
        public String startLastPoint(String new_id){
        new_id = new_id.charAt(0) == '.' ? new_id.substring(1, new_id.length() - 1) : new_id;
        new_id = new_id.charAt(new_id.length() - 1) == '.' ? new_id.substring(0, new_id.length() - 1) : new_id;

        return new_id;
    }
}