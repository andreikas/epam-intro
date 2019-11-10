package com.epam.programmigWithCasses.simple.task5;

public class Counter {
    private int minValue;
    private int maxValue;
    private int currentValue;

    public Counter(int minValue, int maxValue, int currentValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.currentValue = currentValue;
    }

    public Counter() {
        this.minValue = 1;
        this.maxValue = 100;
        this.currentValue = 1;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }
    public void nextVal() {
        int currentValue = getCurrentValue();
        int nextVal = currentValue+1;
        if (nextVal <= getMaxValue()) {
            this.setCurrentValue(nextVal);
        } else {
            System.out.println("Достигнут верхний предел");
        }
    }


    public void prevVal() {
        int currentValue = getCurrentValue();
        int prvVal = currentValue-1;
        if (prvVal >= getMinValue())
            this.setCurrentValue(prvVal);
        else {
            System.out.println("Достигнут нижний предел");
        }
    }


}
