package by.epam.learning.javaStrings.Task05;


//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние
// пробелы в строке удалить.
public class Task05 {
    public static void main(String[] args) {
        String strings = "             asdas  asda saldkqw             123123,    ,qweq ";
        String strings2 = "ad12    123 123, dsa,  2113  ";
        String str = strings.trim();
        System.out.println(str.replaceAll(" +", " "));
        System.out.println(replaceSpaces(strings2));
    }

    private static String replaceSpaces(String string) {

        StringBuilder strBuilder = new StringBuilder();

        String str = string.trim();
        //Determinate space is or not
        boolean isSpace = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(str.charAt(i));
                isSpace = false;
            }
        }
        return strBuilder.toString();
    }
}

