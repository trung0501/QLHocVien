/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author admin
 */
public class ketnoi {
    public Connection con;
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/qlhv";
        String user = "root";
        String password = "";
        Class.forName ("com.mysql.cj.jbdc.Driver");
        con = DriverManager.getConnection (URL, user, password);
        return con;
    }
    public void disconnection() throws SQLException{
        con.close();
    }
}
