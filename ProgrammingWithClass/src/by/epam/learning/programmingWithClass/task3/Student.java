package by.epam.learning.programmingWithClass.task3;

public class Student {
    private String fio;
    private int[] mark;

    public Student(String fio, int[] mark) {
        this.fio = fio;
        this.mark = mark;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int[] getMark() {
        return mark;
    }

    public void setGroup(int[] mark) {
        this.mark = mark;
    }
}
