package massiv;

import java.util.Scanner;

public class Massiv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        int S = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        boolean toq = false;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0){
                
                break;
            }
            S +=a[i];
            if(i == n-1){
                toq = true;
            }
        }
        if (toq){
            System.out.println(S - a[0] - a[n-1]);
        }else {
            System.out.println(S);
        }

        System.out.println("Yig`indi: " + S );

    }
}
