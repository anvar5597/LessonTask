package abstraction.task8;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public void eat(){

    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String setName() {
        return null;
    }

    @Override
    public void play() {

    }
}
