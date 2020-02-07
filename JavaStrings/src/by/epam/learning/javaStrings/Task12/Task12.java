package by.epam.learning.javaStrings.Task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
// "abc cde def", то должно быть выведено "abcdef".
public class Task12 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = bufferedReader.readLine();
            System.out.println(formatSting(string));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String formatSting(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char symbol = stringBuilder.charAt(i);
            if (symbol == ' ') {
                stringBuilder.deleteCharAt(i);
                i--;
            }
          }
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(j) == stringBuilder.charAt(i)) {
                    stringBuilder.deleteCharAt(j);
                    j--;
                }
            }
        }
            return stringBuilder.toString();
    }
}
