package org.bob.atm;

/**
 * Создать класс, описывающий банкомат.
 * * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 20, 50 и 100.
 * * Сделать методы для добавления денег в банкомат.
 * * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */

public class AtmRunner {

    public static void main(String[] args) {
        int amountOfCash = 230;
        Atm atm = new Atm(10, 5, 5);
        atm.withdrawMoney(amountOfCash);
        atm.printRemainingBill(atm.getBill20(), atm.getBill50(), atm.getBill100());
        atm.addBill20(5);
        atm.addBill50(3);
        atm.addBill100(6);
        atm.printRemainingBill(atm.getBill20(), atm.getBill50(), atm.getBill100());
    }
}
