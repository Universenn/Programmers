class Solution {
    public boolean solution(String s) {
        String temp = s.replaceAll("[0-9]","");
        return (s.length() == 4 || s.length() == 6) && temp.equals("") ? true : false;
    }
}