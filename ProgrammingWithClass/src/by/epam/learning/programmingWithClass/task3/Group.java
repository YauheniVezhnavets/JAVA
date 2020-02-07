package by.epam.learning.programmingWithClass.task3;

public class Group {
    private Student[] students;
    private int countOfStudents;

    public Group(int number) {
        students = new Student[number];
        countOfStudents = 0;
    }

    public boolean add(Student newStudent) {
        if (countOfStudents >= students.length) {
            return false;
        }
        students[countOfStudents] = newStudent;
        countOfStudents++;
        return true;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
