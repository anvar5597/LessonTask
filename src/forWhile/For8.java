package forWhile;

import java.util.Scanner;
//Raqamlar yig’indisi 15ga teng bo’lgan 100-500 oraliqdagi sonlarni ekranga chiqazuvchi dastur tuzing

public class For8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 100; i <= 500; i++) {
            if(i/100 + i % 10 + (i%100)/10 == 15 ){
                System.out.println(i);
            }

        }
    }
}
