package string;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(s1.contains(s2));
    }
}
