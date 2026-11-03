package TaskG5A10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mobile {
    private String brand; // Бренд телефона (например, Samsung, Apple)
    // Список для хранения моделей. Обрати внимание: тип Model - это наш внутренний класс
    private List<Model> models = new ArrayList<>();

    public Mobile(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    // Метод для добавления новой модели
    public void addModel(String modelName, int releaseYear, int batteryCapacity) {
        // Создаем объект внутреннего класса и сразу добавляем в список
        models.add(new Model(modelName, releaseYear, batteryCapacity));
    }

    // Метод для вывода всей информации
    public void printAllModels() {
        System.out.println("Бренд: " + brand);
        for (Model model : models) {
            System.out.println("  " + model); // Вызов toString внутреннего класса
        }
    }

    // ==========================================
    // ВНУТРЕННИЙ КЛАСС (INNER CLASS)
    // ==========================================
    public class Model {
        private String modelName;
        private int releaseYear;
        private int batteryCapacity; // мАч

        public Model(String modelName, int releaseYear, int batteryCapacity) {
            this.modelName = modelName;
            this.releaseYear = releaseYear;
            this.batteryCapacity = batteryCapacity;
        }

        public String getModelName() {
            return modelName;
        }

        @Override
        public String toString() {
            // Внутренний класс имеет доступ к полю brand внешнего класса!
            return "Модель: " + modelName +
                    " (Год: " + releaseYear +
                    ", Батарея: " + batteryCapacity + " мАч)";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Model model = (Model) o;
            return releaseYear == model.releaseYear &&
                    batteryCapacity == model.batteryCapacity &&
                    Objects.equals(modelName, model.modelName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(modelName, releaseYear, batteryCapacity);
        }
    }
}