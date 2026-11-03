import java.util.ArrayList;
import java.util.List;

public class TaskG3B10 {

    /** Класс Прямая на плоскости: Ax + By + C = 0 */
    static class Line {
        double a, b, c;
        Line(double a, double b, double c) {
            this.a = a; this.b = b; this.c = c;
        }

        /** Точка пересечения с осью X (y = 0): x = -C/A */
        String intersectionWithX() {
            if (Math.abs(a) < 1e-9) return "Прямая параллельна оси X (нет пересечения или совпадает)";
            double x = -c / a;
            return "(" + String.format("%.2f", x) + "; 0)";
        }

        /** Точка пересечения с осью Y (x = 0): y = -C/B */
        String intersectionWithY() {
            if (Math.abs(b) < 1e-9) return "Прямая параллельна оси Y (нет пересечения или совпадает)";
            double y = -c / b;
            return "(0; " + String.format("%.2f", y) + ")";
        }

        /** Пересечение двух прямых: решаем систему A1x+B1y+C1=0 и A2x+B2y+C2=0 */
        static String intersection(Line l1, Line l2) {
            double det = l1.a * l2.b - l2.a * l1.b;
            if (Math.abs(det) < 1e-9) {
                return "Прямые параллельны или совпадают (нет единственной точки пересечения)";
            }
            double x = (l1.b * l2.c - l2.b * l1.c) / det;
            double y = (l1.c * l2.a - l2.c * l1.a) / det;
            return "(" + String.format("%.2f", x) + "; " + String.format("%.2f", y) + ")";
        }

        /** Параллельны ли две прямые (A1/B1 == A2/B2) */
        boolean isParallel(Line other) {
            return Math.abs(this.a * other.b - other.a * this.b) < 1e-9;
        }

        @Override
        public String toString() {
            return a + "x + " + b + "y + " + c + " = 0";
        }
    }

    public static void main(String[] args) {
        List<Line> lines = new ArrayList<>();
        lines.add(new Line(1, -1, -2));   // y = x - 2
        lines.add(new Line(2, -2, -4));   // параллельна первой (y = x - 2, но с другим коэффициентом)
        lines.add(new Line(1, 1, -4));    // x + y = 4
        lines.add(new Line(1, 1, -6));    // параллельна третьей (x + y = 6)
        lines.add(new Line(3, 1, -6));    // 3x + y = 6

        System.out.println("Все прямые:");
        for (Line l : lines) {
            System.out.println(l + " | с осью X: " + l.intersectionWithX() + " | с осью Y: " + l.intersectionWithY());
        }

        System.out.println("\nПересечения первых двух прямых:");
        System.out.println(Line.intersection(lines.get(0), lines.get(1)));

        System.out.println("\nПересечение прямой 1 и прямой 3:");
        System.out.println(Line.intersection(lines.get(0), lines.get(2)));

        /** Группы параллельных прямых */
        System.out.println("\nГруппы параллельных прямых:");
        boolean[] used = new boolean[lines.size()];
        for (int i = 0; i < lines.size(); i++) {
            if (used[i]) continue;
            List<Line> group = new ArrayList<>();
            group.add(lines.get(i));
            for (int j = i + 1; j < lines.size(); j++) {
                if (!used[j] && lines.get(i).isParallel(lines.get(j))) {
                    group.add(lines.get(j));
                    used[j] = true;
                }
            }
            used[i] = true;
            if (group.size() > 1) {
                System.out.println("Группа параллельных (" + group.size() + " шт.):");
                for (Line l : group) System.out.println("  " + l);
            }
        }

        /** Информация о разработчике и датах */
        System.out.println("\nРазработчик: Суржана");
        System.out.println("Задание получено: 01.11.2026 10:00");
        System.out.println("Задание сдано: 05.11.2026 18:00");
    }
}