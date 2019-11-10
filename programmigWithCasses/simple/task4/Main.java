package com.epam.programmigWithCasses.simple.task4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.*/

public class Main extends Train {

    public static void main(String[] args) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("HH:mm");

        Train[] train = new Train[5];
        train[0] = new Train("Moscow", 2, formatter.parse("9:00"));
        train[1] = new Train("Berlin", 10, formatter.parse("10:00"));
        train[2] = new Train("Prague", 5, formatter.parse("10:30"));
        train[3] = new Train("Riga", 15, formatter.parse("11:30"));
        train[4] = new Train("Riga", 20, formatter.parse("11:00"));
        List<Train> trainList = Arrays.asList(train);
        trainList = TrainLogic.sort(trainList);
        for (Train trains : trainList) {
            System.out.printf("Поезд № %d, в %s отправляеться в %s %n", trains.getTrainNumber(), trains.getDestination(), trains.getDepartureTime());
        }
    }
}
