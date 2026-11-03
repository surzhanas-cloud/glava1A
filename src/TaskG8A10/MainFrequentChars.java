package TaskG8A10;

import java.util.*;

public class MainFrequentChars {
    public static void main(String[] args) {
        String text = "Java is a powerful programming language. Java is also fun!";
        int n = 3; // сколько самых частых символов нужно вывести

        // 1. Считаем частоту каждого символа (игнорируем пробелы)
        Map<Character, Integer> frequency = new HashMap<>();
        for (char ch : text.toCharArray()) {
            if (ch != ' ') {
                frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            }
        }

        // 2. Сортируем записи по убыванию значения (частоты)
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(frequency.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // 3. Выводим первые n
        System.out.println("Текст: " + text);
        System.out.println("Топ-" + n + " самых частых символов:");
        for (int i = 0; i < n && i < list.size(); i++) {
            Map.Entry<Character, Integer> entry = list.get(i);
            System.out.println("Символ: '" + entry.getKey() + "' -> " + entry.getValue() + " раз");
        }
    }
}