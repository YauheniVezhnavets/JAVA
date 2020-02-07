package by.epam.learning.javaStrings.Task02;

//Замените в строке все вхождения 'word' на 'letter'.
public class Task02 {
    public static void main(String[] args) {
        String string = "word word hello world force it word. ";
        System.out.println(string);
        System.out.println(string.replace("word", "letter"));
    }
}

