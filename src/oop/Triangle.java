package oop;
//        To’g’ri burchakli uchburchak klassini yarating. Uning barcha
//        atributlari va methodlariga mos nom va toifa tanlang.
//        (Eni va bo’yi attributlari, Perimetrini va Yuzasini hisoblaydigan 2 ta methodi bo’lsin).
public class Triangle {
    private int width ;
    private int height ;
    private int hypotenuse ;

    public int perimeter(){
        return width + height + hypotenuse;
    }
    public double surface(){
        return 0.5 * width * height;
    }
}
