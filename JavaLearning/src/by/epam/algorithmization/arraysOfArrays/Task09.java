package by.epam.algorithmization.arraysOfArrays;

import java.util.Random;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.
//решена
public class Task09 {
    public static void main(String[] args) {
        int n;
        n = 6;
        int[][] mas = new int[n][n];
        int sum;
        int maxSum=0;
        int maxSumColumn=0;

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
        System.out.println("Сумма элементов каждого столбца:");
        for (int i = 0; i < mas.length; i++) {
            sum=0;

        for (int j = 0; j < mas[i].length; j++) {
            sum = sum + mas[j][i];
          }
            System.out.print(sum + " , ");
        if (sum>maxSum){
            maxSum =sum;
            maxSumColumn=i;
        }
      }
        System.out.println();
        System.out.println("Максимальная сумма в "+maxSumColumn+" столбце");
    }
}
