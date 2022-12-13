package abstraction.task1;

public class Circle extends Shape {

    private double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
