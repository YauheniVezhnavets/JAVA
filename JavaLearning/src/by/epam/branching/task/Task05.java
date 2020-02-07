package by.epam.branching.task;
/*                                    x2-3x+9, если x<=3
Вычислить значение функции:  F(x)=    1/(x^3+6), если x>3
 */

public class Task05 {
    public static void main(String[] args) {
        double x;
        double Fx;

        x=2;

        if (x<=3) {
            Fx=Math.pow(x,2)-3*x+9;
        System.out.println(Fx);}
        else {
            Fx = 1 / (Math.pow(x, 3) + 6);
            System.out.println(Fx);
        }
    }
}
