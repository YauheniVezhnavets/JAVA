package by.epam.algorithmization.onedimensionalarray;

import java.sql.SQLOutput;
import java.util.Scanner;
//решена
//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.
public class Task02 {
    public static void main(String[] args) {
        int Z;   //заданное число
        int n;   //количество замен
        int [] mas= new int [10];

        Z=8;
        n=0;

        Scanner sc= new Scanner(System.in);
        for (int i=0; i<mas.length; i++){
            System.out.print("> ");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("> ");
            }
        mas[i]=sc.nextInt();
        }
        for (int i=0; i<mas.length; i++) {
            if (mas[i] > Z) {
                mas[i] = Z;
                n = n + 1;
            }
        }
            for (int i=0; i<mas.length; i++) {
                System.out.print(mas[i]+" ");
            }
            System.out.println("Количество замен="+n);
        }
    }


