package lesson2.com.geekbrains.java2hw;
//  Создаем свою версию исключения, которое бы ругалось на то, что в массиве лежат данные из которых нельзя парсить int
public class MyArrayDataException extends NumberFormatException{
    //  Создаем конструктор для указания ячейки массива, в которой содержатся некорректные данные
    public MyArrayDataException(int row, int column) {
        super("В ячейке массива {" + row + "," + column + "} содержаться неверные данные!!!");
    }
}
