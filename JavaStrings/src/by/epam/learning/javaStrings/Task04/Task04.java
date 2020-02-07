package by.epam.learning.javaStrings.Task04;

import java.util.Arrays;

//В строке найти количество чисел.
public class Task04 {
    public static void main(String[] args) {
        String str1="125 sad 123  1543, 34rddf fd23,58";
        String [] strArr=str1.split("\\D+");
        System.out.println(Arrays.toString(strArr));
        System.out.println("Количество чисел="+strArr.length);
    }
}
