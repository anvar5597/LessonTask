package polimorphism.task2;

import java.util.Scanner;

//Quyidagi amallarni bajarib natijasini qaytaruvchi methodlarga ega bo'lgan AddAttributes klassini polymorphismni overloading usulini qo’llagan holda yarating:
//        1)  int  toifali 2 ta sonlarni qo’shish;
//        2)  int va double toifali 2 ta sonni qo’shish;
//        3)  3ta double toifali sonlarni qo’shish;
//        4)  Ikkita mattni qo’shish;
//        5)  Son va matni qo’shish.
public class Task2 {
    public static void main(String[] args) {

        System.out.println("1)  int  toifali 2 ta sonlarni qo’shish;\n" +
                "2)  int va double toifali 2 ta sonni qo’shish;\n" +
                "3)  3ta double toifali sonlarni qo’shish;\n" +
                "4)  Ikkita mattni qo’shish;\n" +
                "5)  Son va matni qo’shish.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 1 -> {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(addAtributs(a, b));
            }
            case 2 -> {
                int c = scanner.nextInt();
                double d = scanner.nextDouble();
                System.out.println(addAtributs(c, d));
            }
            case 3 -> {
                double c = scanner.nextDouble();
                double d = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println(addAtributs(c, d , b));
            }
            case 4 -> {
                String s1 = scanner.next();
                String s2 = scanner.next();
                System.out.println(addAtributs(s1, s2));
            }
            case 5 -> {
                String s1 = scanner.next();
                int m = scanner.nextInt();
                System.out.println(addAtributs(m , s1));
            }
        }

    }

    private static int addAtributs(int n, String s1) {
    return n + Integer.parseInt(s1);
    }

    private static int addAtributs(String s1, String s2) {
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }


    private static double addAtributs(double c, double d , double b) {
        return c + d +b;
    }
    private static int addAtributs(int a, int b) {
            return  a + b;
    }
    private static double addAtributs(int a, double b) {
        return  a + b;
    }


}
