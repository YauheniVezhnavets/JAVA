package by.epam.method;
//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная
// в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
//решена
public class Task14 {
    public static void main(String[] args) {

        int k=10000;


        for (int i=1;i<=k;i++){
            if(Math.pow(getSum(i),Method.getCountNumber(i))==i){
                System.out.println(i);

            }
        }
    }

    public static int getSum (int x){
        int sum=0;
        while (x>0){
            int k=x%10;
            sum=sum+k;
            x=x/10;
        }
        return sum;
    }
}
