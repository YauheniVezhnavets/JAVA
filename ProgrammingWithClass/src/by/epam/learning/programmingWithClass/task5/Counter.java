package by.epam.learning.programmingWithClass.task5;

public class Counter {
    private int value;
    private int minValue;
    private int maxValue;


    public Counter() {
        this.value = 0;
        this.minValue = 0;
        this.maxValue = 10;
    }

    public Counter(int value, int minValue, int maxValue) {
        this.value = value;
        this.minValue=minValue;
        this.maxValue=maxValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue() {
        this.value = value;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue() {
        this.value = value;
    }

    public void increaseValue() {
        if (isIncreasePossible(value)) {
            value++;
        }
    }

    public boolean isIncreasePossible(int checkValue) {
        if ((checkValue >= minValue) && (checkValue < maxValue)) {
            return true;
        } else {
            return false;
        }
    }

    public void decreaseValue() {
        if (isIncreasePossible(value))
            value--;
    }

    public boolean isDecreasePossible(int checkValue) {
        if ((checkValue > minValue) && (checkValue <= maxValue))
            return true;
        else
            return false;
    }
}
