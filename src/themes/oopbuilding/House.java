package themes.oopbuilding;

public class House {

    private final int number;
    private final Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public Floor[] getFloor() {
        return floors;
    }

    public void printHouse() {
        System.out.println("Номер дома " + number + "\nКоличество этажей: " + floors.length);
    }
}
