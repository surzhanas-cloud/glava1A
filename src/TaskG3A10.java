import java.util.Scanner;

public class TaskG3A10 {

    /** Класс Train — поезд */
    static class Train {
        private String destination;    // пункт назначения
        private int trainNumber;       // номер поезда
        private int departureTime;     // время отправления (часы, 0-23)
        private int commonSeats;       // общие места
        private int coupeSeats;        // купе
        private int platzkartSeats;    // плацкарт
        private int luxSeats;          // люкс

        public Train(String destination, int trainNumber, int departureTime,
                     int commonSeats, int coupeSeats, int platzkartSeats, int luxSeats) {
            this.destination = destination;
            this.trainNumber = trainNumber;
            this.departureTime = departureTime;
            this.commonSeats = commonSeats;
            this.coupeSeats = coupeSeats;
            this.platzkartSeats = platzkartSeats;
            this.luxSeats = luxSeats;
        }

        public String getDestination() { return destination; }
        public int getTrainNumber() { return trainNumber; }
        public int getDepartureTime() { return departureTime; }
        public int getCommonSeats() { return commonSeats; }
        public int getCoupeSeats() { return coupeSeats; }
        public int getPlatzkartSeats() { return platzkartSeats; }
        public int getLuxSeats() { return luxSeats; }

        @Override
        public String toString() {
            return "Поезд №" + trainNumber + " до " + destination +
                    ", отправление: " + departureTime + ":00" +
                    ", места: общие=" + commonSeats + ", купе=" + coupeSeats +
                    ", плацкарт=" + platzkartSeats + ", люкс=" + luxSeats;
        }
    }

    public static void main(String[] args) {
        // Создаём массив поездов
        Train[] trains = {
                new Train("Москва", 101, 8, 50, 30, 40, 10),
                new Train("Москва", 102, 14, 0, 20, 30, 5),
                new Train("Токио", 201, 6, 40, 25, 35, 0),
                new Train("Токио", 202, 20, 60, 10, 20, 5),
                new Train("Сеул", 301, 10, 0, 15, 25, 0),
                new Train("Москва", 103, 22, 30, 20, 40, 10)
        };

        Scanner scanner = new Scanner(System.in);

        // a) Список поездов до заданного пункта назначения
        System.out.print("Введите пункт назначения: ");
        String destination = scanner.nextLine();
        System.out.println("\nПоезда до " + destination + ":");
        boolean foundA = false;
        for (Train t : trains) {
            if (t.getDestination().equalsIgnoreCase(destination)) {
                System.out.println(t);
                foundA = true;
            }
        }
        if (!foundA) System.out.println("Нет поездов до " + destination);

        // b) Поезда до заданного пункта, отправляющиеся после заданного часа
        System.out.print("\nВведите час отправления (0-23): ");
        int hour = scanner.nextInt();
        System.out.println("\nПоезда до " + destination + ", отправляющиеся после " + hour + ":00:");
        boolean foundB = false;
        for (Train t : trains) {
            if (t.getDestination().equalsIgnoreCase(destination) && t.getDepartureTime() > hour) {
                System.out.println(t);
                foundB = true;
            }
        }
        if (!foundB) System.out.println("Нет таких поездов");

        // c) Поезда до заданного пункта с общими местами
        System.out.println("\nПоезда до " + destination + " с общими местами:");
        boolean foundC = false;
        for (Train t : trains) {
            if (t.getDestination().equalsIgnoreCase(destination) && t.getCommonSeats() > 0) {
                System.out.println(t);
                foundC = true;
            }
        }
        if (!foundC) System.out.println("Нет таких поездов");

        /** Информация о разработчике и датах */
        System.out.println("\nРазработчик: Суржана");
        System.out.println("Задание получено: 01.11.2026 10:00");
        System.out.println("Задание сдано: 05.11.2026 18:00");
    }
}