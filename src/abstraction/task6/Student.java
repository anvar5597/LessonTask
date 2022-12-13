package abstraction.task6;

public class Student extends Person{
    private String major;

    public Student() {
    }

    public Student(String firsName, String lastName, String major) {
        super(firsName, lastName);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
