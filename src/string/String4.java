package string;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char ss ;
        String s1 ="";
        for (int i = 0; i < s.length(); i++) {
            if((int)s.charAt(i) <=90 ){
                ss = (char) ((int)s.charAt(i) + 32);
                s1 +=ss;
            }
            else {
                ss = (char) ((int)s.charAt(i) - 32);
                s1 +=ss;
            }
        }
        System.out.println(s1);
    }
}//65-90  97-122
