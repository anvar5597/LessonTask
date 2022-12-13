package massiv;

import java.util.Scanner;
//Berilgan  massivdagi 3 ga bo’linadigan lekin
// 7 bo’linmaydigan nechta son borligini aniqlaydigan dastur tuzing
public class Massiv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if(a[i] % 3 == 0 && a[i] % 7  != 0){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
