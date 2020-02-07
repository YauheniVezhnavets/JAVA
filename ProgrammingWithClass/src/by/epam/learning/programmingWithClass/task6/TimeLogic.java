package by.epam.learning.programmingWithClass.task6;

public class TimeLogic {
    Time time;

    public void add (Time time,int hour, int minute, int second){
        int newHour;
        int newMinute;
        int newSecond;

        newHour=time.getHour()+hour;
        newMinute=time.getMinute()+minute;
        newSecond=time.getSecond()+second;


        if (newSecond>59 ){
            int tempOne=newSecond/60;
            newSecond=newSecond%60;
            newMinute=newMinute+tempOne;
        }
        if (newMinute>59 ){
            int tempTwo=newMinute/60;
            newMinute=newMinute%60;
            newHour=newHour+tempTwo;
        }
        if (newHour>23){
            newHour=newHour%60;
        }

        time.setHour(newHour);
        time.setMinute(newMinute);
        time.setSecond(newSecond);

        }
}
