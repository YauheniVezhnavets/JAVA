package by.epam.learning.javaStrings.Task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Task10 {
    public static void main(String[] args) {
        try (BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
            String string=reader.readLine();
            System.out.println("Буква а повторяется:"+countSymbol(string,'a')+" раз");

        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static int countSymbol (String str, char symbol){
        int count=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==symbol){
                count++;
            }
        }
        return count;
    }
}
