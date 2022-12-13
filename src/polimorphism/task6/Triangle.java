package polimorphism.task6;

public class Triangle extends Figure {
    private Double sideA;
    private Double sideB;
    private Double hipotenuse;

    @Override
    public double area() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public double perimetre() {
        return sideA + sideB + hipotenuse;
    }
}
