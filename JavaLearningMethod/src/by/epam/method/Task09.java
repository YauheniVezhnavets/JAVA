package by.epam.method;
//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
// если угол между сторонами длиной X и Y— прямой.
//решена
public class Task09 {
    public static void main(String[] args) {
        double x=4;
        double y=5;
        double z=1;
        double t=1;

        double perimetr=getPerimetr(x,y,z,t);

        double s=getArea(x,y,z,t,perimetr);

        System.out.println("Площадь четырехугольника="+s);
    }
    public static double getPerimetr(double a, double b, double c, double d){
        double p=(a+b+c+d)/2;
        return p;
    }
    public static double getArea ( double a, double b, double c, double d, double p) {
        double s = Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
        return s;
    }
}
