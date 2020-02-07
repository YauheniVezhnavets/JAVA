package by.epam.cycle.task;

import javax.swing.*;
import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.
public class Task01 {
    public static void main(String[] args) {
        int n;
        int sum;
        sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print(">");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print(">");

       }
            n=sc.nextInt();

        for (int i = 1; i < n; i++) {
            sum = sum + i;
            }
        System.out.print(sum);
    }
}
