package org.bob.array.task2;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */
public class Task2 {

    public static void main(String[] args) {
        char[] symbolArray = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] newArray = convertCharToInt(symbolArray);
        double average = calculateAverage(newArray);
        System.out.println(average);
        printMoreAverage(average, newArray);
    }

    public static void printMoreAverage(double average, int[] values) {
        for (int value1 : values) {
            if (value1 > average) {
                System.out.print(value1 + " ");
            }
        }
    }

    public static double calculateAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }

    public static int[] convertCharToInt(char[] values) {
        int[] newArray = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            newArray[i] = values[i];
        }
        return newArray;
    }
}
