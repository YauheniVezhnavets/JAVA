package by.epam.algorithmization.Sortingarray;
/*
7. Пусть даны две неубывающие последовательности действительных чисел  a1<a2<an a и b1<b2<bm
Требуется указать те места, на которые нужно вставлять элементы последовательности b1<b2<bm в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
решена
 */
public class Task07 {
    public static void main(String[] args) {
        int a[] = { 0, 2, 5, 10 ,11,14, 19,21};
        int b[] = { 1, 3, 4, 6, 12 ,18,20,22,23,24};

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i]<a[j]) {
                    System.out.printf("Элемент последовательности №%d = %d вставим на место %d \n", i, b[i], j);
                    break;
                }
                    if (b[i]>=a[a.length-1]) {
                        System.out.printf("Элемент последовательности №%d = %d вставим на место %d \n", i, b[i], a.length - 1);
                        break;
                    }
            }
        }
    }
}


