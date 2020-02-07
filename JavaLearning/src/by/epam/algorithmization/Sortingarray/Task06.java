package by.epam.algorithmization.Sortingarray;
//6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai<=ai+1 , то продвигаются
//на один элемент вперед. Если ai>ai+1 , то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.
//решена
public class Task06 {
    public static void main(String[] args) {

        int count = 0;
        double[] a = {3,7,5,9,6,0,2,6,4,11,8,15};

        System.out.println("Исходный массив:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < a.length - 1;) {
            if(a[i] > a[i+1]) {
                double temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;

                if(i > 0){
                    i --;
                }
            } else {
                i++;
            }
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
