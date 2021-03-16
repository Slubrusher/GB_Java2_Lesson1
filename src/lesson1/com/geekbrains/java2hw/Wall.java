package com.geekbrains.java2hw;

public class Wall implements Obstacles{

    //  Объявлеяем переменную экземпляра для хранения длины препятствия
    private double height;

    //  Создаем конструктор для инициализации переменной экземпляра
    public Wall(double height) {
        this.height = height;
    }

    //  Реализуем наследуемый метод и передаем участнику ссылку на препятствие
    @Override
    public void doAction(AbleToAction player) {
        player.jump(this);
    }

    //  Создаем геттер для получения значения переменной экземпляра
    public double getHeight() {
        return height;
    }
}
