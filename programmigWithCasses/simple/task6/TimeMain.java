package com.epam.programmigWithCasses.simple.task6;

public class TimeMain {
    public static void main(String[] args) {
        Time time = new Time(10, 20, 30);
        TimeView timeView = new TimeView();
        timeView.printCurrentTime(time);
        time.setHour(15);
        time.setMin(90);
        time.setSec(180);
        timeView.printCurrentTime(time);
        TimeLogic timeLogic = new TimeLogic();
        timeLogic.setHour(5, time);
        timeLogic.setMin(90, time);
        timeLogic.setSec(180, time);
        timeView.printCurrentTime(time);
    }


}
