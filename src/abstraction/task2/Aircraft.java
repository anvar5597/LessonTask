package abstraction.task2;

public abstract class Aircraft {
    private  String color;
    private Object engine;

    public abstract void start();
    public abstract void stop();
    public abstract void takeoff();
    public abstract void land();
}
