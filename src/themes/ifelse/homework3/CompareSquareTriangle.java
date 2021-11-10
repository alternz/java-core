package themes.if_else.homework3;

/**
 * Даны два прямоугольных треугольника. Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class CompareSquareTriangle {
    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 8;
        double S1 = squareTriangle(a1, b1);
        System.out.println(S1);

        int a2 = 8;
        int b2 = 14;
        double S2 = squareTriangle(a2, b2);
        System.out.println(S2);
        compareSquare(S1, S2);
    }

    public static double squareTriangle(int a, int b) {
        double S;
        S = a * b * 0.5;
        return S;
    }

    public static void compareSquare(double S1, double S2) {
        if (S1 > S2) {
            System.out.println("Площадь первого треугольника больше второго треугольника");
        } else if (S1 == S2) {
            System.out.println("Площадь первого треугольника равна площади второго треугольника");
        } else {
            System.out.println("Площадь первого треугольника меньше площади второго треугольника");
        }
    }
}
