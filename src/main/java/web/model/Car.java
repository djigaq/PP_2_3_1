package web.model;

public class Car {
    private int id;
    private String carBrand;
    private String color;

    public Car() {
    }

    public Car(int id, String carBrand, String color) {
        this.id = id;
        this.carBrand = carBrand;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}