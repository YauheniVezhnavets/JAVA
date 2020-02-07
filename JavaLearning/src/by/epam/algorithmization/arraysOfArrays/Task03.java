package by.epam.algorithmization.arraysOfArrays;

import java.util.Random;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
//решена

public class Task03 {
    public static void main(String[] args) {
        int n;
        n = 5;
        int[][] mas = new int[n][n];
        int k = 1;
        int p = 3;
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(100);
            }
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
            }
            System.out.println();
        }
        System.out.println("Числа k-ой строки");
        for (int i = 0; i < mas[k].length; i++) {
            System.out.print(mas[k][i]+" ");
        }
        System.out.println();

        System.out.println("Числа p-го столбца");
        for (int i = 0; i < mas.length; i++) {
             System.out.print(mas[i][p]+" ");
            }
    }
}

