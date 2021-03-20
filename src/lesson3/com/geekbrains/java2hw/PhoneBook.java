package lesson3.com.geekbrains.java2hw;


import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    //  Создаем arrayList для хранения объектов типа Person
    private List<Person> personList = new ArrayList<>();

    //  Создаем метод для добавления нового абонента в телефонный спраочник
    public void add(String surname, String phoneNumber) {
        //  Проверка на дублирование
        for (Person person : personList) {
            if (surname.equals(person.getSurname()) && phoneNumber.equals(person.getPhoneNumber())) {
                return;
            }
        }
        //  Метод добавления нового абонента в справочник
        personList.add(new Person(surname, phoneNumber));
    }

    //  Создаем метод для отображения информации об абоненте по фамилии
    public void get(String surname) {
        //  Проходимся по циклу и выводим всех абонентов с данной фамилией
        for (Person person : personList) {
            if (surname.equals(person.getSurname())) {
                System.out.println(person);
            }
        }
    }

    //  Переопределяем метод для более корректного отображения информации
    @Override
    public String toString() {
        return "В телефонной книге содержатся записи: " + personList + ".";
    }
}
