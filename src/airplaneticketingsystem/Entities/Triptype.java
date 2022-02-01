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
public class Triptype {
    private String TripName;
    private final int triptypeID;
    private final String FlightNumber;
    private final String passportID;
    private final int bookingID;
    private final String RegistrationNumber;

    public Triptype(int triptypeID, String FlightNumber, String passportID, int bookingID, String RegistrationNumber) {
        this.triptypeID = triptypeID;
        this.FlightNumber = FlightNumber;
        this.passportID = passportID;
        this.bookingID = bookingID;
        this.RegistrationNumber = RegistrationNumber;
    }



    public int getBookingID() {
        return bookingID;
    }


    public String getTripName() {
        return TripName;
    }

    public void setTripName(String TripName) {
        this.TripName = TripName;
    }

    public int getTriptypeID() {
        return triptypeID;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public String getPassportID() {
        return passportID;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    
}
