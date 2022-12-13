package polimorphism.task6;

public class Circle extends Figure{
    private Double radius;


    @Override
    public double area() {
        return   Math.PI * radius * radius;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * radius;
    }
}
