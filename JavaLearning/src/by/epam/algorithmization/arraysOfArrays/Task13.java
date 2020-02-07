package by.epam.algorithmization.arraysOfArrays;

import java.util.Random;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class Task13 {
    public static void main(String[] args) {
            int n;
            n = 4;
            int temp=0;
            int elem;
            int[][] mas = new int[n][n];
            Random rand = new Random();
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = rand.nextInt(100);
                }
            }
//вывод первоночального массива
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
                }
                System.out.println();
            }

//сортировка массива по возрастанию
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    for (elem = 0; elem < mas[i].length - 1; elem++) {
                        if (mas[elem][j] > mas[elem+1][j]) {
                            temp = mas[elem][j];
                            mas[elem][j] = mas[elem+1][j];
                            mas[elem+1][j] = temp;
                        }

                    }
                }
            }
//вывод отсортированного массива
            System.out.println("Отсортированный массив по возрастанию");
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
                }
                System.out.println();
            }
// сортировка массива по убыванию
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    for (elem = 0; elem < mas[i].length - 1; elem++) {
                        if (mas[elem][j] < mas[elem+1][j]) {
                            temp = mas[elem][j];
                            mas[elem][j] = mas[elem+1][j];
                            mas[elem+1][j] = temp;
                        }
                    }
                }
            }
            // вывод отсортированного массива
            System.out.println("Отсортированный массив по убыванию");
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
                }
                System.out.println();
            }
        }
    }

