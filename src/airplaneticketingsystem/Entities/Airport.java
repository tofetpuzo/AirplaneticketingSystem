/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketingsystem.Entities;

/**
 *
 * @author femitemiola
 */
public class Airport {

    private final String AirportName;
    private final String AirportAddress;
    private final int airportCode;
    private final String RegistrationNumber;

    public Airport(String AirportName, String AirportAddress, int airportCode, String RegistrationNumber) {
        this.AirportName = AirportName;
        this.AirportAddress = AirportAddress;
        this.airportCode = airportCode;
        this.RegistrationNumber = RegistrationNumber;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public String getAirportName() {
        return AirportName;
    }

    public String getAirportAddress() {
        return AirportAddress;
    }

    public int getAirportCode() {
        return airportCode;
    }



}
