/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.controller1;

import java.sql.*;
import java.util.ArrayList;
import com.smsc.db.DBController;
import com.smsc.model.Employee;

/**
 *
 * @author linux
 */
public class Empolyee_Controller {
    public int Add_Employee(Employee employee) throws ClassNotFoundException, ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps=connection.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?,?,?,?,?,?)");
        ps.setObject(1, employee.getEid());
        ps.setObject(2, employee.getGid());
        ps.setObject(3, employee.getSurename());
        ps.setObject(4, employee.getLastname());
        ps.setObject(5, employee.getGender());
        ps.setObject(6, employee.getNic_No());
        ps.setObject(7, employee.getAddress());
        ps.setObject(8, employee.getTelephone());
        ps.setObject(9, employee.getDate());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
        
    }
    public int Delete_Employee(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE FROM Employee WHERE Eid=?");
        ps.setObject(1, id);
        return ps.executeUpdate();
    }
    public Employee Search_Employee_by_id(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Employee WHERE Eid=?");
        ps.setObject(1, id);
        ResultSet rst;
        rst = ps.executeQuery();
        if (rst.next()) {
            return new Employee(rst.getString(1),rst.getString(2),rst.getString(3), rst.getString(4), rst.getString(5),rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9));
        } else {
            return null;
        }
    }
    public Employee Search_Employee_by_surname(String name) throws ClassNotFoundException, SQLException{
        String sql="";
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Employee WHERE Surename=?");
        ps.setObject(1, name);
        ResultSet rst= ps.executeQuery();
        if (rst.next()) {
            return new Employee(rst.getString(1),rst.getString(2),rst.getString(3), rst.getString(4), rst.getString(5),rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9));
        } else {
            return null;
        }
    }
    public Employee Search_Employee_by_Lastname(String name) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Employee WHERE Lastname=?");
        ps.setObject(1, name);
        ResultSet rst= ps.executeQuery();
        if (rst.next()) {
            return new Employee(rst.getString(1),rst.getString(2),rst.getString(3), rst.getString(4), rst.getString(5),rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9));
        } else {
            return null;
        }
    }
    public Employee Search_Employee_by_Nic(String nic) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Employee WHERE Nic_No=?");
        ps.setObject(1, nic);
        ResultSet rst= ps.executeQuery();
        if (rst.next()) {
            return new Employee(rst.getString(1),rst.getString(2),rst.getString(3), rst.getString(4), rst.getString(5),rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9));
        } else {
            return null;
        }
    }
    public ArrayList<Employee> get_all_Employee() throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Employee";
        Connection connection = DBController.createConnection().getConnection();
        Statement statement=connection.createStatement();
        ResultSet exQuery = statement.executeQuery(sql);
        ArrayList<Employee> employees=new ArrayList<>();
        while(exQuery.next()){
            Employee employee=new Employee(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getString(4), exQuery.getString(5),exQuery.getString(6), exQuery.getString(7), exQuery.getString(8), exQuery.getString(9));
            employees.add(employee);
        }
        return employees;
    }
    public int update_Employee(Employee employee) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Employee SET Gid=?,Surename=?,Lastname=?,Gender=?,Nic_No=?,Address=?,Telephone=? WHERE Eid=?");
        ps.setObject(8, employee.getEid());
        ps.setObject(1, employee.getGid());
        ps.setObject(2, employee.getSurename());
        ps.setObject(3, employee.getLastname());
        ps.setObject(4, employee.getGender());
        ps.setObject(5, employee.getNic_No());
        ps.setObject(6, employee.getAddress());
        ps.setObject(7, employee.getTelephone());
        return ps.executeUpdate();
    }
    
}
