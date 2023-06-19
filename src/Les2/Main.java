package Les2;
//1	Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2	Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3	В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        String[][] array = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        String[][] array1 = {{"1", "1", "1", "1", "1"}, {"2", "2", "2"}, {"3", "3", "3"}, {"4", "4", "4", "4"}};
        String[][] array2 = {{"1", "1", "1", "1"}, {"2", "fff", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};

        System.out.println("Задание №1");
        System.out.print("array: ");
        try {
            System.out.println(arrayLengthCheck(array));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        System.out.print("array1: ");
        try {
            System.out.println(arrayLengthCheck(array1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }


        System.out.println();
        System.out.println("Задание №2:");

        try {
            System.out.println("Сумма элементов массива: " + arrayNumbersSum(array));
        } catch (MyArrayDataExeption e) {
            System.out.println("Невозможно вычислить сумму, ошибка в ячейке: " + e.i + "x" + e.j);
        }

        try {
            System.out.println("Сумма элементов массива: " + arrayNumbersSum(array2));
        } catch (MyArrayDataExeption e) {
            System.out.println("Невозможно вычислить сумму, ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }

    public static boolean arrayLengthCheck(String[][] array) throws MyArraySizeException {
        for (int i = 0; i < array.length; i++) {
            if (array.length < 4 || array.length > 4) {
                throw new MyArraySizeException("Размер массива должен быть 4х4");
            }
        }
        return true;
    }

    public static int arrayNumbersSum(String[][] array) throws MyArrayDataExeption {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption(i, j);
                }
            }
        }
        return sum;
    }


}


