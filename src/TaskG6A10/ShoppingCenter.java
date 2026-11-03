package TaskG6A10;

public class ShoppingCenter extends AbstractBuilding {
    private int shopsCount;
    private int parkingSpaces;

    public ShoppingCenter(double area, int shopsCount, int parkingSpaces) {
        super(area);
        this.shopsCount = shopsCount;
        this.parkingSpaces = parkingSpaces;
    }

    @Override
    public void build() {
        System.out.println("Торговый центр построен. Магазинов: " + shopsCount + ", Парковка: " + parkingSpaces + " мест.");
    }

    @Override
    public double getPricePerSquareMeter() {
        return 4000.0; // Самый дорогой
    }

    @Override
    public int getRoomsCount() {
        return shopsCount;
    }

    @Override
    public void renovate(String roomName) {
        System.out.println("В торговом центре сделан ремонт в секции: " + roomName);
    }

    // Специализированный метод
    public void openFoodCourt() {
        System.out.println("В торговом центре открыт фудкорт.");
    }
}