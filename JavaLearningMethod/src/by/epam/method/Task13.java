package by.epam.method;
// 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти
// и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения
// задачи использовать декомпозицию.
//решена
public class Task13 {
    public static void main(String[] args) {
       int n=25;
       int countNumber=0;
        for (int i=n; i<=2*n-2; i++) {
            if (Method.getSimpleNumber(i)) {
                countNumber++;
            }
        }
        int mas []=new int [countNumber];
        int j=0;
        for (int i=n; i<=2*n-2; i++){
            if (Method.getSimpleNumber(i)){
               mas[j]=i;
                j++;
            }
        }
        Method.print(mas);
            for (int i=0; i<mas.length-1;i++){
            if (mas[i+1]-mas[i]==2){
                System.out.println("Первое простое число= "+mas[i]+" "+ "Второе простое число= "+ mas[i+1]);
            }
        }
        }
    }

