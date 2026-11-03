package TaskG4B10;

import java.util.Objects;

public class PassengerCar extends Car {
    private int passengerCapacity; // количество пассажиров
    private String bodyType;       // тип кузова

    public PassengerCar(String brand, String model, double maxSpeed,
                        double fuelConsumption, double price,
                        int passengerCapacity, String bodyType) {
        super(brand, model, maxSpeed, fuelConsumption, price);
        this.passengerCapacity = passengerCapacity;
        this.bodyType = bodyType;
    }

    public int getPassengerCapacity() { return passengerCapacity; }
    public String getBodyType() { return bodyType; }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return passengerCapacity == that.passengerCapacity &&
                Objects.equals(bodyType, that.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCapacity, bodyType);
    }

    @Override
    public String toString() {
        return super.toString() + " [пассажиров=" + passengerCapacity +
                ", кузов='" + bodyType + "']";
    }
}