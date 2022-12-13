package oop;
//        Quyidagi 3ta attribute bor bo’lgan Date klassini yarating: yil, oy va kun.
//        15.05.2020 formatdagi sanani chop etuvchi mehod yarating.

public class Date {
    private int day;
    private int month;
    private int year;

    public void printDate(){
        System.out.println(day + "." + month + "." + year);
    }
}
