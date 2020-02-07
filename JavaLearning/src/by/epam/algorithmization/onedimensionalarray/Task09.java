package by.epam.algorithmization.onedimensionalarray;

import java.util.Random;
//осталось вывести минимальный из повторений
//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
//решена
public class Task09 {
    public static void main(String[] args) {
        int n=10;
        int[] mas = new int[n];
        int countmax=0;
        int ncount=0;
        int number=0;
        int numberMin=0;


        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(10);
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + "  ");
        }
        for (int i=0; i<mas.length-1; i++) {
            if (mas[i]>mas[i+1]){
                int temp=mas[i];
                mas[i]=mas[i+1];
                mas[i+1]=temp;

            }
        }
       System.out.println();
        numberMin=mas[0];
           for(int i=0;i<mas.length;i++){
                ncount=1;
                for(int j=i+1;j<mas.length;j++) {
                    if (mas[i] == mas[j])
                        ncount++;
                }
               if(ncount>countmax){
                   countmax=ncount;
                   number=mas[i];
                   if (numberMin>mas[i]) {
                       numberMin=mas[i];
                   }
              }

               System.out.print(ncount+ " ");

        }
        System.out.println();
        System.out.print("Количество повторений=");
       System.out.println(countmax);
        System.out.println(number);

    }
}



