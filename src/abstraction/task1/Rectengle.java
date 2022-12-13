package abstraction.task1;

public class Rectengle extends Shape{
    private Double sideA;
    private Double sideB;

    @Override
    public double area() {
        return sideA * sideB;
    }
}
