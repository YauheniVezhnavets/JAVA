package by.epam.learning.programmingWithClass.task4;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Train {
    private int numberOfTrain;
    private String destination;
    private Calendar timeOfDeparture;

    public Train(int numberOfTrain, String destination, Calendar timeOfDeparture) {
        this.numberOfTrain = numberOfTrain;
        this.destination = destination;
        this.timeOfDeparture = timeOfDeparture;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Calendar getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(Calendar timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

}
