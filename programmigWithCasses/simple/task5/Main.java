package com.epam.programmigWithCasses.simple.task5;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 1; i < 105; i++) {
            counter.nextVal();
            System.out.println("Текущее значение счётчика:" + counter.getCurrentValue());
        }
        for (int i = 1; i < 105; i++) {
            counter.prevVal();
            System.out.println("Текущее значение счётчика:" + counter.getCurrentValue());
        }
    }
}
