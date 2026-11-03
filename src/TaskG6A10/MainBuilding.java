package TaskG6A10;

public class MainBuilding {
    public static void main(String[] args) {
        System.out.println("=== ДОМ ===");
        House house = new House(120.5, 4);
        house.build();
        house.increaseArea(20);
        System.out.println("Цена за кв.м: " + house.getPricePerSquareMeter());
        System.out.println("Комнат: " + house.getRoomsCount());
        house.renovate("Кухня");
        house.buildGarden(); // спец. метод
        house.rentOut();

        System.out.println("\n=== ОФИСНОЕ ЗДАНИЕ ===");
        OfficeBuilding office = new OfficeBuilding(1000, 5);
        office.build();
        office.installElevator(); // спец. метод
        office.rentOut();

        System.out.println("\n=== ТОРГОВЫЙ ЦЕНТР ===");
        ShoppingCenter mall = new ShoppingCenter(5000, 100, 500);
        mall.build();
        mall.openFoodCourt(); // спец. метод
        mall.renovate("Кинотеатр");
    }
}