package themes.string.task1;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * “abc Cpddd Dio OsfWw” -> “ABCPDIOSFW”
 */
public class Task1 {

    public static void main(String[] args) {
        String newString = ("abc Cpddd Dio OsfWw");
        System.out.println(format(newString));
    }

    public static String format(String value) {
        String valueUpper = value.replace(" ", "").toUpperCase();
        String resultFinal = "";
        for (int i = 0; i < valueUpper.length() - 1; i++) {
            if (i == 0 || (valueUpper.charAt(i - 1) != valueUpper.charAt(i))) {
                resultFinal += valueUpper.charAt(i);
            }
        }
        return resultFinal;
    }
}

