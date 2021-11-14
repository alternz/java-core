package themes.oopbuilding;

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
        House house = new House(1, new int[]{1, 2});
        Floor floor1 = new Floor(1, new int[]{1, 2, 3});
        Apartments apartments1 = new Apartments(1, new int[]{1, 2});
        Room room1 = new Room(true);
        Apartments apartments2 = new Apartments(2, new int[]{1, 2, 3});
        Apartments apartments3 = new Apartments(2, new int[]{1});
        Floor floor2 = new Floor(2, new int[]{4, 5, 6});
        Floor floor3 = new Floor(3, new int[]{7, 8, 9});
        printAllInformation(house);
    }

    public static void printAllInformation(House house) {
        house.printHouse();
    }
}
