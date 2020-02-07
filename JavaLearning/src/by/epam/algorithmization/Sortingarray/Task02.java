package by.epam.algorithmization.Sortingarray;
//Даны две последовательности a1<=a2<=an и b1<=b2<=...<=bn . Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
//решена
public class Task02 {
    public static void main(String[] args) {
        int a[] = { 0, 1, 2, 5, 10 ,11,14, 19,21};
        int b[] = { 1, 3, 4, 5, 12 };


        int c[] = new int[a.length + b.length];
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < c.length; i++) {

           if (indexA == a.length) {
               c[i] = b[indexB];
             indexB++;

            } else if (indexB == b.length) {
                c[i] = a[indexA];
                indexA++;

           }
        else {
                if (a[indexA] < b[indexB]) {
                    c[i] = a[indexA];
                    indexA++;
                } else {
                    c[i] = b[indexB];
                    indexB++;
                }
            }
            System.out.print(c[i]+" ");
        }

    }
}

