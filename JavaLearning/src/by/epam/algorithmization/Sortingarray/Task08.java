package by.epam.algorithmization.Sortingarray;

//8.Даны дроби  ( i i p , q - натуральные). Составить программу, которая приводит эти дроби к общему
  //      знаменателю и упорядочивает их в порядке возрастания.
// решена
public class Task08 {
    public static void main(String[] args) {
        int[] p = { 1, 3, 5 };
        int[] q = { 2, 5, 8};
        System.out.println("Исходные дроби");
        for (int i = 0; i < p.length; i++) {
            System.out.printf("%d/%d=%.3f\t", p[i], q[i], (double) p[i] / q[i]);
        }
        System.out.println();
        // Найдем НОК знаменателей
        int nok = getNok(q);

        for (int i = 0; i < q.length; i++) {
            // Определим числитель и знаменатель
            p[i] = p[i] * (nok / q[i]);
            q[i] = nok;
        }
        System.out.println("Приведенные дроби");
        for (int i = 0; i < p.length; i++) {
            System.out.printf("%d/%d=%.3f\t", p[i], q[i], (double) p[i] / q[i]);
        }
        System.out.println();


            for (int j = 0; j <= p.length-2; j++) {
                if (p[j] > p[j + 1]) {
                    int temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }


        System.out.println("Отсортированные дроби");
        for (int i = 0; i < p.length; i++) {
            System.out.printf("%d/%d=%.3f\t", p[i], q[i], (double) p[i] / q[i]);
        }
    }

    public static int getNod(int[] a) {
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

    public static int getNok(int[] a) {
        int[] array = {a[0], a[1]};
        int nok = a[0] * a[1] / getNod(array);
        for (int i = 2; i < a.length; i++) {
            array = new int[]{nok, a[i]};
            nok = nok * a[i] / getNod(array);
        }
        return nok;
    }
}