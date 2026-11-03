package TaskG8C10;

public class MainJustify {
    public static void main(String[] args) {
        String text = "Java is a powerful programming language and it is widely used in the industry.";
        int width = 30; // желаемая ширина строки

        System.out.println("Исходный текст: " + text);
        System.out.println("Ширина строки: " + width);
        System.out.println("\nФорматированный текст (по обоим краям):");
        System.out.println("+" + "-".repeat(width) + "+");

        String[] words = text.split("\\s+");
        StringBuilder line = new StringBuilder();
        int lineLength = 0;

        for (String word : words) {
            // Если слово не помещается, выводим текущую строку и начинаем новую
            if (lineLength + word.length() + (line.length() > 0 ? 1 : 0) > width) {
                System.out.println("|" + justify(line.toString(), width) + "|");
                line.setLength(0);
                lineLength = 0;
            }
            if (line.length() > 0) {
                line.append(" ");
                lineLength++;
            }
            line.append(word);
            lineLength += word.length();
        }

        // Последняя строка (не выравниваем, просто прижимаем влево)
        if (line.length() > 0) {
            String lastLine = line.toString();
            if (lastLine.length() < width) {
                lastLine = lastLine + " ".repeat(width - lastLine.length());
            }
            System.out.println("|" + lastLine + "|");
        }
        System.out.println("+" + "-".repeat(width) + "+");
    }

    // Метод для выравнивания по обоим краям
    private static String justify(String line, int width) {
        if (line.length() >= width) return line;
        String[] words = line.split(" ");
        if (words.length == 1) {
            // Если одно слово — просто добавляем пробелы справа
            return line + " ".repeat(width - line.length());
        }

        int totalSpaces = width - line.replace(" ", "").length();
        int gaps = words.length - 1;
        int spacePerGap = totalSpaces / gaps;
        int extraSpaces = totalSpaces % gaps;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i < gaps) {
                result.append(" ".repeat(spacePerGap));
                if (i < extraSpaces) {
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }
}