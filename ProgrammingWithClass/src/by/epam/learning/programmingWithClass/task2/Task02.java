package by.epam.learning.programmingWithClass.task2;

//2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
// инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
//решена
public class Task02 {
    public static void main(String[] args) {
        Test02 ts = new Test02();
        Test02 ts2 = new Test02(2, 3);
        System.out.println("a=" + ts.getA() + "  " + "b=" + ts.getB());
        System.out.println("a=" + ts2.getA() + "  " + "b=" + ts2.getB());
        System.out.println("=========");

        ts.setA(3);
        ts.setB(4);


        System.out.println("a=" + ts.getA() + "  " + "b=" + ts.getB());
        System.out.println("a=" + ts2.getA() + "  " + "b=" + ts2.getB());

    }
}
