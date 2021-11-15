package themes.oopbuilding;

public class Floor {
    private int numberFloor;
    private int[] apartments;

    public Floor(int numberFloor, int[] apartments) {
        this.numberFloor = numberFloor;
        this.apartments = apartments;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public int getApartments() {
        return apartments.length;
    }
    public void printFloor() {
        System.out.println("Номер этажа " + getNumberFloor() + "\nКоличество квартир: " + getApartments());
    }
}
