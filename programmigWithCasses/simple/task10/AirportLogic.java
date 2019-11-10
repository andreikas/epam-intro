package com.epam.programmigWithCasses.simple.task10;

import java.util.ArrayList;
import java.util.List;


public class AirportLogic {
    public AirportLogic() {
    }

    public Airport getAirlineByDestination(String destination, Airport airport) {
        List<Airline> airlineListNew = new ArrayList<>();
        for (Airline airline : airport.getAirlineList()) {
            if (airline.getDestination() == destination) {
                airlineListNew.add(airline);
            }
        }
        return new Airport(airlineListNew);
    }

//    public Airport getAirlineByDayOfWeek(int dayOfWeek, Airport airport) {
//        List<Airline> airlineList = new ArrayList<>(airport.getAirlineList());
//        List<Airline> airlineListNew = airlineList.stream().filter(d -> d.getDayOfWeek() == dayOfWeek).collect(Collectors.toList());
//        return new Airport(airlineListNew);
//    }
//
//    public Airport getAirlineByDayOfWeekAndDepartureTime(int dayOfWeek, Date departureTime, Airport airport) {
//        List<Airline> airlineList = new ArrayList<>(airport.getAirlineList());
//        List<Airline> airlineListNew = airlineList.stream().filter(
//                d ->
//                        (d.getDayOfWeek() == dayOfWeek)
//                                && d.getDepartureTime().getTime() > departureTime.getTime()
//        ).collect(Collectors.toList());
//        return new Airport(airlineListNew);
//    }
}
