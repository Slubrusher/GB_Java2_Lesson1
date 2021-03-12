package com.geekbrains.java2hw;

public class Wall implements Obstacles{

    //  Объявлеяем переменную экземпляра для хранения длины препятствия
    private double height;

    //  Создаем конструктор для инициализации переменной экземпляра
    public Wall(double height) {
        this.height = height;
    }

    //  Создаем геттер для получения значения переменной экземпляра
    public double getHeight() {
        return height;
    }
}
