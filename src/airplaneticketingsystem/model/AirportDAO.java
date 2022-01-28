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

import airplaneticketingsystem.Entities.Airport;
import airplaneticketingsystem.connect.Connect;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AirportDAO {

    static Connection con = null;
    
    public static ResultSet getAllAirportNames(){
        try {
            con = Connect.getConnection();
            Statement smt = con.createStatement();
            String query = "SELECT * FROM Airport";
            ResultSet rs = smt.executeQuery(query);
            while(rs.next()){
                return rs;
           }         
        } catch (SQLException ex) {
            Logger.getLogger(AirportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;        
    }

    public static boolean insertAirportDetails(Airport airport){
        int status = 0;
        try {          
            con = Connect.getConnection();
            Statement smt = con.createStatement();
             String query  = "INSERT INTO Airport (AirportName, AirportAddress, airportCode, FlightNumber, RegistrationNumber)" 
             + "VALUES ('" + airport.getAirportName() +  "', '" + airport.getAirportAddress() + "', " + ",NULL," + ", '" + airport.getFlightNumber() + "', '" + airport.getRegistrationNumber() + "')";
             status = smt.executeUpdate(query);
             if(status > 0){
                 return true;
             }
        } catch (SQLException ex) {
            Logger.getLogger(AirportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    public static boolean updateAirportDetails(Airport airport){
        int status = 0;
        try {
            con = Connect.getConnection();
            Statement smt = con.createStatement();
            String query = "UPDATE from Airport set AirportName = '" + airport.getAirportName() 
                    + "' , '" + airport.getAirportAddress() + "', " + ",NULL," + ", " + ",NULL," + ", '" + airport.getFlightNumber() + "', '" + airport.getRegistrationNumber() + "'";
            status = smt.executeUpdate(query);
            if(status > 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AirportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;        
    }
    
    
    
    
}
