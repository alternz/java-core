package themes.oopbuilding;

public class House {
    private int number;
    private int[] floor;

    public House(int number, int[] floor) {
        this.number = number;
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }

    public int getFloor() {
        return floor.length;
    }

    public void printHouse() {
        System.out.println("Номер дома " + getNumber() + "\nКоличество этажей: " + getFloor());
    }


}
