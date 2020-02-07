package by.epam.algorithmization.arraysOfArrays;
//Сформировать квадратную матрицу порядка N по правилу A[i,j]=(sin(I2-J2))/N
// и подсчитать количество положительных элементов в ней.
//решена
public class Task07 {
    public static void main(String[] args) {
        int n;
        n = 8;
        int count=0;
        double [][] mas = new double[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) /n);
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.printf("mas[%d][%d]=%-10.3f", i, j, mas[i][j]);
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов:");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
        if (mas[i][j]>0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
