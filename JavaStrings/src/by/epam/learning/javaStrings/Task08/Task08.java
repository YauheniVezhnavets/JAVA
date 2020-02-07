package by.epam.learning.javaStrings.Task08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Проверить, является ли заданное слово палиндромом.
public class Task08 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader.readLine();
            System.out.println("Строка является полиндромом?");
            System.out.println(chekPolindrom(str));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean chekPolindrom(String string) {
        int n = string.length();
        for (int i=0; i<n/2;i++){
            if (string.charAt(i)!=string.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}

