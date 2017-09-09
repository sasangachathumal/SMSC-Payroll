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
import com.smsc.model.Job_role_Detail;

/**
 *
 * @author smsc
 */
public class Jobrole_Details_Controller {
    public int addjobrole_details(Job_role_Detail detail) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Job_role_Detail VALUES(?,?)");
        ps.setObject(1, detail.getJrid());
        ps.setObject(2, detail.getEid());
        return ps.executeUpdate();
    }
    public Job_role_Detail searchjobrole_details(String eid) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Job_role_Detail WHERE Eid='"+eid+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Job_role_Detail(exQuery.getString("jrid"), exQuery.getString("Eid"));
        } else {
            return null;
        }
    }
    public Job_role_Detail searchjobrole_details_byjobrolid(String jrid) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Job_role_Detail WHERE Jrid='"+jrid+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Job_role_Detail(exQuery.getString("jrid"), exQuery.getString("Eid"));
        } else {
            return null;
        }
    }
}
