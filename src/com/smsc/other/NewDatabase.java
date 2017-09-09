/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Chamith
 */
public class NewDatabase {
//create user ijseuser@localhost identified by '123';
    public void createNewDatabase() throws FileNotFoundException, IOException {
        int res = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "mysql");

            String sql = "create database Payroll_System";
            Statement stm = conn.createStatement();
            res = stm.executeUpdate(sql);
            conn.close();
        } catch (SQLException | ClassNotFoundException ex) {
        }
        if (res == 1) {
            File file = new File("Payroll System.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();

            int result = 0;
            while (line != null) {
                try {
                    result = DatabaseController.createNewDatabase(line);
                    line = bufferedReader.readLine();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(NewDatabase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "New Database Created...!");
        }

    }
}
