public class Task5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Пожалуйста, передайте числа как аргументы командной строки.");
            return;
        }

        int sum = 0;
        int product = 1;

        for (String arg : args) {
            int number = Integer.parseInt(arg);
            sum = sum + number;
            product = product * number;
        }

        System.out.println("Сумма чисел: " + sum);
        System.out.println("Произведение чисел: " + product);
    }
}