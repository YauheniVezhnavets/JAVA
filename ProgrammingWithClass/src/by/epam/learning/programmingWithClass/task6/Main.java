package by.epam.learning.programmingWithClass.task6;
//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.
//решена
public class Main {
    public static void main(String[] args) {
       Time time =new Time (8,34,22);
       TimeLogic timeLogic =new TimeLogic();
        System.out.println("Часов:="+time.getHour()+" Минут:="+time.getMinute()+" Секунд:="+time.getSecond());
        timeLogic.add(time,14,35,56);
        System.out.println("Часов:="+time.getHour()+" Минут:="+time.getMinute()+" Секунд:="+time.getSecond());
    }
}
