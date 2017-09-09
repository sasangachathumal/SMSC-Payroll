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
import com.smsc.model.Leaves;

/**
 *
 * @author smsc
 */
public class Leaves_Controller {
    public int add_Leaves(Leaves leaves) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Leaves VALUES(?,?,?,?,?)");
        ps.setObject(1, leaves.getLeid());
        ps.setObject(2, leaves.getEid());
        ps.setObject(3, leaves.getLeaves_Date());
        ps.setObject(4, leaves.getLeaves_Type());
        ps.setObject(5, leaves.getTime());
        int executUpdate = ps.executeUpdate();
        return executUpdate;
    }
    public Leaves search_leaves_by_Leid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Leaves WHERE Leid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Leaves(exQuery.getString("Leid"), exQuery.getString("Eid"), exQuery.getString("Leaves_Date"), exQuery.getString("Leaves_Type"), exQuery.getShort("Time"));
        } else {
            return null;
        }
    }
    public ArrayList<Leaves> search_leaves_by_Eid(String eid) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Leaves WHERE Eid='"+eid+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Leaves> leaveses=new ArrayList<>();
        if (exQuery.next()) {
            Leaves leaves=new Leaves(exQuery.getString("Leid"), exQuery.getString("Eid"), exQuery.getString("Leaves_Date"), exQuery.getString("Leaves_Type"), exQuery.getShort("Time"));
            leaveses.add(leaves);
        } 
        return leaveses;
    }
    public ArrayList<Leaves> search_leaves_by_Leavedate(String date) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Leaves WHERE Leaves_Date='"+date+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Leaves> leaveses=new ArrayList<>();
        if (exQuery.next()) {
            Leaves leaves=new Leaves(exQuery.getString("Leid"), exQuery.getString("Eid"), exQuery.getString("Leaves_Date"), exQuery.getString("Leaves_Type"), exQuery.getShort("Time"));
            leaveses.add(leaves);
        } 
        return leaveses;
    }
    public ArrayList<Leaves> search_leaves_by_Leavetype(String type) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Leaves WHERE Leaves_Type='"+type+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Leaves> leaveses=new ArrayList<>();
        if (exQuery.next()) {
            Leaves leaves=new Leaves(exQuery.getString("Leid"), exQuery.getString("Eid"), exQuery.getString("Leaves_Date"), exQuery.getString("Leaves_Type"), exQuery.getShort("Time"));
            leaveses.add(leaves);
        } 
        return leaveses;
    }
    public ArrayList<Leaves> search_leaves_by_Time(String time) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Leaves WHERE Time='"+time+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Leaves> leaveses=new ArrayList<>();
        if (exQuery.next()) {
            Leaves leaves=new Leaves(exQuery.getString("Leid"), exQuery.getString("Eid"), exQuery.getString("Leaves_Date"), exQuery.getString("Leaves_Type"), exQuery.getShort("Time"));
            leaveses.add(leaves);
        } 
        return leaveses;
    }
    public int update_Leaves(Leaves leave) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Leaves SET Eid=?,Leaves_Date=?,Leaves_Type=?,Time=? WHERE Leid=?");
        ps.setObject(5, leave.getLeid());
        ps.setObject(1, leave.getEid());
        ps.setObject(2, leave.getLeaves_Date());
        ps.setObject(3, leave.getLeaves_Type());
        ps.setObject(4, leave.getTime());
        int executUpdate = ps.executeUpdate();
        return executUpdate;
    }
    public int delete_Leaves(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE FROM Leaves WHERE Leid=?");
        ps.setObject(1, id);
        return ps.executeUpdate();
    }
}
