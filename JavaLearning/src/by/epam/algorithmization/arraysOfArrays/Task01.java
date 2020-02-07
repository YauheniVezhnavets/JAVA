package by.epam.algorithmization.arraysOfArrays;

import java.util.Random;
//решена
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task01 {
    public static void main(String[] args) {
        int [][] mas=new int [10] [10];
        Random rand =new Random();
        for (int i=0; i<mas.length;i++){
            for (int j=0; j<mas[i].length;j++){
                mas[i][j]=rand.nextInt(100);
            }
        }
        for (int i=0; i<mas.length;i++){
            for (int j=0; j<mas[i].length;j++) {
                System.out.printf("mas[%d][%d]=%-6d",i,j,mas[i][j]);
              }
            System.out.println();
        }
        System.out.println();
        System.out.println("Отредактированный массив");

        for (int i=0; i<mas.length;i++){
            for (int j=0; j<mas[i].length;j+=2){
                if (mas[0][j]>mas[mas.length-1][j]  ){
                    System.out.printf("mas[%d][%d]=%-6d",i,j,mas[i][j]);
                }

            }
            System.out.println();
        }
    }
}
