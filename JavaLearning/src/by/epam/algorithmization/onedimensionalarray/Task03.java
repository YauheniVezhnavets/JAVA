package by.epam.algorithmization.onedimensionalarray;

import java.util.Random;
//решена
//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.
public class Task03 {
    public static void main(String[] args) {
        int temp;
        int a; //количество положительных чисел
        int b; //количество отрицательных чисел
        int c; //количество нулей
        double [] mas=new double[10];

        a=0;
        b=0;
        c=0;

        Random rand= new Random();
        for (int i=0; i<mas.length;i++) {
            temp=rand.nextInt()/1000000;
            mas[i] = temp+rand.nextDouble();
        }
        for (int i=0; i<mas.length;i++) {
            if (mas[i]>0)
                a++;
            else if (mas[i]<0)
                b++;
            else
                c++;
        }
        for (int i=0; i<mas.length;i++) {
            System.out.printf("%.2f  ",mas[i]);

        }
        System.out.println();
        System.out.println("Количество положительных чисел=" +a);
        System.out.println("Количество отрицательных чисел=" +b);
        System.out.println("Количество нулей=" +c);
    }
}
