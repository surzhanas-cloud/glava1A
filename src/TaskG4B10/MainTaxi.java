package TaskG4B10;

public class MainTaxi {
    public static void main(String[] args) {
        TaxiFleet fleet = new TaxiFleet();

        fleet.addCar(new EconomyCar("Lada", "Vesta", 180, 7.5,
                900_000, 4, "седан", 250));
        fleet.addCar(new EconomyCar("Kia", "Rio", 190, 6.8,
                1_200_000, 4, "седан", 300));
        fleet.addCar(new BusinessCar("Toyota", "Camry", 220, 8.2,
                3_500_000, 4, "седан", 800, true));
        fleet.addCar(new BusinessCar("Mercedes", "E-Class", 250, 9.0,
                6_000_000, 4, "седан", 1200, true));

        System.out.println("=== Все машины в таксопарке ===");
        fleet.printAll();

        System.out.println("\n=== Общая стоимость автопарка ===");
        System.out.printf("%.2f руб.%n", fleet.totalPrice());

        System.out.println("\n=== После сортировки по расходу топлива ===");
        fleet.sortByFuelConsumption();
        fleet.printAll();

        System.out.println("\n=== Машины со скоростью от 200 до 230 км/ч ===");
        for (Car car : fleet.findBySpeedRange(200, 230)) {
            System.out.println(car);
        }

        System.out.println("\n=== Проверка equals/hashCode ===");
        Car car1 = new EconomyCar("Lada", "Vesta", 180, 7.5,
                900_000, 4, "седан", 250);
        Car car2 = new EconomyCar("Lada", "Vesta", 180, 7.5,
                900_000, 4, "седан", 250);
        System.out.println("car1.equals(car2): " + car1.equals(car2));
        System.out.println("hashCode равны: " +
                (car1.hashCode() == car2.hashCode()));
    }
}