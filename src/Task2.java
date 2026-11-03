public class Task2 {
    public static void main(String[] args) {
        System.out.println("Аргументы в обратном порядке:");

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }

        if (args.length == 0) {
            System.out.println("Вы не передали аргументы.");
        }
    }
}