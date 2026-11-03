import java.util.ArrayList;
import java.util.List;

public class TaskG3C10 {

    /** Класс Точка */
    static class Point {
        double x, y;
        Point(double x, double y) { this.x = x; this.y = y; }
        double distance(Point p) {
            return Math.hypot(x - p.x, y - p.y);
        }
    }

    /** Класс Четырехугольник */
    static class Quadrilateral {
        Point a, b, c, d;
        Quadrilateral(Point a, Point b, Point c, Point d) {
            this.a = a; this.b = b; this.c = c; this.d = d;
        }

        /** Периметр */
        double perimeter() {
            return a.distance(b) + b.distance(c) + c.distance(d) + d.distance(a);
        }

        /** Площадь (через векторное произведение диагоналей) */
        double area() {
            double cross = Math.abs((c.x - a.x) * (d.y - b.y) - (c.y - a.y) * (d.x - b.x));
            return 0.5 * cross;
        }

        /** Тип четырехугольника */
        String type() {
            double ab = a.distance(b);
            double bc = b.distance(c);
            double cd = c.distance(d);
            double da = d.distance(a);
            double ac = a.distance(c);
            double bd = b.distance(d);

            boolean isParallelogram = Math.abs(ab - cd) < 1e-6 && Math.abs(bc - da) < 1e-6;
            boolean isRectangle = isParallelogram && Math.abs(ac - bd) < 1e-6;
            boolean isRhombus = isParallelogram && Math.abs(ab - bc) < 1e-6;
            boolean isSquare = isRectangle && isRhombus;

            if (isSquare) return "Квадрат";
            if (isRectangle) return "Прямоугольник";
            if (isRhombus) return "Ромб";
            if (isParallelogram) return "Параллелограмм";
            return "Произвольный";
        }

        @Override
        public String toString() {
            return type() + " (периметр=" + String.format("%.2f", perimeter()) +
                    ", площадь=" + String.format("%.2f", area()) + ")";
        }
    }

    public static void main(String[] args) {
        List<Quadrilateral> quads = new ArrayList<>();
        quads.add(new Quadrilateral(new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(0, 1)));       // квадрат
        quads.add(new Quadrilateral(new Point(0, 0), new Point(2, 0), new Point(2, 1), new Point(0, 1)));       // прямоугольник
        quads.add(new Quadrilateral(new Point(0, 0), new Point(2, 0), new Point(3, 1.5), new Point(1, 1.5)));   // ромб
        quads.add(new Quadrilateral(new Point(0, 0), new Point(2, 0), new Point(1.5, 1), new Point(0.5, 1)));   // параллелограмм
        quads.add(new Quadrilateral(new Point(0, 0), new Point(2, 0), new Point(2, 1), new Point(0, 2)));       // произвольный

        System.out.println("Все четырехугольники:");
        for (Quadrilateral q : quads) {
            System.out.println(q);
        }

        /** Статистика по типам */
        System.out.println("\nСтатистика по типам:");
        String[] types = {"Квадрат", "Прямоугольник", "Ромб", "Параллелограмм", "Произвольный"};
        for (String type : types) {
            List<Quadrilateral> group = new ArrayList<>();
            for (Quadrilateral q : quads) {
                if (q.type().equals(type)) group.add(q);
            }
            if (group.isEmpty()) continue;

            System.out.println(type + ": " + group.size() + " шт.");
            Quadrilateral max = group.get(0), min = group.get(0);
            for (Quadrilateral q : group) {
                if (q.area() > max.area()) max = q;
                if (q.area() < min.area()) min = q;
            }
            System.out.println("  Наибольший по площади: " + max);
            System.out.println("  Наименьший по площади: " + min);
        }

        /** Информация о разработчике и датах */
        System.out.println("\nРазработчик: Суржана");
        System.out.println("Задание получено: 01.11.2026 10:00");
        System.out.println("Задание сдано: 05.11.2026 18:00");
    }
}