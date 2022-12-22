package string;

import java.util.Scanner;

public class String8 {
//    S1 va S2 satrlari berilgan. S1 satrida oxirgi uchragan S2
//    satrini o'chirib tashlovchi programma tuzilsin.
//    Agar S1 satrida S2 satri uchramasa S1 satri o'zgarishsiz qoldirilsin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 ="";
        int cnt = 0;
        if (s1.contains(s2)) {
            s3+=s1.substring(0, s1.lastIndexOf(s2)) +s1.substring(s1.lastIndexOf(s2)+s2.length());
            System.out.println(s3);
        } else {
            System.out.println(s1);
        }


    }

}
