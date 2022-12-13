package casting;

import java.util.Scanner;
//Double toifasidagi qiymat berilgan. Ushbu qiymatning long, int, short, char, byte, float toifasiga o’giring.
//
//        Input:                                   2007956782.2157
//
//        Output:
//        long value: 2007956782 ,
//        int value: 2007956782,
//        float value: 2.00795674E9
//        short value: -722
//        byte value: 46
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        System.out.println((float) m);
        System.out.println((long) m);
        System.out.println((int) m);
        System.out.println((short) m);
        System.out.println((byte) m);
    }


}
