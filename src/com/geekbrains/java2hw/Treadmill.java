package com.geekbrains.java2hw;

public class Treadmill implements Obstacles{

    //  Объявлеяем переменную экземпляра для хранения длины препятствия
    private double length;

    //  Создаем конструктор для инициализации переменной экземпляра
    public Treadmill(double length) {
        this.length = length;
    }

    //  Создаем геттер для получения значения переменной экземпляра
    public double getLength() {
        return length;
    }
}
