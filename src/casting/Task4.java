package casting;

import java.util.Scanner;
//     byte, char, short, int, float toifasidagi qiymatlarni qabul qilib ularning
//    ko’paytmasini qaytaradigan method yarating.
//
//        Input:  2,  ’W’,  3,  4,   5.6789
//
//        Output: 11857.54296875
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();
        char ch = scanner.next().charAt(0);
        short sh = scanner.nextShort();
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        System.out.println(summa(b, ch, sh, i, f));
    }

    private static double summa(byte b, char ch, short sh, int i, float f) {
        return b * ch * sh * i * f;
    }
}
