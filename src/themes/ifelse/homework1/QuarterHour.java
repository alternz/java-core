package themes.if_else.homework1;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */
public class QuarterHour {
    public static void main(String[] args) {
        int minutes = 20;
        quarter(minutes);
    }

    public static void quarter(int minutes) {
        if (minutes >= 0 && minutes <= 14) {
            System.out.println("В первую четверть.");
        }
        if (minutes >= 15 && minutes <= 29) {
            System.out.println("Во вторую четверть.");
        }
        if (minutes >= 30 && minutes <= 44) {
            System.out.println("В третью четверть.");
        }
        if (minutes >= 45 && minutes <= 59) {
            System.out.println("В четвертую четверть.");
        }
    }
}
