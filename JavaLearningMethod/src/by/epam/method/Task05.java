package by.epam.method;
//5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов).
//решена
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        int n=10;
        int [] mas=new int [n];
        Method.fillMas(mas);
        Method.print(mas);
        System.out.println("Второе число "+maxValue(mas));
    }


    public static int maxValue(int[]array){
        int max=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        int secondNumberAfterMax=0;
        for (int i=0; i<array.length;i++){
            if (array[i]<max){
                if(array[i]>secondNumberAfterMax){
                    secondNumberAfterMax=array[i];
                }
            }
        }
        return secondNumberAfterMax;
    }
}
