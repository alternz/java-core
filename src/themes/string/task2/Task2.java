package themes.string.task2;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2 {

    public static void main(String[] args) {
        String newString = ("Привет 8, как 1 2 твои дела? Мож4ет4, сдe8елать 3 де5ло?");
        int[] digitArray = convertStringToArray(newString);
        System.out.println("Cумма всех чисел из строки равна: " + sumArray(digitArray));
    }

    public static int[] convertStringToArray(String value) {
        String[] digit = value.replaceAll("\\D+", "").split("");
        int[] outArr = new int[digit.length];
        for (int i = 0; i < digit.length; i++) {
            outArr[i] = Integer.parseInt(digit[i]);
        }
        return outArr;
    }

    public static int sumArray(int[] value) {
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }
        return sum;
    }
}
