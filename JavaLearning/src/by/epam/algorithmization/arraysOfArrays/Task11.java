package by.epam.algorithmization.arraysOfArrays;

import java.util.Random;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
// которых число 5 встречается три и более раз.
//решена
public class Task11 {
    public static void main(String[] args) {
        int[][] mas = new int[10][20];
        int count;

        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(15);
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
            }
            System.out.println();
        }
        System.out.println("Номера строк");
        for (int i = 0; i < mas.length; i++) {
            count=0;
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == 5) {
                    count++;
                }
            }
               if (count >= 3) {
                System.out.print(i + " ,");
            }
        }
    }
}