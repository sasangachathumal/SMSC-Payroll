/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smsc.controller1;

import com.smsc.db.DBController;
import com.smsc.model.HalfDay;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author smsc
 */
public class HalfDay_Controller {
    
    public int createHalfDay(HalfDay halfDay) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("insert into Halfday values(?,?,?,?,?)");
        ps.setObject(1, halfDay.getHid());
        ps.setObject(2, halfDay.getEid());
        ps.setObject(3, halfDay.getDate());
        ps.setObject(4, halfDay.getToday_ArrivalTime());
        ps.setObject(5, halfDay.getHalfday_LeaveTime());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    public int updateHalfday(HalfDay halfDay) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("update Halfday set Date=?,Halfday_LeaveTime=? where Hid=?");
        ps.setObject(1, halfDay.getDate());
        ps.setObject(2, halfDay.getHalfday_LeaveTime());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    public HalfDay searchHalfDay_by_HalfdayID(String Hid) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from Halfday where Hid=?");
        ps.setObject(1, Hid);
        ResultSet executeQuery = ps.executeQuery();
        if (executeQuery.next()) {
            return new HalfDay(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getDouble(4),executeQuery.getDouble(5));
        } else {
            return null;
        }
    }
    public ArrayList<HalfDay> searchHalfday_by_EmployeeID(String Eid) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from Halfday where Eid=?");
        ps.setObject(1, Eid);
        ResultSet executeQuery = ps.executeQuery();
        ArrayList<HalfDay> halfDays=new ArrayList<>();
        while(executeQuery.next()){
            HalfDay day=new HalfDay(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getDouble(4),executeQuery.getDouble(5));
            halfDays.add(day);
        }
        return halfDays;
    }
    
        public ArrayList<HalfDay> searchHalfday_by_Date(String date) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from Halfday where Date=?");
        ps.setObject(1, date);
        ResultSet executeQuery = ps.executeQuery();
        ArrayList<HalfDay> halfDays=new ArrayList<>();
        while(executeQuery.next()){
            HalfDay day=new HalfDay(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getDouble(4),executeQuery.getDouble(5));
            halfDays.add(day);
        }
        return halfDays;
    }
        public ArrayList<HalfDay> searchHalfday_oneemployee_ofthismonth_by_Date(String Eid,String date) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from Halfday where Eid=? and Date like '?%'");
        ps.setObject(1, Eid);
        ps.setObject(2, date);
        ResultSet executeQuery = ps.executeQuery();
        ArrayList<HalfDay> halfDays=new ArrayList<>();
        while(executeQuery.next()){
            HalfDay day=new HalfDay(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getDouble(4),executeQuery.getDouble(5));
            halfDays.add(day);
        }
        return halfDays;
    }
        
        public ArrayList<HalfDay> searchHalfday_ofthismonth_by_Date(String date) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from Halfday where Date '?%'");
        ps.setObject(1, date);
        ResultSet executeQuery = ps.executeQuery();
        ArrayList<HalfDay> halfDays=new ArrayList<>();
        while(executeQuery.next()){
            HalfDay day=new HalfDay(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getDouble(4),executeQuery.getDouble(5));
            halfDays.add(day);
        }
        return halfDays;
    }
        public ArrayList<HalfDay> searchHalfday() throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from Halfday");
        ResultSet executeQuery = ps.executeQuery();
        ArrayList<HalfDay> halfDays=new ArrayList<>();
        while(executeQuery.next()){
            HalfDay day=new HalfDay(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getDouble(4),executeQuery.getDouble(5));
            halfDays.add(day);
        }
        return halfDays;
    }
        public int deleteHalfday(String Hid) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("delete from Halfday where Hid=?");
        ps.setObject(1, Hid);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
        }
}
