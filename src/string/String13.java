package string;

import java.util.Scanner;

         //Kamida bitta probeldan iborat satr berilgan.
         // Satridagi birinchi va ikkinchi probe! orasidagi belgilarni chiqaruvchi programma tuzilsin.
         // Agar satr faqat bitta probeldan iborat bo'Isa, bo'sh satr chiqarilsin.

public class String13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 =scanner.nextLine();
        String s4 ="";
        for (int i = 0; i < s1.length()-s2.length(); i++) {
            s1 = (s1.substring(0,s1.indexOf(s2)) + s3 + s1.substring(s1.indexOf(s2) + s2.length()-1));
        }
        System.out.println(s1);
    }
}
