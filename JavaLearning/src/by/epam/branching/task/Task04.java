package by.epam.branching.task;
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
public class Task04 {
    public static void main(String[] args) {
        int A;
        int B;
        int x;
        int y;
        int z;

        A=3;
        B=4;
        x=3;
        y=2;
        z=1;

        double result=Math.sqrt(Math.pow(A,2)+Math.pow(B,2));

        if (Math.sqrt(Math.pow(x,2)+Math.pow(y,2))<=result)
        System.out.println("Кирпич пройдет 1-м способом");
        else if (Math.sqrt(Math.pow(x,2)+Math.pow(z,2))<=result)
            System.out.println("Кирпич пройдет 2-м способом");
        else if (Math.sqrt(Math.pow(y,2)+Math.pow(z,2))<=result)
            System.out.println("Кирпич пройдет 3-м способом");
        else
            System.out.println("Кирпич не пройдет");
    }
}
