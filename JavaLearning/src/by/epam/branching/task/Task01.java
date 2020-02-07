package by.epam.branching.task;
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
public class Task01 {
    public static void main(String[] args) {
        double a;
        double b;

        double c;

        a=30;
        b=60;

        c=180-a-b;

        if (c>=0 && c<180 && a>0 && b>0) {
      System.out.println("Такой трехугольник существует");
         if (c==90){
        System.out.println("И является прямоугольным");
         }
       }
        else
            System.out.println("Такой треугольник не существует");
    }
}
