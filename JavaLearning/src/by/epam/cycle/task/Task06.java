package by.epam.cycle.task;
//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Task06 {
    public static void main(String[] args) {
    char ca;
    char cb;
    char cc;
    char cd;
    char ce;
    char ch;

    ca='a';
    cb='b';
    cc='c';
    cd='d';
    ce='e';
    ch='h';

    int caCode;
    int cbCode;
    int ccCode;
    int cdCode;
    int ceCode;
    int chCode;

    caCode=ca;
    cbCode=cb;
    ccCode=cc;
    cdCode=cd;
    ceCode=ce;
    chCode=ch;

        System.out.println(ca+ "="+caCode);
        System.out.println(cb+"="+ cbCode);
        System.out.println(cc+"="+ccCode);
        System.out.println(cd+"="+cdCode);
        System.out.println(ce+"="+ceCode);
        System.out.println(ch+"="+chCode);

    }
}
