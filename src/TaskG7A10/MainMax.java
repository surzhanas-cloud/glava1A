package TaskG7A10;

public class MainMax {
    public static void main(String[] args) {
        // 1. Реализация через лямбда-выражение (классический способ через if-else)
        MaxOfThree maxFinder = (a, b, c) -> {
            if (a >= b && a >= c) {
                return a;
            } else if (b >= a && b >= c) {
                return b;
            } else {
                return c;
            }
        };

        // 2. Более короткий вариант через Math.max
        MaxOfThree maxFinderShort = (a, b, c) -> Math.max(a, Math.max(b, c));

        // 3. Ещё короче — через тернарный оператор
        MaxOfThree maxFinderTern = (a, b, c) -> (a > b ? (a > c ? a : c) : (b > c ? b : c));

        // Тестируем
        System.out.println("=== Тест 1: 10, 25, 7 ===");
        System.out.println("Длинный вариант: " + maxFinder.findMax(10, 25, 7));
        System.out.println("Через Math.max: " + maxFinderShort.findMax(10, 25, 7));
        System.out.println("Тернарный:      " + maxFinderTern.findMax(10, 25, 7));

        System.out.println("\n=== Тест 2: -5, -1, -10 (все отрицательные) ===");
        System.out.println("Длинный вариант: " + maxFinder.findMax(-5, -1, -10));
        System.out.println("Через Math.max: " + maxFinderShort.findMax(-5, -1, -10));
        System.out.println("Тернарный:      " + maxFinderTern.findMax(-5, -1, -10));

        System.out.println("\n=== Тест 3: 100, 100, 50 (два равных) ===");
        System.out.println("Длинный вариант: " + maxFinder.findMax(100, 100, 50));
        System.out.println("Через Math.max: " + maxFinderShort.findMax(100, 100, 50));
        System.out.println("Тернарный:      " + maxFinderTern.findMax(100, 100, 50));

        System.out.println("\n=== Тест 4: 7, 7, 7 (все равны) ===");
        System.out.println("Длинный вариант: " + maxFinder.findMax(7, 7, 7));
        System.out.println("Через Math.max: " + maxFinderShort.findMax(7, 7, 7));
        System.out.println("Тернарный:      " + maxFinderTern.findMax(7, 7, 7));
    }
}