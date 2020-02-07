package by.epam.learning.javaStrings.Task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Из заданной строки получить новую, повторив каждый символ дважды.
public class Task11 {
    public static void main(String[] args) {
        try (BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
            String string=reader.readLine();
            System.out.println("Новая строка:"+changeString(string));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String changeString (String str){
        StringBuilder stringBuilder=new StringBuilder();
        if (str!=null) {
            char currentSymbol;
            for (int i = 0; i < str.length(); i++) {
                currentSymbol = str.charAt(i);
                stringBuilder.append(currentSymbol).append(currentSymbol);
            }
        }
        return stringBuilder.toString();
    }

}
