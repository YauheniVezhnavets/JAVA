package by.epam.method;
//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий
// надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
//решена
public class Task17 {
    public static void main(String[] args) {
        int n=33;
        int count=0;
        while (n>0){
            n=n-getSumOfElement(n);
            count++;
        }
        System.out.println(count);
    }
    public static int getSumOfElement (int x){
        int sum = 0;
        while (x>0){
            int k=x%10;
            sum=sum+k;
            x=x/10;
        }
        return sum;
    }
}

