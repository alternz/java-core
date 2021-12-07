package org.bob.oopbuilding;

public class Room {

    private final boolean room;

    public Room(boolean room) {
        this.room = room;
    }

    public void printRoom() {
        System.out.println("Комната проходная:" + room);
    }
}
