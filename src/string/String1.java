package string;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = s1 + s2;
        System.out.println(s3);
    }
}