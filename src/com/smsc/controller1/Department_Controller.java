/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.controller1;

import java.sql.*;
import java.util.ArrayList;
import com.smsc.db.DBController;
import com.smsc.model.Department;

/**
 *
 * @author linux
 */
public class Department_Controller {
    public int Add_Department(Department department) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Department VALUES(?,?,?)");
        ps.setObject(1, department.getDid());
        ps.setObject(2,department.getName());
        ps.setObject(3, department.getBuilding());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    public Department search_Department_by_Name(String name) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Department WHERE Name=?");
        ps.setObject(1, name);
        ResultSet exQuery = ps.executeQuery();
        if (exQuery.next()) {
            return new Department(exQuery.getString("Did"), exQuery.getString("Name"), exQuery.getString("Building"));
        } else {
            return null;
        }
    }
    public Department search_Department_by_id(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Department WHERE Did=?");
        ps.setObject(1, id);
        ResultSet exQuery = ps.executeQuery();
        if (exQuery.next()) {
            return new Department(exQuery.getString("Did"), exQuery.getString("Name"), exQuery.getString("Building"));
        } else {
            return null;
        }
    }
    public Department search_Department_by_Building(String Building) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Department WHERE Building=?");
        ps.setObject(1, Building);
        ResultSet exQuery = ps.executeQuery();
        if (exQuery.next()) {
            return new Department(exQuery.getString("Did"), exQuery.getString("Name"), exQuery.getString("Building"));
        } else {
            return null;
        }
    }
    public int update_Department(Department department) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Department SET Name=?,Building=? WHERE Did=?");
        ps.setObject(3, department.getDid());
        ps.setObject(1,department.getName());
        ps.setObject(2, department.getBuilding());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    public ArrayList<Department> get_All_Department() throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Department";
        Connection connection = DBController.createConnection().getConnection();
        Statement st=connection.createStatement();
        ResultSet exQuery = st.executeQuery(sql);
        ArrayList<Department> departments=new ArrayList<>();
        while(exQuery.next()){
            Department department=new Department(exQuery.getString("Did"), exQuery.getString("Name"), exQuery.getString("Building"));
            departments.add(department);
        }
        return departments;
    }
    public int deleteDepartment(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE FROM Department WHERE Did=?");
        ps.setObject(1, id);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
}
