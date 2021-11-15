package themes.array.task1;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class Task1 {

    public static void main(String[] args) {
        int[] myArray = {7, 5, 6, -8, 2, 17, -45, 72};
        System.out.println(Arrays.toString(deleteNegativeAndMultiplication(myArray)));
    }

    public static int[] deleteNegativeAndMultiplication(int[] values) {
        int count = 0;
        for (int value : values) {
            if (value >= 0) {
                count++;
            }
        }
        int position = 0;
        int[] newArray = new int[count];
        for (int value : values) {
            if (value >= 0) {
                newArray[position] = value * count;
                position++;
            }
        }
        return newArray;
    }
}

