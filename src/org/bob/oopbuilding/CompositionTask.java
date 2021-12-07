package org.bob.oopbuilding;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем,
 * его этажах, квартирах и комнатах, вызывая методы print.
 */
public class CompositionTask {

    public static void main(String[] args) {
        Room[] rooms1 = {
                new Room(false),
                new Room(false)
        };
        Room[] rooms2 = {
                new Room(true),
                new Room(false),
                new Room(false),
        };
        Apartment[] apartments1 = {
                new Apartment(1, rooms1),
                new Apartment(2, rooms2)
        };
        Room[] rooms3 = {
                new Room(false),
        };
        Room[] rooms4 = {
                new Room(true),
                new Room(true),
                new Room(false)
        };
        Room[] rooms5 = {
                new Room(false),
                new Room(false),
        };
        Apartment[] apartments2 = {
                new Apartment(3, rooms3),
                new Apartment(4, rooms4),
                new Apartment(5, rooms5)
        };
        Floor[] floors = {
                new Floor(1, apartments1),
                new Floor(2, apartments2)
        };
        House house = new House(2, floors);

        printInformation(house);
    }

    public static void printInformation(House house) {
        house.printHouse();
        for (Floor floor : house.getFloor()) {
            floor.printFloor();
            for (Apartment apartment : floor.getApartments()) {
                apartment.printApart();
                for (Room room : apartment.getRooms()) {
                    room.printRoom();
                }
            }
        }
    }
}
