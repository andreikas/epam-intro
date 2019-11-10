package com.epam.basics.line;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/
public class Task5 {
    public static void main(String[] args) {
        int t = 3630;
        int ss = t % 60;
        int mm = t % 3600 / 60;
        int hh = t % 86400 / 3600;
        System.out.printf("Длительность = " + hh + " " + mm + " " + ss);
    }
}
