package by.epam.algorithmization.arraysOfArrays;

import java.util.Random;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
//решена
public class Task15 {
    public static void main(String[] args) {
        int n;
        int max;
        n = 5;
        int[][] mas = new int[n][n];

        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Первоночальный массив");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
            }
            System.out.println();
        }
        max=mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
        if (max<mas[i][j]){
            max=mas[i][j];
        }
             }
        }
        System.out.println("Максимальное значеение="+max);
        System.out.println("Измененный массив:");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
        if (mas[i][j]%2!=0){
            mas[i][j]=max;
        }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
            }
            System.out.println();
        }

    }
}
