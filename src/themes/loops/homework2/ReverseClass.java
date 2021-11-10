package themes.loops.homework2;

import java.util.Scanner;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class ReverseClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Инвертированное число: " + reverseNumber(number));

    }

    public static int reverseNumber(int value) {
        int reverse = 0;
        while (value != 0) {
            reverse = reverse * 10 + value % 10;
            value /= 10;
        }
        return reverse;
    }
}
