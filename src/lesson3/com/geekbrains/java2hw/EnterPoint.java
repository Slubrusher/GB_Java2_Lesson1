package lesson3.com.geekbrains.java2hw;

import java.util.*;

public class EnterPoint {
    public static void main(String[] args) {
        //  Создаем arrayList для хранения слов
        List<String> arrayList = new ArrayList<>();
        //  Вызываем метод. заполняющий arrayList строковыми литералами
        fillArrayListWith20Words(arrayList);
        //  Выводим заполненный arrayList в консоль для наглядности
        System.out.println("task 1\n" + arrayList);
        //  Вызываем метод, считающий колчиство копий строки в arrayList
        //  И выводящий информацию об этом в консоль
        findEqualsWordsInArray(arrayList);

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
    public static void fillArrayListWith20Words(List<String> arrayLst) {
        String[] words = {"Hello", "My", "Name", "Is", "Andrew",
                "And", "What", "Is", "Your", "Name", "Man", "?",
                "I", "Am", "Glad", "To", "See", "You", "!", "!"};
        for (int i = 0; i < 20; i++) {
            arrayLst.add(words[(int) (Math.random() * words.length)]);
        }
    }

    //  Создаем метод для поиска повторяющихся слов в массиве,
    //  Вывода слова и количества повторений данного слова в массиве
    public static void findEqualsWordsInArray(List<String> arrayList) {
        //  Создаем дополнительный arrayList, чтобы не изменять изначальный
        List<String> innerArray = arrayList.subList(0, arrayList.size());
        //  Создаем буфер для хранения сравниваемого слова
        String basicWord;
        //  Создаем буфер для хранения количства копий слова
        int wordsCounter;
        //  На каждом шагу цикла проверяем 1 слово
        for (int i = 0; i < innerArray.size(); i++) {
            //  Т.к. мы заменяем копии слова null, то если слово копии которого мы пытаемся найти == null
            //  То пропускаем итерацию, и переходим к поиску следующего слова
            if(innerArray.get(i) == null) {
                continue;
            }
            //  На каждой итерации внешнего цикла берем по одному слову для поиска копий во внутреннем цикле
            basicWord = innerArray.get(i);
            //  Т.к. наше слово проверяет весь массив, в том числе и само себя,
            //  Устанавливаем значение буфера равным 0
            wordsCounter = 0;
            //  Проходимся по внутреннему массиву и ищем копии слова,
            //  Все найденные копии, в том числе и изначальное слова заменяем на null
            for (int j = i; j < innerArray.size(); j++) {
                //  Если значение arrayList которое мы хотим проверить == null,
                //  Пропускаем итерацию
                if (innerArray.get(j) == null) {
                    continue;
                }
                //  Если нашли копию итерируем буфер и заменяем слово на null
                if (basicWord.equals(innerArray.get(j))) {
                    wordsCounter++;
                    innerArray.set(j, null);
                }
            }
            //  Выводим информацию о количестве копий данного слова в консоль
            //  Форматируем строку для красоты вывода
            System.out.printf("Слово %-7s повторяется %-2d раз\n", basicWord, wordsCounter);
        }
    }
}
