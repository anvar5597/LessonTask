package typing;

import java.util.Scanner;
//String ko'rinishda sonni qabul qilib uni Double toifasiga o'girib qaytaruvchi method yarating.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println(parseDouble(s));
    }

    public static double parseDouble(String s){
        return Double.parseDouble(s);
    }
}
