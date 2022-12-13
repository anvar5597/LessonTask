package abstraction.task6;

public class Person {
    public static Long objectCounter = 0L;
    private final Long id;
    private String firsName;
    private String lastName;

    public Person() {
        objectCounter++;
        this.id = objectCounter;
    }

    public Person(String firsName, String lastName) {
        objectCounter++;
        this.id = objectCounter;
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
