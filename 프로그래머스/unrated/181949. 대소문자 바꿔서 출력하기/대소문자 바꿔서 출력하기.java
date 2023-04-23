import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] aArr = a.toCharArray();
        for(int i = 0; i < a.length(); i++){
            if(aArr[i] > 96){
                aArr[i] -= 32;
            }else{
                aArr[i] += 32;
            }
         }
        System.out.println(aArr);
    }
}