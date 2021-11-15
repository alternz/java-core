package themes.oopbuilding;

public class Room {
    private boolean room;

    public Room(boolean room) {
        this.room = room;
    }

    public boolean isRoom() {
        return room;
    }
    public void printRoom() {
        System.out.println("Комната проходная:" + isRoom());
    }
}
