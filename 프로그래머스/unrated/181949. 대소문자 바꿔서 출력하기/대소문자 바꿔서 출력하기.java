import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] aArr = a.toCharArray();
        String b = "";
        for(int i = 0; i < a.length(); i++){
            if(Character.isUpperCase(aArr[i])){
                b += Character.toLowerCase(aArr[i]);
            }else{
                b += Character.toUpperCase(aArr[i]);
            }
         }
        System.out.println(b);
    }
}