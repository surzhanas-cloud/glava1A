package TaskG4B10;

import java.util.Objects;

public abstract class Car {
    private String brand;           // марка
    private String model;           // модель
    private double maxSpeed;        // максимальная скорость (км/ч)
    private double fuelConsumption; // расход топлива (л/100км)
    private double price;           // цена (руб.)

    public Car(String brand, String model, double maxSpeed,
               double fuelConsumption, double price) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getMaxSpeed() { return maxSpeed; }
    public double getFuelConsumption() { return fuelConsumption; }
    public double getPrice() { return price; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.maxSpeed, maxSpeed) == 0 &&
                Double.compare(car.fuelConsumption, fuelConsumption) == 0 &&
                Double.compare(car.price, price) == 0 &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, maxSpeed, fuelConsumption, price);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{brand='" + brand + "', model='" + model +
                "', maxSpeed=" + maxSpeed + ", fuelConsumption=" + fuelConsumption +
                ", price=" + price + "}";
    }
}