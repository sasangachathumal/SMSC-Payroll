/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.Controller.Calculeshan;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.smsc.controller1.Attendance_Contorller;
import com.smsc.controller1.Empolyee_Controller;
import com.smsc.controller1.Grade_Controller;
import com.smsc.model.Attendance;
import com.smsc.model.Employee;
import com.smsc.model.Grade;
import com.smsc.model.getattendance_byemployee_nic;

/**
 *
 * @author smsc
 */
public class Attendance_Calculation {
    public Attendance_Calculation() {
    }

    /**
     * this method mark employee morning attendance
     * @param attendanceID
     * @param emploueeNIC
     * @param Date
     * @param DateType
     * @param attend
     * @param arrivalTime
     * @return type integer
     * If Attendance Mark return 1
     * Attendance Not Mark return 0
     * If Employee Not Found return 10
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public int mark_attendance_in_morning(String attendanceID,String emploueeNIC,String Date,String DateType,String attend,String arrivalTime) throws ClassNotFoundException, SQLException{

            Employee Search_Employee_by_Nic = new Empolyee_Controller().Search_Employee_by_Nic(emploueeNIC);
            if (Search_Employee_by_Nic!=null){
                Attendance attendances = new Attendance(attendanceID, Search_Employee_by_Nic.getEid(), Date, DateType, attend, arrivalTime);
                int Add_Attendance = Attendance_Contorller.Add_Attendance(attendances);
                if (Add_Attendance > 0) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 10;
            }
    }
    
    /**
     *
     * @param employeeNIC
     * @param date
     * @return type String
     * If have Attendance ID return attendanceId
     * If Employee Not Found return No
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public String get_Attendance_ID(String employeeNIC,String date) throws ClassNotFoundException, SQLException{
        String atid = null;
            Employee Search_Employee_by_Nic = new Empolyee_Controller().Search_Employee_by_Nic(employeeNIC);
            if (Search_Employee_by_Nic != null) {
                ArrayList<getattendance_byemployee_nic> search_Attendance_by_Employeeid_AllDetail = Attendance_Contorller.search_Attendance_by_EmployeeNIC_AllDetails(employeeNIC,date);
                for(getattendance_byemployee_nic attendance: search_Attendance_by_Employeeid_AllDetail){
                    if (attendance.getDate().equals(date)) {
                        atid = attendance.getAID();
                    } else {
                        atid=null;
                    }
                }
                return atid;
            } else {
                String e="No";
                return e;
            }
    }
    /**
     * this method create employee OT Bonus
     * @param date
     * @param leaveTime
     * @param employeeNIC
     * @return type Double
     *  If Employee have OT return OT
     * Employee haven't OT return 0.0
     * If Employee Not Found return 10.0
     * If Nothing return 100.0
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public double Create_OT_Bonus(String date,String leaveTime,String employeeNIC) throws ClassNotFoundException, SQLException{
            Employee Search_Employee_by_Nic = new Empolyee_Controller().Search_Employee_by_Nic(employeeNIC);
            if (Search_Employee_by_Nic != null) {
                Grade searchGrade_byGradeid = new Grade_Controller().searchGrade_byGradeid(Search_Employee_by_Nic.getGid());
                ArrayList<getattendance_byemployee_nic> search_Attendance_by_Employeeid_AllDetail = Attendance_Contorller.search_Attendance_by_EmployeeNIC_AllDetails(employeeNIC,date);
                for(getattendance_byemployee_nic attendance: search_Attendance_by_Employeeid_AllDetail){
                    if (attendance.getDate().equals(date)&&attendance.getAttend().equals("Present")) {
                        if (attendance.getDate_type().equals("Holiday")) {
                            double arrivaltime = attendance.getArrival_time();
                            double leavetime = Double.parseDouble(leaveTime);
                            double workiningrate = Double.parseDouble(String.valueOf(searchGrade_byGradeid.getDalyworking_Rate()).split(" ")[0]);
                            double timedeferance=leavetime-arrivaltime;
                            if (timedeferance > workiningrate) {
                                double Ot=(timedeferance-workiningrate)*searchGrade_byGradeid.getWeekend_ot_Fee();
                                return Ot;
                            } else {
                                return 0.0;
                            }
                        } else {
                            double arrivaltime = attendance.getArrival_time();
                            double leavetime = Double.parseDouble(leaveTime);
                            double workiningrate = Double.parseDouble(String.valueOf(searchGrade_byGradeid.getDalyworking_Rate()).split(" ")[0]);
                            double timedeferance=leavetime-arrivaltime;
                            if (timedeferance > workiningrate) {
                                double Ot=(timedeferance-workiningrate)*searchGrade_byGradeid.getWeekday_ot_Fee();
                                return Ot;
                            } else {
                                return 0.0;
                            }
                        }
                    }
                }
            }else {
                return 10.0;
            }
        return 100.0;
    }

    /**
     * this method update one employee today attendance in evening
     * @param Atid
     * @param leaveTime
     * @param otAmount
     * @return type integer
     * If Attendance Update return 1
     * If Attendance Not Update return 0
     * If NOthing return 100
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public int update_todayAttendance_inEvening(String Atid,String leaveTime,double otAmount) throws ClassNotFoundException, SQLException{
            Attendance attendance=new Attendance(Atid,leaveTime,otAmount);
            int update_Attendance_LeaveTome_Ot = Attendance_Contorller.update_Attendance_LeaveTome_Ot(attendance);
            if (update_Attendance_LeaveTome_Ot > 0) {
                return 1;
            } else {
                return 0;
            }
    }
    
    /**
     * this method search one employee all attendance
     * @param employeeNIC
     * @param date
     * @return type ArrayList
     * If Employee have Attendance return Attendance type ArrayList
     * If Nothing return null
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public ArrayList<getattendance_byemployee_nic> search_one_employee_attendance(String employeeNIC,String date) throws ClassNotFoundException, SQLException{

            Employee Search_Employee_by_Nic = new Empolyee_Controller().Search_Employee_by_Nic(employeeNIC);
            if(Search_Employee_by_Nic != null){
                ArrayList<getattendance_byemployee_nic> search_Attendance_by_Employeeid = Attendance_Contorller.search_Attendance_by_EmployeeNIC_AllDetails(employeeNIC,date);
                return search_Attendance_by_Employeeid;
            } else {
            }
        return null;
    }
}
