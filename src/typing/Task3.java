package typing;

import java.util.Scanner;
//Doiraning radiusi berilgan bo’lsa uning uzunligi va yuzasini hisoblash dasturini tuzing.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        System.out.println(doiraUzunligi(r));
        System.out.println(doiraYuzasi(r));
    }

    private static double doiraYuzasi(int r) {
        return r*r*Math.PI;
    }

    private static double doiraUzunligi(int r) {
    return 2 * r * Math.PI;
    }

}
