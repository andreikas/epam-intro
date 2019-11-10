package com.epam.programmigWithCasses.simple.task10;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static java.util.Calendar.*;

public class AirportMain {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

        List<Airline> airlineList = new ArrayList<>();
        Date date;

        try {
            date = simpleDateFormat.parse("12:00");
            Airline airline1 = new Airline("Berlin", 1525, Airline.airPlaneType.LIGHT_JETS,
                    date,
                    new Airline.dayOfWeek[]{Airline.dayOfWeek.MONDAY, Airline.dayOfWeek.SATURDAY}
            );
            airlineList.add(airline1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            date = simpleDateFormat.parse("14:00");
            Airline airline2 = new Airline("Paris", 1535, Airline.airPlaneType.HEAVY_JETS,
                    date,
                    new Airline.dayOfWeek[]{Airline.dayOfWeek.MONDAY, Airline.dayOfWeek.SATURDAY});
            airlineList.add(airline2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            date = simpleDateFormat.parse("16:00");
            Airline airline3 = new Airline("London", 1555, Airline.airPlaneType.MID_SIZE_JETS,
                    date,
                    new Airline.dayOfWeek[]{Airline.dayOfWeek.MONDAY, Airline.dayOfWeek.SATURDAY}
            );
            airlineList.add(airline3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Airport airport = new Airport(airlineList);


        AirportView airportView = new AirportView();
        airportView.printAirlineList(airport);

        airportView.printAirlineListByDestination("Berlin", airport);

    }
}
