package lesson3.com.geekbrains.java2hw;

//  Создаем класс, который будет отражать объекты абонента
public class Person {
    //  Создаем переменные экземпляра для хранения информации об объекте
    private String surname;
    private String phoneNumber;

    //  Инициализируем переменные экземпляра в конструкторе
    public Person(String surname, String phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    //  Метод для получения переменной экземпляра объекта
    public String getSurname() {
        return surname;
    }

    //  Метод для получения переменной экземпляра объекта
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //  Переопределяем метод для корректного вывода информации об объекте
    @Override
    public String toString() {
        return "Фамилия: " + surname + ". " + "Номер телефона: " + phoneNumber + ".";
    }
}
