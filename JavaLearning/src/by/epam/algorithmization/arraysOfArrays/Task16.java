package by.epam.algorithmization.arraysOfArrays;

import java.util.Random;

//16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
//        6 1 8
//        7 5 3
//        2 9 4
// решена
public class Task16 {
    public static void main(String[] args) {
        int n=4;
        int matrix[][]=new int[n][n];
        int magicSum= n*(n*n+1)/2;
        System.out.println("Магическая сумма="+magicSum);
        fillSquare(matrix);
        checkMagickSquare(matrix,magicSum,n);
        System.out.println("====================");
        printMatrix(matrix);

    }

    ////метод заполнения массива
    public static void fillSquare(int mas[][]){
        int number=1;
        for (int i=0;i<mas.length;i++){
            for (int j=0;j<mas.length;j++){
                mas[i][j]=number;
                number++;
            }
        }
    }

    ///метод замены элементов
    public static void swap (int mas[][],int i1, int i2, int j1, int j2){
        int temp =mas [i1][j1];
        mas[i1][j1]=mas[i2][j2];
        mas[i2][j2]=temp;

    }
       /////метод проверки
    public static boolean isMagisSquare(int mas [][],int magicSum){
        for (int i=0;i<mas.length;i++){
            for (int j=0;j<mas.length;) {
                if ((sumOfRow(mas, i) == magicSum) && (sumOfColumn(mas, j) == magicSum) && (sumOfDiagonal(mas) == magicSum) && (sumOfBackDiagonal(mas) == magicSum))
                    j++;
                else {
                        return false;
                    }
                }
            }
        return true;
    }
    public static void checkMagickSquare(int mas [][],int magicSum, int n){
        Random rand =new Random();
        while (!isMagisSquare(mas,magicSum)) {
            int i1 = rand.nextInt(n);
            int j1 = rand.nextInt(n);
            int i2 = rand.nextInt(n);
            int j2 = rand.nextInt(n);
            swap(mas,i1,i2,j1,j2);
        }
    }
    ///метод нахождения суммы строки
    public static int sumOfRow (int mas[][], int row){
         int rowSum=0;
            for (int j=0;j<mas.length;j++) {
            rowSum=rowSum+ mas[row][j];

        }
            return rowSum;
    }

    ////метод нахождения суммы столбца
    public static int sumOfColumn (int mas[][],int column){
        int columnSum=0;
            for (int i=0;i<mas.length;i++) {
                columnSum=columnSum+ mas[i][column];
            }
            return columnSum;
    }

    ///метод нахождения суммы диагонали
    public static int sumOfDiagonal(int mas[][]) {
        int diagonalSum = 0;
        for (int i = 0, j=0; i < mas.length; i++,j++) {
            diagonalSum=diagonalSum+mas[i][j];
            }
        return diagonalSum;
        }

    ///метод нахождения суммы диагонали
    public static int sumOfBackDiagonal(int mas[][]) {
        int backDiagonalSum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (i + j == mas.length - 1) {
                    backDiagonalSum = backDiagonalSum + mas[i][j];
                }
            }
        }
       return backDiagonalSum;
    }



    public static void  printMatrix (int mas[][]){
        for (int i=0;i<mas.length;i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
            }
            System.out.println();
        }
    }
}
