package by.epam.method;

import java.util.Random;

public class Method {

    //////метод вывода массива
    public static void print(int... a) {
        System.out.print("Массив чисел: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    ////метод для заполнения массива
    public static void fillMas (int[] array) {
        Random rand=new Random();
        for (int i=0;i<array.length;i++){
            array[i]=rand.nextInt(20);
        }
    }


    //////метод нахождения наибольшего общего делителя из 2 чисел (алгоритм Евклида)
    public static int get2Nod(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    //////метод нахождения наименьшего общего кратного из 2 чисел
    public static int getNok(int x, int y) {
        int nok = (x * y) / get2Nod(x, y);
        return nok;
    }
///// метод для нахождения наибольшего общего делителя больше 2 чисел
    public static int getNod(int... a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int nod = 1;
        for (int i = 1; i < max; i++) {
            boolean delitel = true;
            for (int j = 0; j < a.length; j++) {
                if (a[j] % i != 0) {
                    delitel = false;
                }
            }
            if (delitel) {
                nod = i;
            }
        }
        return nod;
    }

    //// метод для нахождения площади треугольника
    public static double getHexagonArea (int a){
        double s=(3*Math.sqrt(3)*Math.pow(a,2))/2;
        return s;
    }

    /////метод для нахождения разряда
    public static int getCountNumber (int a){
        int count=0;
        while (a!=0){
            a=a/10;
            count++;
        }
        return count;
    }

    ///метод для нахождения цифры в числе
    public static int getNumber(int b){
        int c =b%10;
        return c;
    }
    public static boolean getSimpleNumber (int x){
        for (int i=2; i<x-1;i++) {
            if (x % i == 0) {
                return false;
                }
        }
        return true;
    }
}