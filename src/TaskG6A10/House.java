package TaskG6A10;

public class House extends AbstractBuilding {
    private int roomsCount;
    private boolean hasGarden; // специфично для дома

    public House(double area, int roomsCount) {
        super(area);
        this.roomsCount = roomsCount;
        this.hasGarden = false;
    }

    @Override
    public void build() {
        System.out.println("Дом построен. Площадь: " + area + " кв.м.");
    }

    @Override
    public double getPricePerSquareMeter() {
        return 1500.0; // Дом стоит 1500 за кв.м
    }

    @Override
    public int getRoomsCount() {
        return roomsCount;
    }

    @Override
    public void renovate(String roomName) {
        System.out.println("В доме сделан ремонт в комнате: " + roomName);
    }

    // Специализированный метод
    public void buildGarden() {
        hasGarden = true;
        System.out.println("Построен сад возле дома.");
    }
}