package massiv;

import java.util.Scanner;

//Massiv ichida berilgan son bor yo’qligini aniqlaydigan dastur tuzing.

public class Massiv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int son = scanner.nextInt();
        boolean ss = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == son){
             ss =true;
            }
        }
        if (ss){
            System.out.println(son + " massiv ichida bor");
        }else {
            System.out.println("Bunday son yo`q");
        }

    }
}
