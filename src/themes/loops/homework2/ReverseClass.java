package themes.loops.homework2;

import java.util.Scanner;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class InverseClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();
        System.out.println("Инвертированное число: " + inverse(value));

    }

    public static int inverse(int value) {
        int inverse = 0;
        while (value > 0) {
            inverse = inverse * 10 + value % 10;
            value /= 10;
        }
        return inverse;
    }
}
