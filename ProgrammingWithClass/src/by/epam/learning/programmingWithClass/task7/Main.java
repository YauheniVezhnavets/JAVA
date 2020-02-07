package by.epam.learning.programmingWithClass.task7;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
// периметра и точки пересечения медиан.
//решена
public class Main {
    public static void main(String[] args) {
        Triangle tr = new Triangle(1, 1, 5, 1, 3, 4);

        System.out.println("Периметр треугольника=" + TriangleLogic.calculatePerimetr(tr));
        System.out.println("Площадь треугольника=" + TriangleLogic.calculateArea(tr));
        System.out.printf("Центр пересечения медиан x= %.3f y=%.3f",+TriangleLogic.calculateXMedianCentr(tr), TriangleLogic.calculateYMedianCentr(tr));
    }

}
