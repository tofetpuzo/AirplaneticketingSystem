/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketingsystem.connect;

/**
 *
 * @author femitemiola
 */
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class Connect {
    static String url = "jdbc:mysql://localhost:3306/kebank";
    static String username = "root";
    static String password = "mariopuzo4u";
    static Connection con = null;
    
    public static Connection getConnection() throws SQLException{
        Connection con = DriverManager.getConnection(url, username, password);
        return con;
    }
    
    
}
