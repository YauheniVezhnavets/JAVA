package by.epam.method;
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
//решена
public class Task03 {
    public static void main(String[] args) {
     int a=5;

     double x=Method.getHexagonArea(a);
      System.out.println("Площадь правильного шестиугольника= "+x);
    }
}
