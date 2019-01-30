/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineDictionary472;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Kab
 */
public class DbConnection {
    Statement statement = null;
    private Connection connection = null;
    private ResultSet rs = null;
    String connectionURL = "jdbc:mysql://localhost:3306/entries?autoReconnect=true&useSSL=false";

    public DbConnection() {
        try {

            try {
//Get a Connection to the database
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection = DriverManager.getConnection(connectionURL, "root", "K@binad25");
        } catch (SQLException e) {
            System.out.println("Exception is ;" + e);
        }

    }

    public ResultSet retrieveData(String s) {
        
        String sql = "SELECT * FROM entries WHERE word ='"+s+"'";
        System.out.println(sql);
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Exception is ;" + e);
        }
//trying to return the result set object
        System.out.println(rs.toString());
        return rs;

    }

    public void closeDBConnection() {
// close DB connection after retrieval is completed.
        try {
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Exception is ;" + e);
        }
    }
}