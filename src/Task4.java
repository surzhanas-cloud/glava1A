import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String correctPassword = "secret123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(correctPassword)) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
    }
}