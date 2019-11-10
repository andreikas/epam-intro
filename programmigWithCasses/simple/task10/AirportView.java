package com.epam.programmigWithCasses.simple.task10;

import java.util.ArrayList;
import java.util.List;

public class AirportView {
    public void printAirlineList( Airport airport) {
        System.out.println("--------- Список рейсов: ---------");
        List<Airline> airlineList = new ArrayList<>(airport.getAirlineList());
        for (Airline airline : airlineList) {
            System.out.println(airline.toString());
        }
    }
    public void printAirlineListByDestination( String destination, Airport airport) {
        System.out.println("---------  Список рейсов для заданного пункта назначения:  ---------");
        AirportLogic airportLogic = new AirportLogic();
        Airport airportNew = airportLogic.getAirlineByDestination(destination, airport);

        List<Airline> airlineList = new ArrayList<>(airportNew.getAirlineList());
        for (Airline airline : airlineList) {
            System.out.println(airline.toString());
        }
    }
}
