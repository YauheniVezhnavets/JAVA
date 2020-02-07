package by.epam.method;
//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
//решена
public class Task02 {
    public static void main(String[] args) {
        int a=33;
        int b=15;
        int c=9;
        int d=30;

        int nod=Method.getNod(a,b,c,d);
        Method.print(a,b,c,d);
        System.out.println("наибольший общий делитель равен= " + nod );
    }
}
