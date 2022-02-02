/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketingsystem.Entities;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author femitemiola
 */
public class Flight {
    private final String FlightNumber;
    private String AirportDeparture;
    private String AirportArrival;
    private Date DepartureDate;
    private Date DepartureTime;
    private Date ArrivalDate;
    private Date ArrivalTime;
    private final String RegistrationNumber;
    private final String passportID;

    public Flight(String FlightNumber, String AirportDeparture, String AirportArrival, Calendar DepartDate, Calendar DepartureTime, Calendar ArrivalDate, Calendar ArrivalTime, String RegistrationNumber, String passportID) {
        this.FlightNumber = FlightNumber;
        this.AirportDeparture = AirportDeparture;
        this.AirportArrival = AirportArrival;
        this.DepartureDate = DepartDate;
        this.DepartureTime = DepartureTime;
        this.ArrivalDate = ArrivalDate;
        this.ArrivalTime = ArrivalTime;
        this.RegistrationNumber = RegistrationNumber;
        this.passportID = passportID;
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

    public Date getDepartureDate() {
        return DepartureDate;
    }

    public void setDepartureDate(Date DepartureDate) {
        this.DepartureDate = DepartureDate;
    }

    public Date getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(Date DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    public Date getArrivalDate() {
        return ArrivalDate;
    }

    public void setArrivalDate(Date ArrivalDate) {
        this.ArrivalDate = ArrivalDate;
    }

    public Date getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(Date ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    public String getPassportID() {
        return passportID;
    }
    
    
    
}
