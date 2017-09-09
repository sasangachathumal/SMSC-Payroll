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
import com.smsc.model.Department_Detail;

/**
 *
 * @author smsc
 */
public class Department_Details_Controller {
    public int addDepartment_Details(Department_Detail department_Detail) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Department_Detail VALUES(?,?)");
        ps.setObject(1, department_Detail.getDid());
        ps.setObject(2, department_Detail.getEid());
        return ps.executeUpdate();
    }
    public Department_Detail searchDepartment_Detailseid(String eid) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Department_Detail WHERE Eid='"+eid+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet exQuery = stm.executeQuery(sql);
        if (exQuery.next()) {
            return new Department_Detail(exQuery.getString("Did"), exQuery.getString("Eid"));
        } else {
            return null;
        }
    }
    public Department_Detail searchDepartment_Detailsdid(String did) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Department_Detail WHERE Did='"+did+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet exQuery = stm.executeQuery(sql);
        if (exQuery.next()) {
            return new Department_Detail(exQuery.getString("Did"), exQuery.getString("Eid"));
        } else {
            return null;
        }
    }
}
