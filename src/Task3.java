public class Task3 {
    public static void main(String[] args) {
        int count = 10;

        System.out.println("Без перехода на новую строку:");
        for (int i = 0; i < count; i++) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.print(randomNumber + " ");
        }

        System.out.println();

        System.out.println("\nС переходом на новую строку:");
        for (int i = 0; i < count; i++) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println(randomNumber);
        }
    }
}