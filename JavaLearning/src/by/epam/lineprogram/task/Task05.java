package by.epam.lineprogram.task;
/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */
public class Task05 {
    public static void main(String[] args) {
        int T;
        int m;
        int hour;
        int minute;
        int second;

        T=4253;
        second=T%60;
        m=T/60;
        minute=m%60;
        hour=m/60;

        System.out.println("часов="+" "+ hour+" " +"минут=" + " "+ minute+ " " +"секунд="+ " "+second);
    }
}
