package by.epam.learning.programmingWithClass.task4;
//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
// номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
// должны быть упорядочены по времени отправления.

import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args) {
        TrainLogic trainLogic=new TrainLogic();
        ArrayList<Train> list = new ArrayList<Train>();
        list.add(new Train(3,"Гродно",new GregorianCalendar(2019, 9, 1, 6, 00, 0)));
        list.add(new Train(2,"Брест",new GregorianCalendar(2019, 9, 2, 22, 30, 0)));
              list.add(new Train(1,"Гомель",new GregorianCalendar(2019, 9, 3, 15, 15, 0)));
                   list.add(new Train(5,"Могилев",new GregorianCalendar(2019, 9, 4, 3, 20, 0)));
                        list.add(new Train(4,"Гродно",new GregorianCalendar(2019, 9, 5, 7, 10, 0)));


    }

    public static void printTrain(Train train) {
        System.out.println(train.getDestination() + " " + train.getNumberOfTrain() + " " + train.getTimeOfDeparture().getTime());
    }
}

