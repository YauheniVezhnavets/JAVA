package by.epam.algorithmization.arraysOfArrays;

import java.util.Random;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
//решена
public class Task02 {
    public static void main(String[] args) {
        int n;
        n=5;
        int [][] mas=new int [n][n];

        Random rand =new Random();
        for (int i=0; i<mas.length; i++){
            for (int j=0; j< mas[i].length;j++){
                mas[i][j]=rand.nextInt(100);
            }
        }
        for (int i=0; i<mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
            }
            System.out.println();
        }
        System.out.println("Первая диагональ=");
        for (int i=0; i<mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i==j) {
                    System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("Вторая диагональ=");
        for (int i=0; i<mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i+j==n-1) {
                    System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
                }
            }
            System.out.println();
        }
    }
}
