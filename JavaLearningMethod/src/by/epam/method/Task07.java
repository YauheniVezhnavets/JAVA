package by.epam.method;
//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
//решена
public class Task07 {
    public static void main(String[] args) {
        int [] mas={1,2,3,4,5,6,7,8,9};
        int sum=0;

        for (int i=0;i<mas.length;i++){
            if(mas[i]%2!=0){
                sum=sum+calculateFactorial(mas[i]);
            }
        }
        System.out.println("сумма нечетных факториалов= "+sum);
    }
    public static int calculateFactorial(int n){
        int result=1;
        for (int i=1; i<=n;i++){
            result =result*i;
        }
        return result;
    }
}
