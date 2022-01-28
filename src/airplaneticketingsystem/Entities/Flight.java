/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketingsystem.Entities;

import java.util.Calendar;

/**
 *
 * @author femitemiola
 */
public class Flight {
    private final String FlightNumber;
    private String AirportDeparture;
    private String AirportArrival;
    private Calendar DepartDate;
    private Calendar DepartureTime;
    private Calendar ArrivalDate;
    private Calendar ArrivalTime;
    private final String RegistrationNumber;

    public Flight(String FlightNumber, String AirportDeparture, String AirportArrival, Calendar DepartDate, Calendar DepartureTime, Calendar ArrivalDate, Calendar ArrivalTime, String RegistrationNumber) {
        this.FlightNumber = FlightNumber;
        this.AirportDeparture = AirportDeparture;
        this.AirportArrival = AirportArrival;
        this.DepartDate = DepartDate;
        this.DepartureTime = DepartureTime;
        this.ArrivalDate = ArrivalDate;
        this.ArrivalTime = ArrivalTime;
        this.RegistrationNumber = RegistrationNumber;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }


    public String getFlightNumber() {
        return FlightNumber;
    }

    public String getAirportDeparture() {
        return AirportDeparture;
    }

    public void setAirportDeparture(String AirportDeparture) {
        this.AirportDeparture = AirportDeparture;
    }

    public String getAirportArrival() {
        return AirportArrival;
    }

    public void setAirportArrival(String AirportArrival) {
        this.AirportArrival = AirportArrival;
    }

    public Calendar getDepartDate() {
        return DepartDate;
    }

    public void setDepartDate(Calendar DepartDate) {
        this.DepartDate = DepartDate;
    }

    public Calendar getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(Calendar DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    public Calendar getArrivalDate() {
        return ArrivalDate;
    }

    public void setArrivalDate(Calendar ArrivalDate) {
        this.ArrivalDate = ArrivalDate;
    }

    public Calendar getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(Calendar ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }
    
    
    
}
