package TaskG6A10;

public class OfficeBuilding extends AbstractBuilding {
    private int floors; // количество этажей
    private int officesCount;

    public OfficeBuilding(double area, int floors) {
        super(area);
        this.floors = floors;
        this.officesCount = floors * 4; // условно 4 офиса на этаж
    }

    @Override
    public void build() {
        System.out.println("Офисное здание построено. Этажей: " + floors + ", Площадь: " + area + " кв.м.");
    }

    @Override
    public double getPricePerSquareMeter() {
        return 2500.0; // Офисы дороже
    }

    @Override
    public int getRoomsCount() {
        return officesCount; // считаем офисы как комнаты
    }

    @Override
    public void renovate(String roomName) {
        System.out.println("В офисном здании сделан ремонт в офисе: " + roomName);
    }

    // Специализированный метод
    public void installElevator() {
        System.out.println("В офисном здании установлен лифт.");
    }
}