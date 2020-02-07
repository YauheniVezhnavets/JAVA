package by.epam.method;
//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также,
// сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
//решена
public class Task16 {
    public static void main(String[] args) {
        int n = 3;
        int nMin = (int) Math.pow(10, n - 1);
        int nMax = (int) Math.pow(10, n) - 1;
        int sum = 0;
        for (int i = nMin; i <= nMax; i++) {
            if (getSumOfOddElement(i)) {
                sum = sum + i;
            }
        }

        System.out.println(sum);

        System.out.println(getEvenNumber(sum));
    }

    public static boolean getSumOfOddElement(int num) {
        while (num > 0) {
            if (num % 2 == 0) {
                return false;
            }
            num = num / 10;
        }

        return true;
    }


    public static int getEvenNumber(int x) {
        int count = 0;
        while (x > 0) {
            if (x % 2 == 0) {
                count++;
            }
            x = x / 10;
        }
        return count;
    }
}