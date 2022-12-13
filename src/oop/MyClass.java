package oop;
//        Quyidagi atributlari bor bo’lgan Student nomli klass yarating:
//        familiya,  ismi,  guruh nomeri, o’qiydigan fanlari (5 ta fandan iborat massiv).
//        O’qidigan fanlari ro’yxatini ekranga chiqazuvchi printSubjects nomli method yarating
public class MyClass {
    private int firstAttribute;
    private int secondAttribute;

    public void aboutAttribute(){
        System.out.println("firstAttribute: " + firstAttribute);
        System.out.println("secondAttribute : " + secondAttribute);
    }
    public void sumAttribute(){
        System.out.println("Summa: " + firstAttribute + secondAttribute);
    }

    public void  maxAttribute(){
        if (firstAttribute > secondAttribute){
            System.out.println("Max: " + firstAttribute);
        }
        else {
            System.out.println("Max: " + secondAttribute);
        }
    }
}
