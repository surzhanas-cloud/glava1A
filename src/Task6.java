import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task6 {
    public static void main(String[] args) {
        String developerName = "Суржана";

        String dateOfReceipt = "30.10.2026 10:00";
        String deadline = "30.10.2026 10:00";

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String currentTime = now.format(formatter);

        System.out.println("Разработчик: " + developerName);
        System.out.println("Задание получено: " + dateOfReceipt);
        System.out.println("Задание сдано: " + deadline);
        System.out.println("Отчет сформирован: " + currentTime);
    }
}