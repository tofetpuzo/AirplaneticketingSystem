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
    private String FlightClass;

    public Triptype(String TripName,int triptypeID, String passportID, int bookingID, String RegistrationNumber, String FlightClass) {
       this.TripName = TripName;
        this.triptypeID = triptypeID;
        this.FlightClass = FlightClass;
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
