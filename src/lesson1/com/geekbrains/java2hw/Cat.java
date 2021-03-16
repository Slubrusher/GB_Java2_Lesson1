package lesson1.com.geekbrains.java2hw;

public class Cat implements AbleToAction {

    //  Объявляем переменные экземпляра для хранения ограничений на бег и прыжок
    private double maxLenghtOfRunning;
    private double maxHeightOfJumping;
    boolean isLegit = true;
    String name;

    //  Создаем конструктор для инициализации переменных экземпляра
    public Cat(double maxLenghtOfRunning, double maxHeightOfJumping, String name) {
        this.maxLenghtOfRunning = maxLenghtOfRunning;
        this.maxHeightOfJumping = maxHeightOfJumping;
        this.name = name;
    }

    //  Реализуем метод интерфейса AbleToAction
    @Override
    public void jump(Wall wall) {
        while (isLegit) {
            if (maxHeightOfJumping >= wall.getHeight()) {
                System.out.println(name + " перепрыгнул эту стену!!!");
                break;
            } else {
                System.out.println(name + " не смог перепрыгнуть эту стену и завершил испытание!!!");
                isLegit = false;
            }
        }
    }

    //  Реализуем метод интерфейса AbleToAction
    @Override
    public void run(Treadmill treadmill) {
        while (isLegit) {
            if (maxLenghtOfRunning >= treadmill.getLength()) {
                System.out.println(name + " пробежал этот кросс!!!");
                break;
            } else {
                System.out.println(name + " не смог пробежать этот кросс и завершил испытание!!!");
                isLegit = false;
            }
        }
    }
}
