/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smsc.controller1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.smsc.db.DBController;
import com.smsc.model.Employee_Expetion_Details;

/**
 *
 * @author smsc
 */
public class Employee_Expetion_Details_Controller {

    /**
     *
     * @param details
     * @return if data add to table (return>0 add Ok)
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int addEmployee_Expetiondetails(Employee_Expetion_Details details) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Employee_Expetion_Details VALUES(?,?)");
        ps.setObject(1, details.getEEid());
        ps.setObject(2, details.getSid());
        return ps.executeUpdate();
    }

    /**
     *
     * @param eeid
     * @param sid
     * @return if have a data is return as Employee_Expetoin_Details Object
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Employee_Expetion_Details searchEmployee_Expetiondetails(String eeid,String sid) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Employee_Expetion_Details WHERE EEid='"+eeid+"',Sid='"+sid+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement ps = connection.createStatement();
        ResultSet exQuery = ps.executeQuery(sql);
        if (exQuery.next()) {
            return new Employee_Expetion_Details(exQuery.getString("Sid"), exQuery.getString("EEid"));
        } else {
            return null;
        }
    }
}
