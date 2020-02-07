package by.epam.method;
// 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:
//решена
public class Task01 {
    public static void main(String[] args) {
        int a=12;
        int b=8;
        int c=Method.get2Nod(a,b);
        int d=Method.getNok(a,b);
        System.out.println("Наибольший общий делитель= "+c);
        System.out.println("Наименьшее общее кратное= "+d);
    }
}
