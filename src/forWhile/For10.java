package forWhile;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 30; i <= 100; i++) {
            if(i % 3 ==0 && (i % 10 ==2 || i % 10 == 4 || i % 10 == 8) ){
                System.out.println(i);
            }

        }
    }
}
