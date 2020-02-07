package by.epam.learning.programmingWithClass.task5;
//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
// в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса.
//решена
public class Main {
    public static void main(String[] args) {
        Counter count = new Counter(3,0,10);
        System.out.println("Значение счетчика="+count.getValue());

        count.increaseValue();
        System.out.println("Значение счетчика="+count.getValue());

        count.setValue(8);
        count.decreaseValue();
        System.out.println("Значение счетчика="+count.getValue());
    }
}
