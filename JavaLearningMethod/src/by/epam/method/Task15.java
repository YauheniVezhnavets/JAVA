package by.epam.method;
//15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.
//решена
public class Task15 {
    public static void main(String[] args) {
        int n = 4;

        int nMin = (int) Math.pow(10, n - 1);
        int nMax = (int) Math.pow(10, n) - 1;


        for (int i = nMin; i <= nMax; i++) {
            if (getIncreaseNumber(i, n)) {
                System.out.println(i);
            }
        }
    }

    public static boolean getIncreaseNumber(int x, int n) {
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[mas.length - 1- i] = x % 10;
            x = x / 10;

        }
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] >= mas[i + 1]) {
                return false;

            }

        }
        return true;
    }
}




