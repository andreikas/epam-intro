package com.epam.programmigWithCasses.simple.task6;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time() {
    }

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (0 <= hour && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (0 <= min && min < 60) {
            this.min = min;
        } else {
            this.min = 0;
        }
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (0 <= sec && sec < 60) {
            this.sec = sec;
        } else {
            this.sec = 0;
        }
    }
}
