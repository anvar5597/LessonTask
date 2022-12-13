package forWhile;

import java.util.Scanner;

//for loop yordamida A dan Z gacha bo’lgan harflarni ekranga chiqazuvchi dastur tuzing.
public class For7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");

        }
    }
}
