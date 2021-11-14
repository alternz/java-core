package themes.oopbuilding;

public class Apartments {
    private int numberApart;
    private int[] room;

    public Apartments(int numberApart, int[] room) {
        this.numberApart = numberApart;
        this.room = room;
    }

    public int getNumberApart() {
        return numberApart;
    }

    public int getRoom() {
        return room.length;
    }
    public void printApart() {
        System.out.println("Номер квартиры " + getNumberApart() + "\nКоличество комнат: " + getRoom());
    }
}
