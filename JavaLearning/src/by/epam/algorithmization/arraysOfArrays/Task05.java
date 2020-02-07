package by.epam.algorithmization.arraysOfArrays;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//                                                                          (1...1..1...1...1)
//                                                                          (2...2..2...2...0)
//                                                                          (3...3..3...0...0)
//                                                                          (n...0..0...0...0)
// решена

public class Task05 {
    public static void main(String[] args) {
        int n=6;
        int [][]mas=new int [n][n];

        for (int i=0; i<mas.length;i++){
            for (int j=0; j<mas.length-i;j++){
                mas[i][j]=i+1;
            }
        }
        for (int i=0; i<mas.length;i++){
            for (int j=0; j<mas[i].length;j++) {
                System.out.printf("mas[%d][%d]=%-6d",i,j,mas[i][j]);
            }
            System.out.println();
        }
    }
}
