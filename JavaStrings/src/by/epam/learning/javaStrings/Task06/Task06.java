package by.epam.learning.javaStrings.Task06;


//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Task06 {
    public static void main(String[] args) {
        String str = "This is     sparta";
        System.out.println("Наибольшее количество подряд идущих пробелов="+getMaxSpace(str));
    }

    public static int getMaxSpace(String str) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount;
    }
}
