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
import java.util.ArrayList;
import com.smsc.db.DBController;
import com.smsc.model.Employee_Expetions;

/**
 *
 * @author smsc
 */
public class Employee_Expetions_Controller {
    public int addEmployee_Expetion(Employee_Expetions expetions) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Employee_Expenses VALUES (?,?,?,?,?,?,?,?)");
        ps.setObject(1, expetions.getEEid());
        ps.setObject(2, expetions.getEPFEmployee());
        ps.setObject(3, expetions.getEPFCompany());
        ps.setObject(4, expetions.getETF());
        ps.setObject(5, expetions.getAttendance_Incentive());
        ps.setObject(6, expetions.getPromotion_Incentive());
        ps.setObject(7, expetions.getAdd_Date());
        ps.setObject(8, expetions.getUpdate_Date());
        return ps.executeUpdate();
    }
    public int updateEmployee_Expetion(Employee_Expetions expetion) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Employee_Expenses SET EPFEmployee=?,EPFCompany=?,ETF=?,Attendance_Incentive=?,Promotion_Incentive=?,Update_Date=? WHERE EEid=?");
        ps.setObject(7, expetion.getEEid());
        ps.setObject(1, expetion.getEPFEmployee());
        ps.setObject(2, expetion.getEPFCompany());
        ps.setObject(3, expetion.getETF());
        ps.setObject(4, expetion.getAttendance_Incentive());
        ps.setObject(5, expetion.getPromotion_Incentive());
        ps.setObject(6, expetion.getUpdate_Date());
        return ps.executeUpdate();
    }
    public Employee_Expetions searchEmployee_Expetion_byid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Employee_Expenses WHERE EEid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Employee_Expetions(exQuery.getString("EEid"), exQuery.getDouble("EPFEmployee"), exQuery.getDouble("EPFCompany"), exQuery.getDouble("ETF"), exQuery.getDouble("Attendance_Incentive"), exQuery.getDouble("Promotion_Incentive"), exQuery.getString("Add_Date"), exQuery.getString("Update_Date"));
        } else {
            return null;
        }
    }
    public Employee_Expetions searchEmployee_Expetion_byAdddate(String date) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Employee_Expenses WHERE Add_Date'"+date+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Employee_Expetions(exQuery.getString("EEid"), exQuery.getDouble("EPFEmployee"), exQuery.getDouble("EPFCompany"), exQuery.getDouble("ETF"), exQuery.getDouble("Attendance_Incentive"), exQuery.getDouble("Promotion_Incentive"), exQuery.getString("Add_Date"), exQuery.getString("Update_Date"));
        } else {
            return null;
        }
    }
    public Employee_Expetions searchEmployee_Expetion_byupdatedate(String date) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Employee_Expenses WHERE Update_Date='"+date+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Employee_Expetions(exQuery.getString("EEid"), exQuery.getDouble("EPFEmployee"), exQuery.getDouble("EPFCompany"), exQuery.getDouble("ETF"), exQuery.getDouble("Attendance_Incentive"), exQuery.getDouble("Promotion_Incentive"), exQuery.getString("Add_Date"), exQuery.getString("Update_Date"));
        } else {
            return null;
        }
    }
    public Employee_Expetions getAll() throws ClassNotFoundException, SQLException{
        String sq="select * from Employee_Expenses";
        Connection connection = DBController.createConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet executeQuery = stm.executeQuery(sq);
        if(executeQuery.next()){
            return new Employee_Expetions(executeQuery.getString(1), executeQuery.getDouble(2), executeQuery.getDouble(3), executeQuery.getDouble(4), executeQuery.getDouble(5), executeQuery.getDouble(6), executeQuery.getString(7), executeQuery.getString(8));
            
        } else {
            return null;
        }
    }
}
