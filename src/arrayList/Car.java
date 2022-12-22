package arrayList;

public class Car {
    private String color;
    private String model;
    private String carnumber;

    public Car(String color, String model, String carnumber) {
        this.color = color;
        this.model = model;
        this.carnumber = carnumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", carnumber='" + carnumber + '\'' +
                '}';
    }
}
