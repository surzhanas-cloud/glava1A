package TaskG8B10;

import java.util.*;

public class MainWordCount {
    public static void main(String[] args) {
        String text = "Java is a powerful language. Java is also popular. Many people love Java.";
        List<String> targetWords = Arrays.asList("Java", "is", "Python", "language");

        // 1. Разбиваем текст на слова, убираем знаки препинания
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        // 2. Считаем вхождения для каждого слова из списка
        Map<String, Integer> countMap = new LinkedHashMap<>();
        for (String target : targetWords) {
            int count = 0;
            for (String word : words) {
                if (word.equalsIgnoreCase(target)) {
                    count++;
                }
            }
            countMap.put(target, count);
        }

        // 3. Сортируем по убыванию количества
        List<Map.Entry<String, Integer>> list = new ArrayList<>(countMap.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // 4. Выводим результат
        System.out.println("Текст: " + text);
        System.out.println("Список слов: " + targetWords);
        System.out.println("\nРезультат (по убыванию вхождений):");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " раз");
        }
    }
}