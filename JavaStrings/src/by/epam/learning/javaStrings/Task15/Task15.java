package by.epam.learning.javaStrings.Task15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
// знаком. Определить количество предложений в строке X.
public class Task15 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            System.out.println("Количество предложений =" + countNumberOfSentance(string));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int countNumberOfSentance (String str){
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if ((stringBuilder.charAt(i)=='.') || (stringBuilder.charAt(i)=='!')|| (stringBuilder.charAt(i)=='?')) {
                count++;
            }
        }
        return count;
    }
}
