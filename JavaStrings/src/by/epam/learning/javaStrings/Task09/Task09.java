package by.epam.learning.javaStrings.Task09;
//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Task09 {
    public static void main(String[] args) {
        String string="информатика";
        System.out.println(changeWord(string));
    }
    public static String changeWord (String word){
       String symbol =String.valueOf(word.charAt(word.indexOf('т')));
       String cake=symbol;
         cake += String.valueOf(word.charAt(word.indexOf('о')));
         cake += String.valueOf(word.charAt(word.indexOf('р')));
         cake += symbol;
         return cake;
    }
}
        