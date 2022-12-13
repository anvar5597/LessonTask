package polimorphism.task1;

public class Fugure {
    protected Integer r;

    public Fugure() {
    }

    public Fugure(Integer r) {
        this.r = r;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }
    public double area(){
        return 0;
    }
    public double perimetre(){
        return 0;
    }

    @Override
    public String toString() {
        return "Fugure{" +
                "r=" + r +
                '}';
    }
}
