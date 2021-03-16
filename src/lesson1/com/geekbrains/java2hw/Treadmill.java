package lesson1.com.geekbrains.java2hw;

public class Treadmill implements Obstacles {

    //  Объявлеяем переменную экземпляра для хранения длины препятствия
    private double length;

    //  Создаем конструктор для инициализации переменной экземпляра
    public Treadmill(double length) {
        this.length = length;
    }

    //  Реализуем наследуемый метод и передаем участнику ссылку на препятствие
    @Override
    public void doAction(AbleToAction player) {
        player.run(this);
    }

    //  Создаем геттер для получения значения переменной экземпляра
    public double getLength() {
        return length;
    }
}
