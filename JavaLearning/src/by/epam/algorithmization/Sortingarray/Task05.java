package by.epam.algorithmization.Sortingarray;
//5. Сортировка вставками. Дана последовательность чисел  a1,a2,...an . Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть a1,a2,ai - упорядоченная последовательность, т. е.
//a1<=a2<=ai. Берется следующее число ai+1 a и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
public class Task05 {
    public static void main(String[] args) {
        int [] mas={1,3,5,7,6,4,2};
        int startIndex=0;

        for (int i=0; i<mas.length-1;i++){
            if (mas[i]>mas[i+1]){
                startIndex=i+1;
                break;
            }
        }
        System.out.println(startIndex);
        for (int i=startIndex; i<mas.length; i++){
            int x = mas[i];
            int min = binarySearch(mas, mas[i], 0, i);

            for (int j = i; j > min; j--) {
                mas[j] = mas[j - 1];
            }
            mas[min] = x;
        }
        for (int i=0; i<mas.length;i++){
            System.out.print(mas[i]+" ");
        }
    }


    public static int binarySearch(int a[], int number, int min, int max) {
        while (min < max) {
            int half = min + (max - min) / 2;

            if (number < a[half]) {
                max = half;
            } else {
                min = half + 1;
            }
        }
        return min;

    }
}

