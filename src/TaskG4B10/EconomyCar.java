package TaskG4B10;

public class EconomyCar extends PassengerCar {
    private double tripPrice; // цена поездки

    public EconomyCar(String brand, String model, double maxSpeed,
                      double fuelConsumption, double price,
                      int passengerCapacity, String bodyType,
                      double tripPrice) {
        super(brand, model, maxSpeed, fuelConsumption, price,
                passengerCapacity, bodyType);
        this.tripPrice = tripPrice;
    }

    public double getTripPrice() { return tripPrice; }

    @Override
    public String toString() {
        return super.toString() + " [эконом, поездка=" + tripPrice + " руб.]";
    }
}