/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketingsystem.model;

/**
 *
 * @author femitemiola
 */
import airplaneticketingsystem.Entities.Passenger;
import airplaneticketingsystem.connect.Connect;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PassengerDAO {

    static Passenger passengers = null;
    static Connection con = null;

    public static ResultSet getAllPassengers() {
        try {
            con = Connect.getConnection();
            if (con != null) {
                Statement smt = con.createStatement();
                String query = "SELECT * FROM Passenger";
                ResultSet rs = smt.executeQuery(query);
                while (rs.next()) {
                    return rs;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(PassengerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static boolean insertPassenger(Passenger passenger) {
        int status = 0;
        try {
            con = Connect.getConnection();

            if (con != null) {
                Statement smt = con.createStatement();
                String query = "INSERT into Passenger (passengerID, firstname, middleName, lastname, passportID, gender, dateCreated, Nationality, Address)"
                        + " VALUES(" + ",NULL," + ",'" + passenger.getFirstName() + "', '" + passenger.getMiddleName() + "', '" + passenger.getLastName()
                        + "', '" + passenger.getPassportID() + "', '" + passenger.getGender() + "', " + ", NULL, "  + "', " + ", NULL, " + ","
                        + "'" + passenger.getNationality() + "', '" + passenger.getAddress() + "')";
                status = smt.executeUpdate(query);
                if (status > 0) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PassengerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public static boolean deletePassenger(String passportID) {
        int status = 0;
        try {
            con = Connect.getConnection();
            if (con != null) {
                Statement smt = con.createStatement();
                String query = "DELETE FROM Passenger where passportID = '" + passengers.getPassportID() + "'";
                status = smt.executeUpdate(query);
                if (status > 0) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PassengerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean updatePassenger(Passenger passenger) {
        int status = 0;
        try {
            con = Connect.getConnection();
            if (con != null) {
                Statement smt = con.createStatement();
                String query = "Update from Passenger set passengerID=  " + ",NULL, " 
                        + ",'" + passenger.getFirstName() + "','" + passenger.getMiddleName() + "','" 
                        + passenger.getLastName() + "', '" + passenger.getPassportID() + "', '" 
                        + passenger.getGender() + "', " + ", NULL, "  + "', " + ", NULL, " + ","
                        + "'" + passenger.getNationality() + "', '" + passenger.getAddress() + "'";
                status = smt.executeUpdate(query);
                if (status > 0) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PassengerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean updateRecipt(){
        return true;
    }
}
