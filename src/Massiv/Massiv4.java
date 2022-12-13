package Maasiv;

import java.util.Scanner;

//Berilgan massiv elementlarining yig’indisi va ko’paytmasini topadigan dastur tuzing

public class Massiv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        int S = 0 , P = 1;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            S +=a[i];
            P *=a[i];
        }
        System.out.println("Yig`indi: " + S +"\nKo`paytma: " + P);

    }

}
