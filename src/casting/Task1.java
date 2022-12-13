package casting;

import java.util.Scanner;
//int va double toifasidagi o’zgaruvchilarni qabul qilib ikkalasini yig’indisini
// qaytaradigan method yarating. Bunda faqat int va double toifalaridan foydalaning.
//
//        Input: 20,  40.5
//
//        Output: 60.5
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        System.out.println(summa(n,m));
    }

    public static double summa(int n, double m) {
        return (n + m);
    }
}
