package com.epam.programmigWithCasses.simple.task6;

public class TimeLogic {

    public void setHour(int hour, Time time) {
        int newHour = time.getHour() + hour;
        if (newHour < 24) {
            time.setHour(newHour);
        } else {
            time.setHour(newHour % 24);
        }

    }

    public void setMin(int min, Time time) {
        int newMin = time.getMin() + min;
        if (newMin < 60) {
            time.setMin(newMin);
        } else {

            time.setMin(newMin % 60);
            setHour((newMin - newMin % 60) / 60,time);
        }


    }

    public void setSec(int sec, Time time) {
        int newSec = time.getSec() + sec;
        if (newSec < 60) {
            time.setSec(newSec);
        } else {

            time.setSec(newSec % 60);
            setMin((newSec - newSec % 60) / 60, time);
        }
        time.setSec(sec);
    }


}
