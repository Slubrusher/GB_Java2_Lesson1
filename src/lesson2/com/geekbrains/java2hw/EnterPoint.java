package lesson2.com.geekbrains.java2hw;

public class EnterPoint {
    public static void main(String[] args) {
        //  Создаем тестовые массивы
        String[][] stringArray1 = new String[2][2];
        String[][] stringArray2 = new String[4][4];
        String[][] stringArray3 = new String[6][6];
        String[][] stringArray4 = new String[4][4];
        String[][] stringArray5 = new String[4][4];
        //  Заполняем тестовые массивы значеними
        fillSquareArray(stringArray1);
        fillSquareArray(stringArray2);
        fillSquareArray(stringArray3);
        fillSquareArray(stringArray4);
        fillSquareArray(stringArray5);
        stringArray4[2][2] = null;
        stringArray5[1][2] = "you cannot parse from me";
        //  Вызываем метод, обрабатывая исключения, с разными входными аргументами
        checkMyExceptions(stringArray1);    //  должны получить MyArraySizeException
        checkMyExceptions(stringArray2);    //  должны получить 36
        checkMyExceptions(stringArray3);    //  должны получить MyArraySizeException
        checkMyExceptions(stringArray4);    //  должны получить MyArrayDataException с укзанием ячейки {2,2}
        checkMyExceptions(stringArray5);    //  должны получить MyArrayDataException с укзанием ячейки {1,2}
    }
    //  Создаем метод, считывающий сумму элементов двумерного массива
    public static void sumElemsInArray(String[][] array) throws MyArraySizeException, MyArrayDataException{
        //  Объявляем и инициализируем переменную для хранения суммы
        int sumBuffer = 0;
        //  Проходимя по двумерному массиву
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //  Проверка входного массива любой размерности на соответствие требованию быть равным 4х4
                if (array.length != 4 || array[i].length != 4) {
                    throw new MyArraySizeException();
                }
                //  Пытаемся парсить int из String, в случае если не получается
                //  Перехватываем генерируемое исключение и выбрасываем свое исключение
                //  При этом конкретизируя где и какой элемент некорректен
                try {
                    sumBuffer += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        System.out.println("Сумма всех элементов массива: " + sumBuffer);
    }
    //  Создаем метод для заполнения двумерного массива
    public static void fillSquareArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j + "";
            }
        }
    }
    //  Создаем метод, обрабатывающий мои исключения, для тестов и уменьшения повторяемого кода
    public static void checkMyExceptions(String[][] array) {
        try {
            sumElemsInArray(array);
        } catch (MyArrayDataException | MyArraySizeException e1) {
            e1.printStackTrace();
        }
    }
}
