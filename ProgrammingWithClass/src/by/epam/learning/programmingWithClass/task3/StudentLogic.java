package by.epam.learning.programmingWithClass.task3;

public class StudentLogic {
    public boolean isAStudent (Student st){
        int [] marks;


        marks=st.getMark();

       for (int mark:marks){
            if (mark<9){
                return false;
            }
        }
        return true;
    }
}
