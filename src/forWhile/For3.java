package forWhile;

import java.util.Scanner;
//0 dan kiritilgan songacha bo’lgan butun sonlar yig’indisini hisoblash dasturini tuzing


public class For3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x  = scanner.nextInt();
       int S = 0;
        for (int i = 0; i <= x; i++) {
        S+=i;
        }
        System.out.println(S);
    }
}
