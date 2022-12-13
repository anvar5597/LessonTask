package casting;

import java.util.Scanner;

//Raqamlari soni 15 tagacha bo’lgan sonni long toifasida qabul qilib
// so'z ko’rinishga o'giradigan dastur tuzing.
//        Masalan:  5234856 soni kiritilsa – besh million ikki yuz
//        o'ttiz to'rt ming sakkiz yuz ellik olti deb javob qaytarilsin.

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String umumiy = "";
        long a = scanner.nextLong();
        long[] xona = new long[5];
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            cnt++;
            xona[i] = a % 1000;
            a /= 1000;
//            System.out.println(xona[i]);
            if (a == 0) {
                break;
            }
        }
//        System.out.println(cnt);
        String trn = "trillion";
        String mlrd = "milliard";
        String mln = "million";
        String ming = "ming";
        for (int i = xona.length - 1; i >= 0; i--) {
            umumiy += yuzlikXona(xona[i]);
            if (i < cnt) {
                switch (i) {
                    case 1 -> umumiy += (ming + " ");
                    case 2 -> umumiy += (mln + " ");
                    case 3 -> umumiy += (mlrd + " ");
                    case 4 -> umumiy += (trn + " ");
                }
            }
        }
        System.out.println(umumiy);
    }

    public static String yuzlikXona(long yuz) {
        String sss = "";
        int yuzlik = (int) yuz / 100;
        int onlik = (int) yuz / 10 % 10;
        int birlik = (int) yuz % 10;
        switch (yuzlik) {
            case 1 -> sss += "bir yuz ";
            case 2 -> sss += "ikki yuz ";
            case 3 -> sss += "uch yuz ";
            case 4 -> sss += "to`rt yuz ";
            case 5 -> sss += "besh yuz ";
            case 6 -> sss += "olti yuz ";
            case 7 -> sss += "yetti yuz ";
            case 8 -> sss += "sakkiz yuz ";
            case 9 -> sss += "to`qqiz yuz ";
        }
        switch (onlik) {
            case 1 -> sss += "o`n ";
            case 2 -> sss += "yigirma ";
            case 3 -> sss += "o`ttiz ";
            case 4 -> sss += "qirq ";
            case 5 -> sss += "ellik ";
            case 6 -> sss += "oltmish ";
            case 7 -> sss += "yetmish ";
            case 8 -> sss += "sakson ";
            case 9 -> sss += "to`qson ";
        }
        switch (birlik) {
            case 1 -> sss += "bir ";
            case 2 -> sss += "ikki ";
            case 3 -> sss += "uch ";
            case 4 -> sss += "to`rt ";
            case 5 -> sss += "besh ";
            case 6 -> sss += "olti ";
            case 7 -> sss += "yetti ";
            case 8 -> sss += "sakkiz ";
            case 9 -> sss += "to`qqiz ";
        }
        return sss;
    }

}
