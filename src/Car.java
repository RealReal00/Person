import java.util.Objects;

public class Car {
    boolean isOn;
    String brand;
    String color;

    public Car(String brand, String color) {
        this.isOn = false;
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void turnOn() {
        this.isOn = true;
    }

    void turnOff() {
        this.isOn = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return isOn == car.isOn && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOn, brand, color);
    }

    @Override
    public String toString() {
        return "Car{ " + "isOn = " + isOn + ", brand = '" + brand + '\'' + ", color = '" + color + '\'' + '}';
    }
}