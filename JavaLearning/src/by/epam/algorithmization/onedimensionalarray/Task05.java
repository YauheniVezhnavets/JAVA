package by.epam.algorithmization.onedimensionalarray;

import java.util.Random;
//решена
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Task05 {
    public static void main(String[] args) {
        int [] mas = new int[10];

        System.out.println("Первоначальный массив");

       Random rand = new Random();
       for (int i = 0; i < mas.length; i++) {
         mas [i] = rand.nextInt(10);
           System.out.print(mas[i]+"  ");
               }
        System.out.println();
        System.out.println("Измененный массив");

       for (int i = 0; i < mas.length; i++) {
            if (mas[i]>i)
                System.out.print(mas[i]+ "  ");
            }
       }
}
