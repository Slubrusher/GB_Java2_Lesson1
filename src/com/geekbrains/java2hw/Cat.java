package com.geekbrains.java2hw;

public class Cat implements AbleToJump, AbleToRun{

    //  Объявляем переменные экземпляра для хранения ограничений на бег и прыжок
    private double maxLenghtOfRunning;
    private double maxHeightOfJumping;

    //  Создаем конструктор для инициализации переменных экземпляра
    public Cat(double maxLenghtOfRunning, double maxHeightOfJumping) {
        this.maxLenghtOfRunning = maxLenghtOfRunning;
        this.maxHeightOfJumping = maxHeightOfJumping;
    }

    //  Реализуем метод интерфейса AbleToJump
    @Override
    public boolean isJumping(Wall wall) {
        return maxHeightOfJumping >= wall.getHeight();
    }

    //  Реализуем метод интерфейса AbleToRun
    @Override
    public boolean isRunning(Treadmill treadmill) {
        return maxLenghtOfRunning >= treadmill.getLength();
    }

}
