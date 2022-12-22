package string;

import java.util.Scanner;

public class String10 {
//    S1, S2 va S3 satrlari berilgan.
//    S1 satrida birinchi uchragan S2 satrini
//    S3 satriga o'zgartiruvchi programma tuzilsin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 =scanner.nextLine();
        System.out.println(s1.substring(0,s1.indexOf(s2)) + s3 + s1.substring(s1.indexOf(s2) + s2.length()));

    }

}
