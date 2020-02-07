package by.epam.algorithmization.arraysOfArrays;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): (1...2...3...n  )
//  решена                                                                     (n,n-1,n-2,...1)
public class Task04 {
    public static void main(String[] args) {
        int n;
        n = 6;
        int[][] mas = new int[n][n];
        for (int i = 0; i < mas.length; i += 2) {
            mas[i][0]=1;
            for (int j = 1; j < mas[i].length; j++) {
                mas[i][j] = mas[i][j - 1] + 1;
            }
        }
        for (int i = 1; i < mas.length-1; i += 2) {
            mas[i][0]=n;
            for (int j = 1; j < mas[i].length; j++) {
                mas[i][j] = mas[i][j-1] -1;
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