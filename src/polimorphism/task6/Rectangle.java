package polimorphism.task6;

public class Rectangle extends Figure {
    private Double sideA;
    private Double sideB;

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimetre() {
        return 2 * (sideA + sideB);
    }
}
