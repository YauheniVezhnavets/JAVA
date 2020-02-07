package by.epam.algorithmization.Sortingarray;
//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.
// решена
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        int n=10;
        int m=5;
        int k=4;
        int[] firstArray = new int[n];
        int[] secondArray = new int[m];


        Random rand = new Random();
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = rand.nextInt(50);
            System.out.print(firstArray[i] + ", ");
        }
        System.out.println();
        for (int j = 0; j < secondArray.length; j++) {
            secondArray[j] = rand.nextInt(50);
            System.out.print(secondArray[j] + ", ");
        }
        System.out.println();
        int [] thirdArray=new int[firstArray.length+secondArray.length];
        for (int i=0;i<thirdArray.length;i++){
            if (i<k){
                thirdArray[i]=firstArray[i];
            }
            else if ((i>=k) && (i<k+secondArray.length)) {
                thirdArray[i] = secondArray[i - k];
            }
            else {
                thirdArray[i]=firstArray[i-secondArray.length];
            }
        }
        System.out.println();
        for (int j = 0; j < thirdArray.length; j++) {
            System.out.print(thirdArray[j] + ", ");
        }

    }
}