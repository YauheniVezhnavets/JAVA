package by.epam.learning.programmingWithClass.task3;

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {
    private StudentLogic stLogic =new StudentLogic();

    public List<Student> takeUpperNineStudents (Group group){

        List <Student> result= new ArrayList <Student>();
        Student [] students= group.getStudents();

        for (Student st: students){
            if (stLogic.isAStudent(st)){
                result.add(st);
            }

        }
        return result;
    }
}
