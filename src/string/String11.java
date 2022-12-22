package string;

import java.util.Scanner;
//        S1, S2 va S3 satrlari berilgan.
//        S1 satrida oxirgi uchragan S2 satrini
//        S3 satriga o'zgartiruvchi programma tuzilsin.
public class String11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 =scanner.nextLine();
        System.out.println(s1.substring(0,s1.lastIndexOf(s2)) + s3 );

    }
}
