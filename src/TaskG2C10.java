import java.util.Random;
import java.util.Scanner;

public class TaskG2C10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы n: ");
        int n = scanner.nextInt();

        // Создаём матрицу n x n
        int[][] matrix = new int[n][n];
        Random random = new Random();

        // Заполняем случайными числами от -n до n
        System.out.println("Исходная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2 * n + 1) - n;
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        // Находим максимальный элемент
        int max = matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("\nМаксимальный элемент: " + max);

        // Определяем, какие строки и столбцы содержат максимальный элемент
        boolean[] rowsToDelete = new boolean[n];
        boolean[] colsToDelete = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == max) {
                    rowsToDelete[i] = true;
                    colsToDelete[j] = true;
                }
            }
        }

        // Считаем, сколько строк и столбцов останется
        int newRows = 0;
        for (boolean del : rowsToDelete) {
            if (!del) newRows++;
        }
        int newCols = 0;
        for (boolean del : colsToDelete) {
            if (!del) newCols++;
        }

        // Создаём новую матрицу без удалённых строк и столбцов
        int[][] result = new int[newRows][newCols];
        int newI = 0;
        for (int i = 0; i < n; i++) {
            if (rowsToDelete[i]) continue;
            int newJ = 0;
            for (int j = 0; j < n; j++) {
                if (colsToDelete[j]) continue;
                result[newI][newJ] = matrix[i][j];
                newJ++;
            }
            newI++;
        }

        // Выводим результат
        System.out.println("\nМатрица после удаления строк и столбцов с максимумом:");
        if (newRows == 0 || newCols == 0) {
            System.out.println("Матрица пуста (все строки/столбцы содержали максимум).");
        } else {
            for (int i = 0; i < newRows; i++) {
                for (int j = 0; j < newCols; j++) {
                    System.out.printf("%4d", result[i][j]);
                }
                System.out.println();
            }
        }

        /** Информация о разработчике и датах */
        System.out.println("\nРазработчик: Суржана");
        System.out.println("Задание получено: 01.11.2026 10:00");
        System.out.println("Задание сдано: 05.11.2026 18:00");
    }
}