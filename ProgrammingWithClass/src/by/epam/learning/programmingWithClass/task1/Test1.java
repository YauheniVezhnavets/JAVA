package by.epam.learning.programmingWithClass.task1;

public class Test1 {
    private int a;
    private int b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void print() {
        System.out.println(a + " , " + b);
    }

    public int sum() {
        return a + b;
    }

    public int maxElement() {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
}