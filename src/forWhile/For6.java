package forWhile;

import java.util.Scanner;
//Sonlarni ekranga 1 2 4 8 16 32 64 128 256 512 tartibda chiqazuvchi dastur tuzing
public class For6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k =1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(k + " ");
            k*=2;
        }
    }
}
