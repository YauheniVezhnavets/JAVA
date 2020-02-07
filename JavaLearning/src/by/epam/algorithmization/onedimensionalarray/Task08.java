package by.epam.algorithmization.onedimensionalarray;


import java.util.Random;
//решена

//Дана последовательность целых чисел  a1 ,a2 ,... ,an . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1 ,a2 ,...an)
public class Task08 {
    public static void main(String[] args) {
        int n=10;
        int [] mas= new int [n];
        int min;
        int index;
        int count=0;
        Random rand =new Random();
        for (int i=0; i<mas.length;i++){
            mas[i]=rand.nextInt(100);
        }
        min=mas[0];
        index=0;
        for (int i=0; i<mas.length;i++){
            System.out.print(mas[i]+"  ");
        }
        for (int i=0; i<mas.length;i++){
            if (min>mas[i]){
               min=mas[i];
               index=i;
               }
        }
        for (int i=0; i<mas.length;i++){
            if (min>mas[i]){
                min=mas[i];
                index=i;
            }
        }
        for (int i=0;i<mas.length;i++){
            if (mas[i]==min){
                count++;
                }
        }

        System.out.println();
        System.out.println("Минимальное знаение="+min);
        System.out.println("Индекс минимального значения="+index);
        System.out.println("Количество повторений минимального значения="+count);
        int j=0;
        int [] mas2=new int[n-count];
        for (int i=0;i<mas.length;i++){
            if (mas[i]!=min){
                mas2[j]=mas[i];
                j++;
            }
        }
        System.out.println("Новый массив:");
        for (j=0;j<mas2.length;j++) {
            System.out.print(mas2[j]+" ");
            }
        }
    }

