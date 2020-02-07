package by.epam.cycle.task;
//Найти сумму квадратов первых ста чисел.
public class Task03 {
    public static void main(String[] args) {
        int n;
        long sum;

        n=1;
        sum=0;

        for (n = 1; n <= 100; n++) {
            
            sum = sum+n*n ;
        }
        System.out.println(sum);
    }
}
