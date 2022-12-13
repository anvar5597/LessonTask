package forWhile;

import java.util.Scanner;
//Ekranga 5 sonining karra jadvalini chiqazing
//        5x1=5
//        5x2=10
//        5x3=15
//        ............
//        5*10=50

public class For1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "" + "=" + n*i);
        }

    }

}
