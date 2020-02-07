package by.epam.cycle.task;
//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.//
// решена
public class Task08 {
    public static void main(String[] args) {
        int a = 173523;
        int b = 359687;
        int x = 0;
        int y = 0;

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (a > 0) {
            x = a % 10;
            y = b;
            while (y > 0) {
                if (y % 10 == x) {
                    System.out.println("Цифра " + x + " входит в оба числа");
                    break;
                }
                y = y / 10;
            }
            a = a / 10;
        }
    }
}




