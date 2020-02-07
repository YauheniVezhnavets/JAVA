package by.epam.method;
//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
//решена
public class Task11 {
    public static void main(String[] args) {
        int a=36945;
        int b=1238;

        int c=getCountNumber(a);
        int d=getCountNumber(b);

        compareNumber(c,d);
    }
    public static int getCountNumber (int c){
        int count=0;
        while (c!=0){
            c=c/10;
            count++;
        }
        return count;
    }
    public static void compareNumber(int x,int y){
        if(x>y) {
            System.out.println("в первом числе цифр больше,чем во втором");
        }
        else if (x==y){
            System.out.println("в первом и втором числе цифр одинаково");
        }
        else
            System.out.println("во втором числе цифр больше,чем в первом");
    }
}
