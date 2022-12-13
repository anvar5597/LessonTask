package booleanTask;

import java.util.Scanner;

public class Bolean1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n >= 0) ? "A musbat son" : "A musbat emas");
    }
}
