public class TaskG2B1 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения:");

        // Заголовок с числами от 1 до 10
        System.out.print("    ");
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        // Сама таблица
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d |", i); // номер строки
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j); // произведение
            }
            System.out.println();
        }
    }
}
