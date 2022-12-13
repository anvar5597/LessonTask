package typing;

import java.util.Scanner;
//         Scannerdan long toifali sonni qabul qilib, uning qiymatiga mos ravishda byte yoki short
//         yoki int yoki long toifasiga o'giradigan dastur tuzing.
//        Dasturning maqsadi berilgan sonni xotiradan kamroq joy olgan holda saqlash hisoblanadi.
//        Javob sifatida saqlangan sonni va qaysi toifada xotirada saqlanganini chiqaring.
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();

        findType(s);
    }
    public static void findType(long s) {
        if(s>=-128 && s<= 127){
          byte b = (byte) s;
            System.out.println("Bayt tipiga o`tkazildi");
        }else if(s>=-32768 && s<= 32767){
            short sh = (short) s;
            System.out.println("Short tipiga o`tkazildi");
        }else if(s>=-2147483648 && s<= 2147483647){
            int i = (int) s;
            System.out.println("Int tipiga o`tkazildi");
        }else {
            System.out.println("Long tipida qoldi");
        }
    }
}
