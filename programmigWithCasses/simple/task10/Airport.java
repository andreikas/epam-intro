package com.epam.programmigWithCasses.simple.task10;

import java.util.List;

public class Airport {
    private List<Airline> airlineList;

    public Airport(List<Airline> airlineList) {
        this.airlineList = airlineList;
    }

    public Airport() {
    }

    public List<Airline> getAirlineList() {
        return airlineList;
    }

    public void setAirlineList(List<Airline> airlineList) {
        this.airlineList = airlineList;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airlineList=" + airlineList +
                '}';
    }
}
