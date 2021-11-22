package themes.oopbuilding;

public class Floor {

    private final int numberFloor;
    private final Apartment[] apartments;

    public Floor(int numberFloor, Apartment[] apartments) {
        this.numberFloor = numberFloor;
        this.apartments = apartments;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void printFloor() {
        System.out.println("Номер этажа " + numberFloor + "\nКоличество квартир: " + apartments.length);
    }
}
