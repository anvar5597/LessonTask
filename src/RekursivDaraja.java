import java.util.Scanner;

public class RekursivDaraja {
//    (Rekursiya bilan yechilsin)
//    Sonni darajasini topubchi method yarating.
//            Masalan: function(3,4) ->3^4 =>81

    public static int daraja(int son, int daraja , int p) {
        if (daraja == 0) {
            return p;
        } else {
            p *= son;
            return daraja( son , daraja-1 ,p);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(daraja(n , d , 1));


    }
}
