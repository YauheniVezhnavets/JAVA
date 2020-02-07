package by.epam.cycle.task;
//Вычислить значения функции на отрезке [а,b] c шагом h:    x,x>2
//                                                       y= -x, x<=2

public class Task02 {
    public static void main(String[] args) {
        double a, b, h;

        double y;


        a = 0;
        b = 3;
        h = 0.5;

        for (double x = a; x <= b; x = x + h) {
            if (x > 2) {
                y = x;
                System.out.println(y);
            }
            if (x==0){
                System.out.println(0);
            }
            else {
                y=-x;
                System.out.println(y);
            }
        }


    }
}
