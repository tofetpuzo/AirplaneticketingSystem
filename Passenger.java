/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketingsystem.Entities;

import java.util.Date;

/**
 *
 * @author femitemiola
 */
public class Passenger {
    
    private int passengerID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String passportID;
    private String Gender;
    private Date dateCreated;
    private String Nationality;
    private String Address;

    public Passenger(int passengerID, String firstName, String middleName, String lastName, String passportID, String Gender, Date dateCreated, String Nationality, String Address) {
        this.passengerID = passengerID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.passportID = passportID;
        this.Gender = Gender;
        this.dateCreated = dateCreated;
        this.Nationality = Nationality;
        this.Address = Address;
    }

    public int getPassengerID() {
        return passengerID;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportID() {
        return passportID;
    }

    public String getGender() {
        return Gender;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    
    
}
