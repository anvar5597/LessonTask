package string;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class String6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int cnt = 0;
        while (s1.length() > s2.length() && s1.contains(s2)){
            cnt++;
            s1 = s1.substring(s1.indexOf(s2)+s2.length());
        }
        System.out.println(cnt);
    }
}
