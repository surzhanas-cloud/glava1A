import java.util.Scanner;

public class TaskB10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел n: ");
        int n = scanner.nextInt();

        System.out.println("Введите " + n + " целых чисел:");
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Числа-палиндромы:");
        boolean found = false;
        for (int number : numbers) {
            if (isPalindrome(number)) {
                System.out.println(number);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Палиндромов не найдено.");
        }
    }

    // Метод проверки, является ли число палиндромом
    public static boolean isPalindrome(int number) {
        String s = String.valueOf(number);
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}