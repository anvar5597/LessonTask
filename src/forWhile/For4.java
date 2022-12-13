package forWhile;

import java.util.Scanner;
//Raqamlari takrorlanmaydigan barcha 3 xonali sonlarni ekranga chiqazuvchi dastur tuzing.
public class For4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 100; i <= 999; i++) {
            if(i/100 != i % 10 && (i%100)/10 != i/100 && (i%100)/10 != i%10){
                System.out.println(i);
            }

        }
    }
}
