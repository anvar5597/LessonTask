package typing;

import java.util.Scanner;
//      Kvadrat tenglamani yechish dasturini tuzing. Bunda a*x^2+b*x+c ko’rinishdagi tenglamaning a,b,c
//        koefisentlari kalviaturadan kiritiladi hamda  tenglamaning yechimlari x1 va x2 lar hisoblanadi.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a*x^2 + b*x + c = 0");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        ildizllariniTopish(a,b,c);
    }

    private static void ildizllariniTopish(int a, int b, int c) {
        int D = b * b - 4 * a * c;
        if(D < 0){
            System.out.println("Ildizga ega emas");
        }else if (D == 0){
            System.out.println("x= " + -b / (2 * a));
        }
        else if(D>0){
            System.out.println("x1 = " + (-b + Math.sqrt(D))/(2*a));
            System.out.println("x2 = " + (-b - Math.sqrt(D))/(2*a));
        }
    }


}
