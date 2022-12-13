package massiv;

import java.util.Scanner;

//Massiv ichida berilgan son bor yo’qligini aniqlaydigan dastur tuzing.
public class Masssiv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int son = scanner.nextInt();

        if (exists(son, a)) {
            System.out.println(son + " soni massivda mavjud");
        } else {
            System.out.println(son + " soni massivda mavjud emas");
        }
    }


    public static boolean exists(int number, int[] array) {
        for (int j : array) {
            if (j == number)
                return true;
        }
        return false;
    }
}
