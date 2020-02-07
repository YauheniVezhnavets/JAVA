package by.epam.algorithmization.arraysOfArrays;

import java.util.Random;
import java.util.Scanner;

//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.
//решена
public class Task08 {
    public static void main(String[] args) {
        int n;
        int m,k;
        n = 5;
        int temp;
        int[][] mas = new int[n][n];
        Scanner sc =new Scanner(System.in) ;
        System.out.print(">");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(">");
        }
        m=sc.nextInt();
        k=sc.nextInt();

        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(100);
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
              temp=mas[i][m];
              mas[i][m]=mas[i][k];
              mas[i][k]=temp;

            }
        }
        System.out.println("Измененный массив");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
            }
            System.out.println();
        }
    }
}
