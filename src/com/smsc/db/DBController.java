/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author smsc
 */
public class DBController {
        private static Connection connection;
    private static DBController dBController;

    public DBController() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/Payroll_System", "root", "");
    }
    public static DBController createConnection() throws ClassNotFoundException, SQLException{
        if(dBController == null){
            return dBController = new DBController();
        }
        return dBController;
    }
    public Connection getConnection(){
        return connection;
    }

}
