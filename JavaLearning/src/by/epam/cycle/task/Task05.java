package by.epam.cycle.task;
/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
        заданному е. Общий член ряда имеет вид:
        a^n=1/(2^n)+1/(3^n)
 */
//решена

public class Task05 {
    public static void main(String[] args) {
        double e;
        double sum;

        double y;
        int i;

        e=0.2;
        y=0;
        sum=0;
        i=0;

        do {
            sum = sum + y;

            i++;
            y = Math.abs(1 / Math.pow(2, i) + 1 / Math.pow(3, i));
        } while (y>=e);

        System.out.println(sum);


    }
}
