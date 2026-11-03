package TaskG5A10;

public class MainMobile {
    public static void main(String[] args) {
        // Создаем объект внешнего класса
        Mobile samsung = new Mobile("Samsung");

        // Добавляем модели через метод внешнего класса
        samsung.addModel("Galaxy S23", 2023, 3900);
        samsung.addModel("Galaxy A54", 2023, 5000);
        samsung.addModel("Galaxy Note 10", 2019, 3500);

        // Выводим информацию
        samsung.printAllModels();

        System.out.println("\n=== Проверка equals/hashCode ===");
        // Чтобы создать объект внутреннего класса напрямую, нужен объект внешнего
        Mobile.Model m1 = samsung.new Model("Galaxy S23", 2023, 3900);
        Mobile.Model m2 = samsung.new Model("Galaxy S23", 2023, 3900);

        System.out.println("m1.equals(m2): " + m1.equals(m2));
        System.out.println("hashCode равны: " + (m1.hashCode() == m2.hashCode()));
    }
}