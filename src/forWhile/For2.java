package forWhile;

import java.util.Scanner;

//Berilgan x  va y sonlari orasidagi p ga karrali sonlarni ekranga chiqazuvchi dastur tuzing. Masalan,
//        Input:
//        x=10, y=40, p=5
//        Output: 10,15,20, 25, 30, 35, 40

public class For2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x  = scanner.nextInt();
        int y  = scanner.nextInt();
        int p  = scanner.nextInt();

        for (int i = x; i <= y-1; i++) {
            System.out.print((i % p == 0) ? i +",":"");
        }
    }
}
