package lesson3.com.geekbrains.java2hw;

import java.util.*;

public class EnterPoint {
    public static void main(String[] args) {
        //  task 1
        //  Создаем массив для хранения слов
        String[] wordsArray = new String[20];
        //  Вызываем метод. заполняющий массив строковыми литералами
        fillArrayWith20Words(wordsArray);
        //  Выводим заполненный массив в консоль для наглядности
        System.out.println("task 1\n" + Arrays.toString(wordsArray));
        //  Вызываем метод, считающий колчиство копий строки в arrayList
        //  И выводящий информацию об этом в консоль
        findEqualsWordsInArray(wordsArray);

        //  task 2
        //  Создаем объект телефонный справочник
        PhoneBook phoneBook = new PhoneBook();
        //  Выводим пустой телефонный справочник в консоль
        System.out.println("task 2\n" + phoneBook);
        //  Добавляем несколько записей в телефонный справочник
        //  Новый абонент - должен добавляться в телефонный справочник
        phoneBook.add("Ishchuk", "8-983-318-6550");
        //  Дубликат уже существующей записи - не должен добавляться в телефонный справочник
        phoneBook.add("Ishchuk", "8-983-318-6550");
        //  Однофамилец - должен добавляться в телефонный справочник
        phoneBook.add("Ishchuk", "8-983-318-6570");
        //  Новый абонент - должен добавляться в телефонный справочник
        phoneBook.add("Mohov", "8-999-999-9999");
        //  Выводим телефонный справочник в консоль с занесенными записями об абонентах
        System.out.println(phoneBook);
        //  Выводим в консоль информацию о всех абонентах с данной фамилией
        phoneBook.get("Ishchuk");
    }

    //  Создаем метод для заполнения arrayList строковыми литералами
    public static void fillArrayWith20Words(String[] wordsArray) {
        String[] words = {"Hello", "My", "Name", "Is", "Andrew",
                "And", "What", "Is", "Your", "Name", "Man", "?",
                "I", "Am", "Glad", "To", "See", "You", "!", "!"};
        for (int i = 0; i < words.length; i++) {
            wordsArray[i] = words[(int) (Math.random() * words.length)];
        }
    }

    //  Создаем метод для поиска повторяющихся слов в массиве,
    //  Вывода слова и количества повторений данного слова в массиве
    public static void findEqualsWordsInArray(String[] array) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (String word : array) {
            hashMap.merge(word, 1, Integer::sum);
        }
        System.out.printf("В массиве %d уникальных значений\n", hashMap.size());
        System.out.println("В массиве каждое слово, повторяется " + hashMap + " раз\n");
    }
}
