package by.epam.lineprogram.task;

import java.io.OutputStream;

/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
public class Task04 {
    public static void main(String[] args) {
        double a;
        int b;
        int c;


        a=754.325;
        b= (int) a;
        c=(int)((a-b)*1000);

        System.out.println(c+"."+b);

    }
}
