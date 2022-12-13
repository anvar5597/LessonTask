package forWhile;

import java.util.Scanner;
//        Chang’ichi birinchi kun 10 km yo’l bosdi. Har kungi bosgan yolini
//        kechagisidan 10% oshirib borsa nechanchi kun bir kunda 20 km dan kam bo’lmagan yo’lni bosadi
//        va nechchi kunda barcha kungi bosgan yo’li summasi 100 km dan oshadi.
public class For9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distanceDay = 10;
        int day = 0 , hundred=0;

        double totalDistance = 0;
        boolean find = true;
        while (distanceDay <= 20 ){
            day++;
            distanceDay *= 1.1;
            totalDistance +=distanceDay;
            if (totalDistance > 100 && find ){
                hundred = day;
                find = false;
            }

        }

        System.out.println(day + "-kuni bir kunlik masofa 20 kmdan oshadi");
        System.out.println(hundred + "-kuni umumiy masofa 100 kmdan oshadi");

    }
}
