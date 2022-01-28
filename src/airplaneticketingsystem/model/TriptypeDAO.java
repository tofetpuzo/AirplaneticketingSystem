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

public class TriptypeDAO {

    static Connection con = null;

    public static ResultSet getAllTripType() {
        try {
            con = Connect.getConnection();
            Statement smt = con.createStatement();
            String query = "SELECT * FROM Triptype";
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                return rs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TriptypeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}