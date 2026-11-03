package TaskG6A10;

public interface Building {
    void build(); // построить
    double getPricePerSquareMeter(); // рассчитать цену за кв.м
    int getRoomsCount(); // узнать сколько комнат
    void increaseArea(double extraSquareMeters); // увеличить площадь
    void rentOut(); // сдавать в аренду
    void renovate(String roomName); // сделать ремонт
}