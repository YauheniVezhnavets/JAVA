package by.epam.learning.javaStrings.Task01;

import org.w3c.dom.ls.LSOutput;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Task01 {
    public static void main(String[] args) {
        String[] camelCase = new String[]{"firstWord", "secondWord", "thirdWord",};
        String[] snakeCase=convertingArray(camelCase);

        print(camelCase);
        System.out.println();
        print(snakeCase);


    }
    public static String [] convertingArray (String [] strings){
        String [] snakeCase= new String[strings.length];
        for (int i=0; i<strings.length;i++){
            StringBuilder stringBuilder=new StringBuilder();
            for (int j=0; j<strings[i].length();j++){
                char currentSymbol=strings[i].charAt(j);
             if (Character.isLowerCase(currentSymbol)) {
                stringBuilder.append(currentSymbol);
                }
             else {
                 stringBuilder.append("_");
                 stringBuilder.append(Character.toLowerCase(currentSymbol));
                }
             snakeCase[i]=stringBuilder.toString();
            }
        }
        return snakeCase;
    }

    public static void print(String[] strings) {
        for (String x : strings) {
            System.out.print(x + " ,");
        }
    }
}

