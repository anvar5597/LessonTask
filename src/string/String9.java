package string;

import java.util.Scanner;
//        S1 va S2 satrlari berilgan. S1 satrida uchragan
//        barcha S2 satrlarini o'chirib tashlovchi programma tuzilsin.
//        Agar S1 satrida S2 satri uchramasa S1 satri o'zgarishsiz qoldirilsin.
public class String9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 ="";
        int cnt = 0;
        for (int i = 0; i < s1.length(); i++) {


            if (s1.contains(s2)) {
                s3 = s1.substring(0, s1.indexOf(s2)) + s1.substring(s1.indexOf(s2) + s2.length());
            }
        }
        System.out.println(s3);

    }
}
