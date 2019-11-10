package com.epam.programmigWithCasses.simple.task10;


import java.util.Arrays;
import java.util.Date;

public class Airline {
    public enum dayOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public enum airPlaneType {LIGHT_JETS, MID_SIZE_JETS, HEAVY_JETS}

    private String destination;
    private int flightNumber;
    private airPlaneType airplaneType;
    private Date departureTime;
    private dayOfWeek[] dayOfFlight;


    public Airline() {
    }

    public Airline(String destination, int flightNumber, airPlaneType airplaneType, Date departureTime, dayOfWeek[] dayOfFlight) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.airplaneType = airplaneType;
        this.departureTime = departureTime;
        this.dayOfFlight = dayOfFlight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public airPlaneType getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(airPlaneType airplaneType) {
        this.airplaneType = airplaneType;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public dayOfWeek[] getDayOfFlight() {
        return dayOfFlight;
    }

    public void setDayOfFlight(dayOfWeek[] dayOfFlight) {
        this.dayOfFlight = dayOfFlight;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", airplaneType=" + airplaneType +
                ", departureTime=" + departureTime +
                ", dayOfFlight=" + Arrays.toString(dayOfFlight) +
                '}';
    }
}
