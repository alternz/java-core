package org.bob.atm;

public class Atm {
    private static final int TWENTY_DOLLARS = 20;
    private static final int FIFTY_DOLLARS = 50;
    private static final int HUNDRED_DOLLARS = 100;

    private int bill20;
    private int bill50;
    private int bill100;

    public Atm(int bill20, int bill50, int bill100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    public void addBill20(int bill20) {
        this.bill20 += bill20;
    }

    public void addBill50(int bill50) {
        this.bill50 += bill50;
    }

    public void addBill100(int bill100) {
        this.bill100 += bill100;
    }

    public boolean withdrawMoney(int amountOfCash) {
        boolean result = false;
        int withdrawBill100;
        int remainingBalance;

        for (withdrawBill100 = 0; withdrawBill100 < this.bill100; withdrawBill100++) {
            remainingBalance = amountOfCash - HUNDRED_DOLLARS * withdrawBill100;
            if (remainingBalance < HUNDRED_DOLLARS) {
                result = true;
                break;
            }
        }
        int withdrawBill50;
        for (withdrawBill50 = 0; withdrawBill50 < this.bill50; withdrawBill50++) {
            remainingBalance = amountOfCash - HUNDRED_DOLLARS * withdrawBill100 - FIFTY_DOLLARS * withdrawBill50;
            if (remainingBalance < FIFTY_DOLLARS) {
                result = true;
                break;
            }
        }
        int withdrawBill20;
        for (withdrawBill20 = 0; withdrawBill20 <= this.bill20; withdrawBill20++) {
            remainingBalance = amountOfCash - HUNDRED_DOLLARS * withdrawBill100 - FIFTY_DOLLARS * withdrawBill50
                    - TWENTY_DOLLARS * withdrawBill20;
            if (remainingBalance == 0) {
                result = true;
                break;
            }
            if (this.bill20 == withdrawBill20) {
                result = false;
            } else if (remainingBalance < TWENTY_DOLLARS) {
                if (withdrawBill50 > 0) {
                    withdrawBill50--;
                } else if (withdrawBill100 > 0) {
                    withdrawBill100--;
                    if (this.bill50 > 0) {
                        withdrawBill50++;
                    }
                }
            }
        }
        System.out.println("Количество купюр номиналом 20: " + withdrawBill20 +
                "\nКоличество купюр номиналом 50: " + withdrawBill50 +
                "\nКоличество купюр номиналом 100: " + withdrawBill100);
        this.bill20 -= withdrawBill20;
        this.bill50 -= withdrawBill50;
        this.bill100 -= withdrawBill100;
        return result;
    }

    public void printRemainingBill(int bill20, int bill50, int bill100) {
        System.out.println("\nКоличество оставшихся купюр номиналом 20: " + this.bill20 +
                "\nКоличество оставшихся купюр номиналом 50: " + this.bill50 +
                "\nКоличество оставшихся купюр номиналом 100: " + this.bill100);
    }

    public int getBill20() {
        return bill20;
    }

    public int getBill50() {
        return bill50;
    }

    public int getBill100() {
        return bill100;
    }
}
