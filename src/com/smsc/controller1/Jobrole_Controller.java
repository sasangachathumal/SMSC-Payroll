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
import com.smsc.model.Job_Role;

/**
 *
 * @author smsc
 */
public class Jobrole_Controller {
    public int addJobRole(Job_Role job_Role) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Job_Role VALUES (?,?,?)");
        ps.setObject(1, job_Role.getJrid());
        ps.setObject(2, job_Role.getName());
        ps.setObject(3, job_Role.getPension_Age());
        return ps.executeUpdate();
    }
    public int updateJobRole(Job_Role job_Role) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Job_Role SET Name=?,Pension_Age=? WHERE Jrid=?");
        ps.setObject(3, job_Role.getJrid());
        ps.setObject(1, job_Role.getName());
        ps.setObject(2, job_Role.getPension_Age());
        return ps.executeUpdate();
    }
    public Job_Role searchjobrole_byjobroleid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Job_Role where Jrid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Job_Role(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3));
        } else {
            return null;
        }
    }
    public Job_Role searchjobrole_byjobroleName(String name) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Job_Role where Name='"+name+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet executeQuery = cstm.executeQuery(sql);
        if (executeQuery.next()) {
            return new Job_Role(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getString(3));
        } else {
            return null;
        }
    }
    public ArrayList<Job_Role> getalljobrole() throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Job_Role";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Job_Role> job_Roles=new ArrayList<>();
        while(exQuery.next()){
            Job_Role job_Role=new Job_Role(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3));
            job_Roles.add(job_Role);
        }
        return job_Roles;
    }
    public ArrayList<Job_Role> getalljobrole_byage(String age) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Job_Role WHERE Pension_Age='"+age+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Job_Role> job_Roles=new ArrayList<>();
        while(exQuery.next()){
            Job_Role job_Role=new Job_Role(exQuery.getString("Jrid"), exQuery.getString("Name"), exQuery.getString("Pension_Age"));
            job_Roles.add(job_Role);
        }
        return job_Roles;
    }

    public int remoreJobrole(String JRID) throws ClassNotFoundException, SQLException {
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("delete from Job_Role where Jrid=?");
        ps.setObject(1, JRID);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
}
