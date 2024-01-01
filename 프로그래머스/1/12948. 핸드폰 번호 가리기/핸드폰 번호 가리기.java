class Solution {
    public String solution(String phone_number) {
        int pn_len = phone_number.length();
        return "*".repeat(pn_len-4) + phone_number.substring(pn_len-4,pn_len);
    }
}