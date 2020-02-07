package by.epam.learning.programmingWithClass.task1;

public class Task01 {

    public static void main(String[] args) {
        Test1 test1 = new Test1(1, 2);

        test1.print();

        System.out.println("Сумма двух элементов" + test1.sum());
        System.out.println("Наибольший элемент" + test1.maxElement());

        test1.setB(10);

        test1.print();

    }
}
