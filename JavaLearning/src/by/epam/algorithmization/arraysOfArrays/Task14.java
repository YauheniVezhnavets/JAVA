package by.epam.algorithmization.arraysOfArrays;

import java.util.Random;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
// не решена
public class Task14 {
    public static void main(String[] args) {
        int m,n;
        m=6;
        n = 6;
        int zero;
        int[][] mas = new int[m][n];



        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = 0;
                zero = j;
                for (int k = 0; k < mas.length; k++) {

                    if (zero == 0) {
                        mas[i][j] = 0;
                    } else {
                        mas[k][j] = 1;
                        zero--;
                    }
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

