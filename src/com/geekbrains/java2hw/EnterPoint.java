package com.geekbrains.java2hw;

public class EnterPoint {

    public static void main(String[] args) {

        //  Создаем участников испытания
        Human human1 = new Human(10, 1, "Владимир");
        Human human2 = new Human(5, 0.5, "Александр");
        Cat cat1 = new Cat(1, 3, "Барсик");
        Cat cat2 = new Cat(2, 4, "Мурзик");
        Robot robot1 = new Robot(30, 5, "Т-800");
        Robot robot2 = new Robot(20, 4, "Т-1000");

        //  Объявляем и инициализируем массив с участниками
        AbleToAction[] players = new AbleToAction[6];
        players[0] = human1;
        players[1] = human2;
        players[2] = cat1;
        players[3] = cat2;
        players[4] = robot1;
        players[5] = robot2;

        //  Создаем препятствия для участников испытания
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(3);
        Treadmill treadmill1 = new Treadmill(3);
        Treadmill treadmill2 = new Treadmill(5);

        //  Объявляем и инициализируем массив с препятствиями
        Obstacles[] obstacles = new Obstacles[4];
        obstacles[0] = wall1;
        obstacles[1] = wall2;
        obstacles[2] = treadmill1;
        obstacles[3] = treadmill2;

        //  Вызываем метод, который заставляет участников преодолевать препятствия
        doExercises(players, obstacles);
    }

    //  Создаем метод, принимающий на вход массив участников и массив препятсвий,
    //  Который прогоняет всех участников через все препятствия
    public static void doExercises(AbleToAction[] players, Obstacles[] obstacles) {

        //  Проходимся по массиву участников
        for (AbleToAction player : players) {
            //  Проходимся по массиву препятствий
            for (Obstacles obstacle : obstacles) {
                obstacle.doAction(player);
            }
        }
    }
}
