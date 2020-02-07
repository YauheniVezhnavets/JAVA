package by.epam.algorithmization.arraysOfArrays;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
/*                                                              (1..1..1..1..1..1)
                                                                (0..1..1..1..1..0)
                                                                (0..0..1..1..0..0)
                                                                (0..0..1..1..0..0)
                                                                (0..1..1..1..1..0)
                                                                (1..1..1..1..1..1)
решена
 */

public class Task06 {
    public static void main(String[] args) {
        int n=6;
        int [][]mas=new int [n][n];


        for (int i=0; i<mas.length;i++){
            for (int j=0; j<mas.length;j++){
                if (((i<=j)&&(j<mas.length-i))||((j<=i)&&(j>=mas.length-i-1))){
                    mas[i][j]=1;
                }
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
