package by.epam.algorithmization.onedimensionalarray;
//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
//решена
public class Task01 {
    public static void main(String[] args) {
        int k=3;
        int sum;
        int [] mas= new int [10];


        k=3;
        sum=0;
        mas [0]=1;
        mas [1]=2;
        mas [2]=3;
        mas [3]=4;
        mas [4]=5;
        mas [5]=6;
        mas [6]=7;
        mas [7]=8;
        mas [8]=9;
        mas [9]=10;

        for (int i=1; i<mas.length; i++) {
            if (mas[i]%k==0)
                sum=sum+mas[i];
            }
        System.out.println("Сумма="+ sum);

    }
}
