package lesson2.com.geekbrains.java2hw;
//  Создаем свою версию исключения, которое бы ругалось на то, что размер массива не соответствует 4x4
public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Размер массива должен быть 4х4!!!");
    }
}
