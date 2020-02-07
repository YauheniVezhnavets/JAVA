package by.epam.learning.javaStrings.Task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только
// английские буквы.
public class Task14 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            System.out.println("Количество маленьких букв=" + countSmallSymbol(string));
            System.out.println("Количество больших букв="+countBigSymbol(string));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countSmallSymbol(String str) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if ((stringBuilder.charAt(i)>='a')&&((stringBuilder.charAt(i)<='z'))) {
                count++;
            }
        }
        return count;
    }
    public static int countBigSymbol(String str) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if ((stringBuilder.charAt(i)>='A')&&((stringBuilder.charAt(i)<='Z'))) {
                count++;
            }
        }
        return count;
    }
}
