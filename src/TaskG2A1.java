import java.util.Scanner;

public class TaskG2A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел n: ");
        int n = scanner.nextInt();

        String[] numbers = new String[n];
        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.next();
        }

        /** Ищем самое короткое и самое длинное число по длине строки */
        String shortest = numbers[0];
        String longest = numbers[0];

        for (String num : numbers) {
            if (num.length() < shortest.length()) {
                shortest = num;
            }
            if (num.length() > longest.length()) {
                longest = num;
            }
        }

        /** Выводим результаты */
        System.out.println("\nСамое короткое число: " + shortest + " (длина: " + shortest.length() + ")");
        System.out.println("Самое длинное число: " + longest + " (длина: " + longest.length() + ")");

        /** Информация о разработчике и датах */
        System.out.println("\nРазработчик: Суржана");
        System.out.println("Задание получено: 01.11.2026 10:00");
        System.out.println("Задание сдано: 05.11.2026 18:00");
    }
}