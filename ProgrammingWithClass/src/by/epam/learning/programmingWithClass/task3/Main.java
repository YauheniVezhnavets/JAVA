package by.epam.learning.programmingWithClass.task3;
//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
// (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода
// фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GroupLogic grLogic= new GroupLogic();

        Group gr=new Group(10);

        gr.add(new Student("Калечиц Павел Леонидович",new int []{9,10,9,8,7}));
        gr.add(new Student("Иванов Сергей Петрович",new int []{9,10,9,4,8}));
        gr.add(new Student("Сидоров Андрей Викторович",new int []{6,8,8,9,7}));
        gr.add(new Student("Гиль Павел Михайлович",new int []{9,10,9,9,10}));
        gr.add(new Student("Сазонов Кирилл Иванович",new int []{9,10,8,9,6}));
        gr.add(new Student("Дебрей Владимир Владимирович",new int []{9,10,9,9,9}));
        gr.add(new Student("Андреева Екатерина Сергеевна",new int []{6,5,9,4,5}));
        gr.add(new Student("Завьялова Вероника Андреевна",new int []{9,10,9,9,9}));
        gr.add(new Student("Плюшкин Павел Сергеевич",new int []{9,10,9,8,7}));
        gr.add(new Student("Бородич Артем Леонидович",new int []{9,10,9,4,6}));


        List <Student> upperNineStudents;
        upperNineStudents=grLogic.takeUpperNineStudents(gr);

        printUpperNineStudents(upperNineStudents);


    }
    public static void printUpperNineStudents (List<Student> upperNineStudents){
        for (Student st:upperNineStudents){
            System.out.println(st.getFio());
        }
    }
}
