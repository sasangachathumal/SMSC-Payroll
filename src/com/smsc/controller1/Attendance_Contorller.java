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
import com.smsc.model.Attendance;
import com.smsc.model.getattendance_byemployee_nic;

/**
 *
 * @author smsc
 */
public class Attendance_Contorller {
    
    public static int Add_Attendance(Attendance attendance) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Attendance VALUES(?,?,?,?,?,?,?,?)");
        ps.setObject(1, attendance.getAtid());
        ps.setObject(2, attendance.getEid());
        ps.setObject(3, attendance.getDate());
        ps.setObject(4, attendance.getDate_type());
        ps.setObject(5, attendance.getAttend());
        ps.setObject(6, attendance.getArrival_Time());
        ps.setObject(7, attendance.getLeave_Time());
        ps.setObject(8, attendance.getOt_Bonus());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    public static int mark_Attendance(Attendance attendance) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Attendance VALUES(?,?,?,?,?,?)");
        ps.setObject(1, attendance.getAtid());
        ps.setObject(2, attendance.getEid());
        ps.setObject(3, attendance.getDate());
        ps.setObject(4, attendance.getDate_type());
        ps.setObject(5, attendance.getAttend());
        ps.setObject(6, attendance.getArrival_Time());
        return ps.executeUpdate();
    }
    public static Attendance search_Attendance_by_Attendanceid(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Attendance WHERE Atid=?");
        ps.setObject(1, id);
        ResultSet exQuery = ps.executeQuery();
        if (exQuery.next()) {
            return new Attendance(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3),exQuery.getString(4),exQuery.getString(5), exQuery.getString(6), exQuery.getString(7), exQuery.getDouble(8));
        } else {
            return null;
        }
    }
    public static ArrayList<Attendance> search_Attendance_by_Attendanceemployeeid(String eid) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Attendance WHERE Eid=?");
        ps.setObject(1, eid);
        ResultSet exQuery = ps.executeQuery();
        ArrayList<Attendance> attendances=new ArrayList<>();
        while (exQuery.next()) {
            Attendance attendance = new Attendance(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3),exQuery.getString(4),exQuery.getString(5), exQuery.getString(6), exQuery.getString(7), exQuery.getDouble(8));
            attendances.add(attendance);
        }
        return attendances;
    }
    public static ArrayList<getattendance_byemployee_nic> search_Attendance_by_EmployeeNIC_AllDetails(String nic,String date) throws ClassNotFoundException, SQLException{
        String sql="select e.Lastname as 'name',a.Atid as 'AID',a.Eid as 'EID',a.Date as 'date',a.Date_type as 'type',a.Attend as 'attend',a.Arrival_Time as 'arrivaltime',a.Leave_Time as 'leavetime',a.Ot_Bonus as 'bonus' from Employee e , Attendance a where e.Eid=a.Eid and a.Date like '"+date+"%' and e.Nic_No='"+nic+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cs = connection.createStatement();
        ResultSet exQuery = cs.executeQuery(sql);
        ArrayList<getattendance_byemployee_nic> attendances=new ArrayList<>();
        while(exQuery.next()){
            getattendance_byemployee_nic attendance=new getattendance_byemployee_nic(exQuery.getString("name"),exQuery.getString("AID"),exQuery.getString("EID"),exQuery.getString("date"),exQuery.getString("type"),exQuery.getString("attend"),exQuery.getDouble("arrivaltime"),exQuery.getDouble("leavetime"),exQuery.getDouble("bonus"));
            attendances.add(attendance);
        }
        return attendances;
    }
    public static ArrayList<getattendance_byemployee_nic> search_Attendance_by_EmployeeNIC_AllDetail(String nic,String date) throws ClassNotFoundException, SQLException{
        String sql="select e.Lastname as 'name',a.Atid as 'AID',a.Eid as 'EID',a.Date as 'date',a.Date_type as 'type',a.Attend as 'attend',a.Arrival_Time as 'arrivaltime',a.Leave_Time as 'leavetime',a.Ot_Bonus as 'bonus' from Employee e , Attendance a where Date ='"+date+"' and Nic_No='"+nic+"' and e.Eid=a.Eid";
        Connection connection = DBController.createConnection().getConnection();
        Statement cs = connection.createStatement();
        ResultSet exQuery = cs.executeQuery(sql);
        ArrayList<getattendance_byemployee_nic> attendances=new ArrayList<>();
        while(exQuery.next()){
            getattendance_byemployee_nic attendance=new getattendance_byemployee_nic(exQuery.getString("name"),exQuery.getString("AID"),exQuery.getString("EID"),exQuery.getString("date"),exQuery.getString("type"),exQuery.getString("attend"),exQuery.getDouble("arrivaltime"),exQuery.getDouble("leavetime"),exQuery.getDouble("bonus"));
            attendances.add(attendance);
        }
        return attendances;
    }
    
    public static ArrayList<Attendance> search_Attendance_by_Employeeid_Leavetime_ot(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Attendance WHERE Eid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cs = connection.createStatement();
        ResultSet exQuery = cs.executeQuery(sql);
        ArrayList<Attendance> attendances=new ArrayList<>();
        while(exQuery.next()){
            Attendance attendance=new Attendance(exQuery.getString(7),exQuery.getDouble(8));
            attendances.add(attendance);
        }
        return attendances;
    }
    public static ArrayList<Attendance> search_Attendance_by_Date(String date) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Attendance WHERE Date='"+date+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cs = connection.createStatement();
        ResultSet exQuery = cs.executeQuery(sql);
        ArrayList<Attendance> attendances=new ArrayList<>();
        while(exQuery.next()){
            Attendance attendance=new Attendance(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3),exQuery.getString(4),exQuery.getString(5), exQuery.getString(6), exQuery.getString(7), exQuery.getDouble(8));
            attendances.add(attendance);
        }
        return attendances;
    }
    
        public static ArrayList<Attendance> search_Attendance_by_ArrivalTime(double time) throws ClassNotFoundException, SQLException{
            String sql="SELECT * FROM Attendance WHERE Arrival_Time='"+time+"'";
            Connection connection = DBController.createConnection().getConnection();
            Statement cs = connection.createStatement();
            ResultSet exQuery = cs.executeQuery(sql);
            ArrayList<Attendance> attendances=new ArrayList<>();
            while(exQuery.next()){
                Attendance attendance=new Attendance(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3),exQuery.getString(4),exQuery.getString(5), exQuery.getString(6), exQuery.getString(7), exQuery.getDouble(8));
                attendances.add(attendance);
            }
            return attendances;
    }
        public static ArrayList<Attendance> search_Attendance_by_LeaveTime(double time) throws ClassNotFoundException, SQLException{
            String sql="SELECT * FROM Attendance WHERE Leave_Time='"+time+"'";
            Connection connection = DBController.createConnection().getConnection();
            Statement cs = connection.createStatement();
            ResultSet exQuery = cs.executeQuery(sql);
            ArrayList<Attendance> attendances=new ArrayList<>();
            while(exQuery.next()){
                Attendance attendance=new Attendance(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3),exQuery.getString(4),exQuery.getString(5), exQuery.getString(6), exQuery.getString(7), exQuery.getDouble(8));
                attendances.add(attendance);
            }
            return attendances;
    }
        public static ArrayList<Attendance> search_Attendance_by_OtBonus(double amount) throws ClassNotFoundException, SQLException{
            String sql="SELECT * FROM Attendance WHERE Ot_Bouns='"+amount+"'";
            Connection connection = DBController.createConnection().getConnection();
            Statement cs = connection.createStatement();
            ResultSet exQuery = cs.executeQuery(sql);
            ArrayList<Attendance> attendances=new ArrayList<>();
            while(exQuery.next()){
                Attendance attendance=new Attendance(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3),exQuery.getString(4),exQuery.getString(5), exQuery.getString(6), exQuery.getString(7), exQuery.getDouble(8));
                attendances.add(attendance);
            }
            return attendances;
    }
        public  static int update_Attendance_AllDetails(Attendance attendance) throws ClassNotFoundException, SQLException{
            Connection connection = DBController.createConnection().getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE Attendance SET Eid=?,Date=?,Date_type=?,Attend=?,Arrival_Time=?,Leave_Time=?,Ot_Bonus=? WHERE Atid=?");
            ps.setObject(8, attendance.getAtid());
            ps.setObject(1, attendance.getEid());
            ps.setObject(2, attendance.getDate());
            ps.setObject(3, attendance.getDate_type());
            ps.setObject(4, attendance.getAttend());
            ps.setObject(5, attendance.getArrival_Time());
            ps.setObject(6, attendance.getLeave_Time());
            ps.setObject(7, attendance.getOt_Bonus());
            return ps.executeUpdate();
        }
        public  static int update_Attendance_LeaveTome_Ot(Attendance attendance) throws ClassNotFoundException, SQLException{
            Connection connection = DBController.createConnection().getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE Attendance SET Leave_Time=?,Ot_Bonus=? WHERE Atid=?");
            ps.setObject(3, attendance.getAtid());
            ps.setObject(1, attendance.getLeave_Time());
            ps.setObject(2, attendance.getOt_Bonus());
            return ps.executeUpdate();
        }
        public static int delete_Attedance(String id) throws ClassNotFoundException, SQLException{
            Connection connection = DBController.createConnection().getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Attendance WHERE Atid=?");
            ps.setObject(1, id);
            return ps.executeUpdate();
        }
        public  static ArrayList<Attendance> getallAttendance() throws ClassNotFoundException, SQLException{
            String sql="SELECT * FROM Attendance";
            Connection connection = DBController.createConnection().getConnection();
            Statement stm = connection.createStatement();
            ResultSet exQuery = stm.executeQuery(sql);
            ArrayList<Attendance> attendances=new ArrayList<>();
            while(exQuery.next()){
                Attendance a=new Attendance(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3),exQuery.getString(4),exQuery.getString(5), exQuery.getString(6), exQuery.getString(7), exQuery.getDouble(8));
                attendances.add(a);
            }
            return attendances;
        }
        
        public ArrayList<Attendance> getMonthAttendance(String year) throws ClassNotFoundException, SQLException{
            String sql="seltct * from Attendance a where Date like '?%'";
            Connection connection = DBController.createConnection().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setObject(1, year);
            ResultSet exQuery = ps.executeQuery();
            ArrayList<Attendance> attendances=new ArrayList<>();
            while(exQuery.next()){
                Attendance a=new Attendance(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3),exQuery.getString(4),exQuery.getString(5), exQuery.getString(6), exQuery.getString(7), exQuery.getDouble(8));
                attendances.add(a);
            }
            return attendances;
        }
}
