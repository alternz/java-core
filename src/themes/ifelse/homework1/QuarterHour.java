package themes.ifelse.homework1;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */
public class QuarterHour {

    public static void main(String[] args) {
        int minutes = 20;
        calculateQuarter(minutes);
    }

    public static void calculateQuarter(int minutes) {
        if (minutes >= 0 && minutes <= 14) {
            System.out.println("В первую четверть.");
        } else if (minutes >= 15 && minutes <= 29) {
            System.out.println("Во вторую четверть.");
        } else if (minutes >= 30 && minutes <= 44) {
            System.out.println("В третью четверть.");
        } else if (minutes >= 45 && minutes <= 59) {
            System.out.println("В четвертую четверть.");
        }
    }
}
