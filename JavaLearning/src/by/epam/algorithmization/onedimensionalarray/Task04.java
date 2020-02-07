package by.epam.algorithmization.onedimensionalarray;

import java.util.Random;
//решена
//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Task04 {
    public static void main(String[] args) {
        double temp;
        double max;
        double min;
        int imin;
        int imax;

        double[] mas = new double[10];
        max= mas[0];
        min= mas[0];
        imin=0;
        imax=0;

        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            temp = rand.nextInt() / 1000000;
            mas[i] = temp + rand.nextDouble();
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.printf("%.2f  ",mas[i]);
        }
        for (int i = 0; i < mas.length-1; i++) {
            if (mas[i]<min) {
                min = mas[i];
                imin=i;
            }
            if (mas[i]>max) {
                max = mas[i];
                imax=i;
            }


        }
                System.out.println();
        System.out.printf("Минимальное значение %.2f",min);
        System.out.println();
        System.out.printf("Максимальное значение %.2f",max);


        System.out.println();
        System.out.println("Новый массив" );
        mas[imin]=max;
        mas[imax]=min;
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("%.2f  ", mas[i]);
        }

    }
}
