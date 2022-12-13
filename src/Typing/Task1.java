package Typing;

import java.util.Scanner;

public class ask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println(parseDouble(s));
    }

    public static double parseDouble(String s){
        return Double.parseDouble(s);
    }
}
