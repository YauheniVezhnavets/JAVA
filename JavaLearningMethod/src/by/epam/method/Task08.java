package by.epam.method;
//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
// массива с номерами от k до m.
//решена
public class Task08 {
    public static void main(String[] args) {
        int []mas=new int[10];
        Method.fillMas(mas);
        Method.print(mas);
        int k=1;
        int m=6;

        for (int i=k; i<m-1;i++){
            System.out.println("Cумма элементов массива "+sumOfThreeNumber(mas,i));
        }
    }
    public static   int sumOfThreeNumber(int[] array,int index){
        int sum=0;
        if (array.length-3>index){
            sum=array[index]+array[index+1]+array[index+2];
        }
        return sum;
    }
}
