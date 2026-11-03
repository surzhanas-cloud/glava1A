package TaskG4B10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaxiFleet {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    // Общая стоимость автопарка
    public double totalPrice() {
        double sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        return sum;
    }

    // Сортировка по расходу топлива (по возрастанию)
    public void sortByFuelConsumption() {
        cars.sort(Comparator.comparingDouble(Car::getFuelConsumption));
    }

    // Поиск машин в диапазоне скорости
    public List<Car> findBySpeedRange(double minSpeed, double maxSpeed) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                result.add(car);
            }
        }
        return result;
    }

    // Вывод всех машин
    public void printAll() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}