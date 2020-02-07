package by.epam.lineprogram.task;

import javax.swing.*;

/*
Для данной области составить линейную программу,
которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 */
public class Task06 {
    public static void main(String[] args) {
        double x;
        double y;

        x=1;
        y=1;

        if ((x>=-2 && x<=2)&& ((y>=-1.5)&&(y<=0)) || ((x>=-1 && x<=1)&& ((y>=0)&&(y<=2))))
        System.out.println(true);
        else
        System.out.println(false);
    }
}
