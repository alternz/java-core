package themes.array.task3;

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
        int[][] changeArray = changeArray(newArray);
        for (int i = 0; i < changeArray.length; i++) {
            for (int j = 0; j < changeArray[i].length; j++) {
                System.out.print(changeArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] changeArray(int[] values) {
        int countNull = 0;
        int countPositive = 0;
        int countNegative = 0;
        for (int value : values) {
            if (value == 0) {
                countNull++;
            } else if (value > 0) {
                countPositive++;
            } else if (value < 0) {
                countNegative++;
            }
        }
        int[] newArrayNull = new int[countNull];
        int[] newArrayPositive = new int[countPositive];
        int[] newArrayNegative = new int[countNegative];
        int ix = 0;
        int ip = 0;
        int in = 0;
        for (int value : values) {
            if (value == 0) {
                newArrayNull[ix] = value;
                ix++;
            } else if (value > 0) {
                newArrayPositive[ip] = value;
                ip++;
            } else if (value < 0) {
                newArrayNegative[in] = value;
                in++;
            }
        }
        int[][] arrayAll = {newArrayPositive, newArrayNull, newArrayNegative};
        return arrayAll;
    }
}