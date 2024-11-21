/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jasper
 */
public class ConnectionManager {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bankingsystem";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "jasper123";
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            try{
                con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch(SQLException e){
                System.out.println("Can't get connection.");
            }
        } catch(ClassNotFoundException e){
            System.out.println("Driver not found");
        }
        return con;
    }
}
