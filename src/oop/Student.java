package oop;
//        Quyidagi atributlari bor bo’lgan Student nomli klass yarating:
//        familiya,  ismi,  guruh nomeri, o’qiydigan fanlari (5 ta fandan iborat massiv).
//        O’qidigan fanlari ro’yxatini ekranga chiqazuvchi printSubjects nomli method yarating
public class Student {
    private long id;
    private String fistName;
    private String lastName;
    private int groupNumber;
    private String[]subjectName  = new String[5];

    public void printSubject(){
        for (String s : subjectName) {
            System.out.println(s);
        }


    }
}
