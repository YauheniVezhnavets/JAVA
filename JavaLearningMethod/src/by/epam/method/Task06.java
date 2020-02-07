package by.epam.method;
//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
//решена
public class Task06 {
    public static void main(String[] args) {
        int a = 13;
        int b = 17;
        int c = 20;
        Method.print(a, b, c);
        int d= Method.getNod(a, b, c);

        if (d == 1) {
            System.out.println("Числа взаимно простые");
        }
        else {
            System.out.printf("Числа имеют общий делитель %d, который больше 1", Method.getNod(a,b,c));
        }
    }
}
