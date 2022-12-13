package forWhile;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 2; i <= 100; i++) {
            int cnt = 0;
            for (int j = 1; j < 100; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                System.out.println(i);
            }
        }
    }
}
