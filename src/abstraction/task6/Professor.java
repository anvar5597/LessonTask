package abstraction.task6;

public class Professor extends Person{
    private Double salary;

    public Professor() {
    }

    public Professor(String firsName, String lastName, Double salary) {
        super(firsName, lastName);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
