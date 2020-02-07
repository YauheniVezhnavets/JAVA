package by.epam.algorithmization.arraysOfArrays;

import java.util.Random;

//10. Найти положительные элементы главной диагонали квадратной матрицы.
//решена
public class Task10 {
       public static void main(String[] args) {
            int n;
            n=5;
            int [][] mas=new int [n][n];

            Random rand =new Random();
            for (int i=0; i<mas.length; i++){
                for (int j=0; j< mas[i].length;j++){
                    mas[i][j]=rand.nextInt(100)-50;
                }
            }
            for (int i=0; i<mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
                }
                System.out.println();
            }
            System.out.print("Положительные элементы главной диагонали матрицы");
            for (int i=0; i<mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    if ((i == j)&& mas[i][j]>0) {
                        System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
                    }
                }
                System.out.println();
            }

    }
}
