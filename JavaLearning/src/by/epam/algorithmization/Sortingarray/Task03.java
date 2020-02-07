package by.epam.algorithmization.Sortingarray;

import java.util.Random;

//3. Сортировка выбором. Дана последовательность чисел a1<=a2<=an .Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.
//решена
public class Task03 {
    public static void main(String[] args) {
        int n=10;
        int max;
        int indexMax;

        int [] mas=new int [n];

        Random rand =new Random();

        for (int i=0; i<mas.length;i++){
            mas[i]=rand.nextInt(100);
            }

        for (int i=0; i<mas.length;i++){
            System.out.print(mas[i]+" ");
        }

        for (int i=0; i<mas.length-1;i++){
            max=mas[i];
            indexMax=i;
            for (int j=i+1; j<mas.length;j++){
                if (max<mas[j]){
                    max=mas[j];
                    indexMax=j;
                }
            }
            mas[indexMax]=mas[i];
            mas[i]=max;
        }
        System.out.println();
        System.out.println("Отсортированный массив");
        for (int i=0; i<mas.length;i++){
            System.out.print(mas[i]+" ");
        }
    }
}
