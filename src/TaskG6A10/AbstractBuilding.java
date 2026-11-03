package TaskG6A10;

public abstract class AbstractBuilding implements Building {
    protected double area;       // площадь в кв.м
    protected boolean isRented;  // сдано ли в аренду

    public AbstractBuilding(double area) {
        this.area = area;
        this.isRented = false;
    }

    @Override
    public void increaseArea(double extraSquareMeters) {
        if (extraSquareMeters > 0) {
            this.area += extraSquareMeters;
            System.out.println("Площадь увеличена на " + extraSquareMeters + " кв.м. Новая площадь: " + area);
        }
    }

    @Override
    public void rentOut() {
        if (isRented) {
            System.out.println("Здание уже сдано в аренду!");
        } else {
            isRented = true;
            System.out.println("Здание успешно сдано в аренду.");
        }
    }

    // Геттер для площади (может пригодиться)
    public double getArea() {
        return area;
    }
}