package com.geekbrains.java2hw;

public class Human implements AbleToAction {

    //  Объявляем переменные экземпляра для хранения ограничений на бег и прыжок
    private double maxLenghtOfRunning;
    private double maxHeightOfJumping;
    boolean isLegit = true;

    //  Создаем конструктор для инициализации переменных экземпляра
    public Human(double maxLenghtOfRunning, double maxHeightOfJumping) {
        this.maxLenghtOfRunning = maxLenghtOfRunning;
        this.maxHeightOfJumping = maxHeightOfJumping;
    }

    //  Реализуем метод интерфейса AbleToAction
    @Override
    public void jump(Wall wall) {
        while (isLegit) {
            if (maxHeightOfJumping >= wall.getHeight()) {
                System.out.println("Этот человек перепрыгнул эту стену!!!");
                break;
            } else {
                System.out.println("Этот человек не смог перепрыгнуть эту стену и завершил испытание!!!");
                isLegit = false;
            }
        }
    }

    //  Реализуем метод интерфейса AbleToAction
    @Override
    public void run(Treadmill treadmill) {
        while (isLegit) {
            if (maxLenghtOfRunning >= treadmill.getLength()) {
                System.out.println("Этот человек пробежал этот кросс!!!");
                break;
            } else {
                System.out.println("Этот человек не смог пробежать этот кросс и завершил испытание!!!");
                isLegit = false;
            }
        }
    }

}
