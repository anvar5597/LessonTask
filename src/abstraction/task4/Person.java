package abstraction.task4;

public class Person implements Employee{
    private  String name;
    private  String address;
    private  String hairColor;
    private  String eyeColor;

    public void setName(String name) {
        this.name = name;
    }

    public void newAddress(String address) {
        this.address = address;
    }

    @Override
    public void hire() {

    }

    @Override
    public void fire() {

    }
}
