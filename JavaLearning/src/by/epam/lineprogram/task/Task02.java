package by.epam.lineprogram.task;

public class Task02 { /*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
                          (𝑏+√𝑏2+4𝑎𝑐)/2𝑎−𝑎3𝑐+𝑏−2 */
    public static void main(String[] args) {
        int a;
        int b;
        int c;


        double z;

        a=1;
        b=4;
        c=3;


        z=(b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a-Math.pow(a,3)*c+Math.pow(b,-2);

        System.out.println("z="+z);
    }
}
