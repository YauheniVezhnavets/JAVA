package by.epam.method;

import java.util.Random;

//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
// сумма цифр которых равна К и которые не большее N.
//решена
public class Task12 {
    public static void main(String[] args) {
        int k = 10;
        int n = 100;
        int a[];

        int countNum = 0;
        for (int i = 0; i <= n; i++) {
            if (sumOfElement(i, k)) {
                countNum++;
            }
        }
        a = new int[countNum];
        int lastIndexA = 0;

        for (int i = 0; i < n; i++) {
            if (sumOfElement(i, k)) {
                a[lastIndexA] = i;
                lastIndexA++;
            }
        }
        Method.print(a);
    }


    public static boolean sumOfElement(int z, int k) {
        int sum = 0;
        while (z>0){
            sum=sum+(z%10);
            z=z/10;
        }
        if (sum==k){
            return true;
        }
       return false;
    }
}