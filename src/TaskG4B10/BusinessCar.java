package TaskG4B10;

public class BusinessCar extends PassengerCar {
    private double tripPrice;
    private boolean hasMiniBar;

    public BusinessCar(String brand, String model, double maxSpeed,
                       double fuelConsumption, double price,
                       int passengerCapacity, String bodyType,
                       double tripPrice, boolean hasMiniBar) {
        super(brand, model, maxSpeed, fuelConsumption, price,
                passengerCapacity, bodyType);
        this.tripPrice = tripPrice;
        this.hasMiniBar = hasMiniBar;
    }

    public double getTripPrice() { return tripPrice; }
    public boolean hasMiniBar() { return hasMiniBar; }

    @Override
    public String toString() {
        return super.toString() + " [бизнес, поездка=" + tripPrice +
                " руб., мини-бар=" + (hasMiniBar ? "да" : "нет") + "]";
    }
}