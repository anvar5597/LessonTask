package typing;

import java.util.Scanner;

//double ko'rinishda sonni qabul qilib uni String toifasiga o'girib qaytaruvchi method yarating.

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble();

        System.out.println(parseDouble(s));
    }

    public static String parseDouble(double s) {
        return s + "";
    }
}
