package themes.function.homework1;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */
public class QuarterHour {
    public static void main(String[] args) {
        int minutes = 20;
        quarter(minutes );
    }

    public static void quarter(int minutes) {
        if (minutes >= 0 && minutes <= 15) {
            System.out.println("В первую четверть.");
        }
        if (minutes >= 16 && minutes <= 30) {
            System.out.println("Во вторую четверть.");
        }
        if (minutes >= 31 && minutes <= 45) {
            System.out.println("В третью четверть.");
        }
        if (minutes >= 46 && minutes <= 59) {
            System.out.println("В четвертую четверть.");
        }
    }
}
