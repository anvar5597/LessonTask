package string;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder s1 = new StringBuilder();
            s1.append(scanner.nextLine());
        System.out.println(s1.reverse());
    }
}
