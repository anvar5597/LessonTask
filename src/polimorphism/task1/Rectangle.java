package polimorphism.task1;

public class Rectangle extends Fugure{
    private Integer x;

    public Rectangle(Integer r, Integer x) {
        super(r);
        this.x = x;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    @Override
    public double area() {
        return x * r;
    }

    @Override
    public double perimetre() {
        return 2 * (x + r);
    }

    @Override
    public String toString() {
        return "x=" + x + ", y= " + r ;
    }
}
