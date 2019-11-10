package com.epam.programmigWithCasses.simple.task6;

public class TimeView {
    public TimeView() {
    }

    public void printCurrentTime(Time time) {
        System.out.printf(
                "Текущее время : %d:%d:%d %n", time.getHour(), time.getMin(), time.getSec()
        );
    }
}
