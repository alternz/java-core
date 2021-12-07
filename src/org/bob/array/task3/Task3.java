package org.bob.array.task3;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами,
 * только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 */
public class Task3 {

    public static void main(String[] args) {
        int[] newArray = {-4, 0, 1, 9, 20, -18, 3};
        int[] count = countArray(newArray);
        int[][] change = changeArray(count, newArray);
        for (int i = 0; i < change.length; i++) {
            for (int j = 0; j < change[i].length; j++) {
                System.out.print(change[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] countArray(int[] values) {
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;
        for (int value : values) {
            if (value == 0) {
                countZero++;
            } else if (value > 0) {
                countPositive++;
            } else if (value < 0) {
                countNegative++;
            }

        }
        return new int[]{countZero, countPositive, countNegative};
    }

    public static int[][] changeArray(int[] count, int[] values) {
        int[] newArrayZero = new int[count[0]];
        int[] newArrayPositive = new int[count[1]];
        int[] newArrayNegative = new int[count[2]];
        int ix = 0;
        int ip = 0;
        int in = 0;
        for (int value : values) {
            if (value == 0) {
                newArrayZero[ix] = value;
                ix++;
            } else if (value > 0) {
                newArrayPositive[ip] = value;
                ip++;
            } else if (value < 0) {
                newArrayNegative[in] = value;
                in++;
            }
        }
        return new int[][]{newArrayPositive, newArrayZero, newArrayNegative};
    }
}
