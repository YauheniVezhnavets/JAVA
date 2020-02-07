package by.epam.branching.task;
//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Task03 {
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;

        x1=3;
        y1=3;
        x2=4;
        y2=3;
        x3=3;
        y3=3;


        if ((x2-x1)/(y2-y1)==(x3-x1)/(y3-y1)) {
          if ((x2 == x3) && (y2 == y3))
                System.out.println("Точки лежат на одной прямой и x2y2 совпадает с x3y3");
           else
                System.out.println("Точки лежат на одной прямой");
            }
            else if ((x1==x2 && y1==y2) && (x1==x3 && y1==y3))
            System.out.println("Все три точки совпадают");
           else if ((x3-x2)/(y3-y2)==(x3-x1)/(y3-y1))
            System.out.println("Точки лежат на одной прямой и x1y1 совпадает с x2y2");
            else if ((x1-x2)/(y1-y2)==(x3-x2)/(y3-y2))
            System.out.println("Точки лежат на одной прямой и x1y1 совпадает с x3y3");
         else
            System.out.println("Точки НЕ лежат на одной прямой");

    }
}
