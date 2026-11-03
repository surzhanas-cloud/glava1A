package TaskG4A10;

public class MainAnimals {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Бим", 1, "Лабрадор");

        System.out.println("=== Информация о щенке ===");
        System.out.println(puppy);

        System.out.println("\n=== Методы ===");
        puppy.voice();
        puppy.run();
        puppy.jump();
        puppy.bite();

        System.out.println("\n=== Проверка equals/hashCode ===");
        Puppy puppy2 = new Puppy("Бим", 1, "Лабрадор");
        System.out.println("puppy.equals(puppy2): " + puppy.equals(puppy2));
        System.out.println("hashCode равны: " + (puppy.hashCode() == puppy2.hashCode()));
    }
}