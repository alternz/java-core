package themes.loops.homework1;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        long value = scanner.nextLong();
        System.out.println("Количество чётных цифр: " + evenFunction(value));
        System.out.println("Количество нечётных цифр: " + oddFunction(value));
    }

    public static int evenFunction(long number) {
        long reminder = 0;
        long value = number;
        int count = 0;
        while (value != 0) {
            reminder = value % 10;
            value = value / 10;
            if (reminder % 2 == 0)
                count++;
        }
        return count;
    }

    public static int oddFunction(long number) {
        long reminder = 0;
        long value = number;
        int count = 0;
        while (value != 0) {
            reminder = value % 10;
            value = value / 10;
            if (reminder % 2 != 0)
                count++;
        }
        return count;
    }
}
