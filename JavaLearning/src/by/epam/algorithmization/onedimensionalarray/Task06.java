package by.epam.algorithmization.onedimensionalarray;

import java.util.Random;
//решена
//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.
public class Task06 {
     public static void main(String[] args) {
            int [] mas = new int[20];
            int sum=0;


            System.out.println("Первоначальный массив");

            Random rand = new Random();
            for (int i = 0; i < mas.length; i++) {
                mas [i] = rand.nextInt(10);
                System.out.print(mas[i]+" ");
            }
            System.out.println();
            System.out.println("Измененный массив");


         boolean isprime;
         for(int i=2; i < mas.length; i++) {
             isprime = true;
             // проверить, делится ли число без остатка
             for (int j=2; j <= i/j; j++)
                 // если число делится без остатка, значит, оно не простое
                 if((i%j) == 0) isprime = false;
             if (isprime) {
                 System.out.print(mas[i] + " ");
                 sum = sum + mas[i];
             }
            }
         System.out.println();
         System.out.print("Сумма равна=");
         System.out.print(sum);
        }
    }


