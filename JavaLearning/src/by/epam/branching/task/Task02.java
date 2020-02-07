package by.epam.branching.task;
//Найти max{min(a, b), min(c, d)}.
public class Task02 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        int z;

        a=5;
        b=7;
        c=4;
        d=8;

       z= Math.max (Math.min(a,b),Math.min(c,d));
        System.out.println(z);
    }
}
