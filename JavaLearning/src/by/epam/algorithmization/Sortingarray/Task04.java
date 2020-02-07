package by.epam.algorithmization.Sortingarray;

import java.util.Random;
//решена
//4. Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=an .Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai>ai+1 , то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
public class Task04 {
    public static void main(String[] args) {
        int [] mas =new int [10];
        Random rand =new Random();
        int count=0;

        for (int i=0; i<mas.length;i++){
            mas[i]=rand.nextInt(100);
        }
        for (int i=0; i<mas.length;i++){
            System.out.print(mas[i]+ " ");
        }
        System.out.println();
        for (int i=0; i<mas.length;i++) {
            for (int j=0;j<mas.length-1;j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                    count++;
                }
             }
        }
            System.out.println("Отсортированный массив");

            for (int i=0; i<mas.length;i++) {
                System.out.print(mas[i] + " ");
            }
        System.out.println();
        System.out.println("Количество перестановок="+count);
    }
}
