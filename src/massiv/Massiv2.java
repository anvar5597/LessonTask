package massiv;

import java.util.Scanner;

//Berilgan massivda nechta juft son borligini aniqlaydigan dastur tuzing

public class Massiv2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if(a[i] % 2 == 0 ){
                cnt++;
            }
        }
        System.out.println(cnt);

    }

}
