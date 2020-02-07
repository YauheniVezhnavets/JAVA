package by.epam.method;
//10. Дано натуральное число N. Написать метод(методы) для формирования массива,
// элементами которого являются цифры числа N.
//решена
public class Task10 {
    public static void main(String[] args) {
        int n=5673412;
        int z=Method.getCountNumber(n);
        int [] mas=new int[z];

        for (int i=mas.length-1;i>=0;i--){
            mas[i]=Method.getNumber(n);
            n=n/10;
        }

        Method.print(mas);
    }
}

