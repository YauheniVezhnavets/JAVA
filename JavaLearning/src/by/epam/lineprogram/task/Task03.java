package by.epam.lineprogram.task;

import org.w3c.dom.ls.LSOutput;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения): (𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)*𝑡𝑔 𝑥𝑦
public class Task03 {
    public static void main(String[] args) {
        double x;
        double y;

        double z;


        x=1;
        y=2;

        z=((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);

        System.out.println("z="+z);

    }
}
