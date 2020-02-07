package by.epam.algorithmization.onedimensionalarray;

import java.util.Random;
//решена
//Даны действительные числа a1 ,a2 ,....a2n  Найти max (a1+a2n,a2+a2n-1,...,an+an+1)
public class Task07 {
    public static void main(String[] args) {
        int n=10;
        int [] mas= new int [n];
        int max;
        int k=1;
        Random rand=new Random();
        for (int i=0; i<mas.length;i++) {
            mas[i] = rand.nextInt(100);
            System.out.print(mas[i] + "  ");
        }
        System.out.println();
        max=mas[0]+mas[mas.length-k];
        for (int i=0; i<=mas.length/2;i++,k++){
            if (max<(mas[i]+mas[mas.length-k]))
                max= mas[i]+mas[mas.length-k];

//                    99     58     106
        }
        System.out.print(max);
    }
}

