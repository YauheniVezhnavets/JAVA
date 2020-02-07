package by.epam.learning.javaStrings.Task07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//В строке вставить после каждого символа 'a' символ 'b'.
public class Task07 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            System.out.println("1 способ:  " + string.replaceAll("a", "ab"));
            System.out.println("2 способ:  " + addSymbol(string,'a','b'));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String addSymbol(String text, char symbolBefore, char symbolAfter) {
        StringBuilder stringBuilder = new StringBuilder();
        if (text != null) {
            char currentSymbol;

            for (int i = 0; i < text.length(); i++) {
                currentSymbol = text.charAt(i);
                stringBuilder.append(currentSymbol);
                if (currentSymbol == symbolBefore) {
                    stringBuilder.append(symbolAfter);
                }
            }
        }
        return stringBuilder.toString();
    }
}
