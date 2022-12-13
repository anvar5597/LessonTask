package casting;

import java.util.Scanner;
// float va long toifasidagi o’zgaruvchilarni qabul qilib ikkalasini ayirmasini qaytaradigan
// method yarating. Bunda faqat  float va long toifalaridan foydalaning.

//         Input: 40.5,  20
//
//         Output: 20.5
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float m = scanner.nextFloat();
        long n = scanner.nextLong();
        System.out.println(summa(n,m));
    }

    public static double summa(long n, float m) {
        return (m - n);
    }
}
