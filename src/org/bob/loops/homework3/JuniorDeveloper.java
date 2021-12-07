package org.bob.loops.homework3;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class JuniorDeveloper {
    public static void main(String[] args) {
        int salary = 600;
        int percentage = 10;
        int spending = 300;
        double broker = 0;
        int current = 0;
        calculateInvest(salary, percentage, spending, broker, current);
    }

    public static void calculateInvest(int salary, int percentage, int spending, double broker, int current) {
        for (int month = 1; month <= 32; month++) {
            int acc = salary - (salary / percentage) - spending;
            double invest = ((double) salary / 10 + broker);
            current = acc + current;
            broker = invest * 1.02;
            if (month % 6 == 0) {
                salary += 400;
            }
        }
        System.out.println("Зарплата " + salary);
        System.out.println("Cредств на своём счету: " + current);
        System.out.println("Средств на счету брокера: " + broker);
    }
}
