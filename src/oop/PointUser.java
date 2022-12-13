package oop;

import java.util.Scanner;

public class PointUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Point point = new Point(x , y);
        System.out.println(point.toString());


        Point point1 = new Point();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        point1.setX(a);
        point1.setY(b);
        System.out.println(point1.toString());
        point1.setX(x);
        System.out.println(point1.toString());
        point1.setX(78);

    }
}
