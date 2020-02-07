package by.epam.cycle.task;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
//  решена
public class Task07 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print(">");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(">");
        }
        m=sc.nextInt();
        n=sc.nextInt();

        if (m>n) {
            int temp=m;
            m=n;
            n=temp;
        }

        for (int i=m;i<=n;i++){
            for (int j=2;j<i;j++){
                if (i%j==0){
                    System.out.println(j+ " является делителем числа "+i);
                }
            }
        }
    }
}
