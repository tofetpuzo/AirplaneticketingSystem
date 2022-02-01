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
public class Booking {
    private int bookingID;
    private String Email;
    private String passportID;
    private String TicketNumber;
    private String SeatChoice;
    private String Adult;
    private String Child;
    private int triptypeID;
    private String FlightNumber;
    private double payTicket;
    private String FlightStatus;
    
    public Booking(int bookingID, String Email, String passportID, String TicketNumber, String SeatChoice, String Adult, String Child, int triptypeID, String FlightNumber, double payTicket, String FlightStatus) {
        this.bookingID = bookingID;
        this.Email = Email;
        this.passportID = passportID;
        this.TicketNumber = TicketNumber;
        this.SeatChoice = SeatChoice;
        this.Adult = Adult;
        this.Child = Child;
        this.triptypeID = triptypeID;
        this.FlightNumber = FlightNumber;
        this.payTicket = payTicket;
         this.FlightStatus = FlightStatus;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getTicketNumber() {
        return TicketNumber;
    }

    public void setTicketNumber(String TicketNumber) {
        this.TicketNumber = TicketNumber;
    }

    public String getSeatChoice() {
        return SeatChoice;
    }

    public void setSeatChoice(String SeatChoice) {
        this.SeatChoice = SeatChoice;
    }

    public String getAdult() {
        return Adult;
    }

    public void setAdult(String Adult) {
        this.Adult = Adult;
    }

    public String getChild() {
        return Child;
    }

    public void setChild(String Child) {
        this.Child = Child;
    }

    public int getTriptypeID() {
        return triptypeID;
    }

    public void setTriptypeID(int triptypeID) {
        this.triptypeID = triptypeID;
    }

    public double getPayTicket() {
        return payTicket;
    }

    public String getFlightStatus() {
        return FlightStatus;
    }

    public void setFlightStatus(String FlightStatus) {
        this.FlightStatus = FlightStatus;
    }
    
}
