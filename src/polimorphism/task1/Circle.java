package polimorphism.task1;

public class Circle extends Fugure {
    @Override
    public double area() {
        return r * r *Math.PI;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "r= " + r;
    }
}
