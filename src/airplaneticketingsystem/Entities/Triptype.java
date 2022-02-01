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
    private final int bookingID;
    private String FlightClass;

    public Triptype(int triptypeID, String passportID, int bookingID, String RegistrationNumber, String FlightClass) {
        this.triptypeID = triptypeID;
        this.bookingID = bookingID;
        this.FlightClass = FlightClass;
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

    public String getFlightClass() {
        return FlightClass;
    }

    public void setFlightClass(String FlightClass) {
        this.FlightClass = FlightClass;
    }

    
}
