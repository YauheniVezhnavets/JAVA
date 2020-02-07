package by.epam.learning.javaStrings.Task03;
// В строке найти количество цифр.
public class Task03 {
    public static void main(String[] args) {
        String text = "thi213 1 text 34 contains 2 digits";
        findDigits(text);
    }
    public static void findDigits (String strings){
        int count=0;
        char [] mas={'0','1','2','3','4','5','6','7','8','9'};

        for (int i=0; i<strings.length();i++){
            for (int j=0;j<mas.length;j++){
                if (strings.charAt(i)==mas[j])
                    count++;
            }
        }
        System.out.println("Количество цифр в строке="+count);
    }
}

