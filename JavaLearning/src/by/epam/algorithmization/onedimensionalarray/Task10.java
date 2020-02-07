package by.epam.algorithmization.onedimensionalarray;

import java.util.Arrays;
import java.util.Random;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
//решена
public class Task10 {


        public static void main(String[] args) {
            int [] mas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,13,17,9,20,7};


            for (int i = 0; i < mas.length; i++){
                System.out.print(mas[i]+" ");
            }
            System.out.println();

            // нумерация элементов массива начинается с 0
            // значит, "каждый второй" - это 1, 3, 5, 7 и т.д.
            // то есть, нечётные
            int c = 1;
            for (int i = 2; i < mas.length; i += 2) {
                mas[c] = mas[i];
                c++;
            }
            if (mas.length%2==0) {
                for (int i = mas.length / 2; i < mas.length; i++) {
                    mas[i] = 0;
                }
            }
            else {
                for (int i = mas.length / 2 + 1; i < mas.length; i++) {
                    mas[i] = 0;
                }
            }


            for (int i = 0; i < mas.length ; i++) {
                System.out.print(mas[i] + " ");
            }
       }
    }

