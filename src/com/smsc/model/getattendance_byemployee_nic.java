/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.model;

/**
 *
 * @author smsc
 */
public class getattendance_byemployee_nic {
    private String Employee_Name;
    private String AID;
    private String EID;
    private String Date;
    private String Date_type;
    private String Attend;
    private double Arrival_time;
    private double Leave_time;
    private double OT_bonus;

    public getattendance_byemployee_nic() {
    }

    public getattendance_byemployee_nic(String Employee_Name, String AID, String EID, String Date, String Date_type, String Attend, double Arrival_time, double Leave_time, double OT_bonus) {
        this.Employee_Name = Employee_Name;
        this.AID = AID;
        this.EID = EID;
        this.Date = Date;
        this.Date_type = Date_type;
        this.Attend = Attend;
        this.Arrival_time = Arrival_time;
        this.Leave_time = Leave_time;
        this.OT_bonus = OT_bonus;
    }

    /**
     * @return the Employee_Name
     */
    public String getEmployee_Name() {
        return Employee_Name;
    }

    /**
     * @param Employee_Name the Employee_Name to set
     */
    public void setEmployee_Name(String Employee_Name) {
        this.Employee_Name = Employee_Name;
    }

    /**
     * @return the AID
     */
    public String getAID() {
        return AID;
    }

    /**
     * @param AID the AID to set
     */
    public void setAID(String AID) {
        this.AID = AID;
    }

    /**
     * @return the EID
     */
    public String getEID() {
        return EID;
    }

    /**
     * @param EID the EID to set
     */
    public void setEID(String EID) {
        this.EID = EID;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the Date_type
     */
    public String getDate_type() {
        return Date_type;
    }

    /**
     * @param Date_type the Date_type to set
     */
    public void setDate_type(String Date_type) {
        this.Date_type = Date_type;
    }

    /**
     * @return the Attend
     */
    public String getAttend() {
        return Attend;
    }

    /**
     * @param Attend the Attend to set
     */
    public void setAttend(String Attend) {
        this.Attend = Attend;
    }

    /**
     * @return the Arrival_time
     */
    public double getArrival_time() {
        return Arrival_time;
    }

    /**
     * @param Arrival_time the Arrival_time to set
     */
    public void setArrival_time(double Arrival_time) {
        this.Arrival_time = Arrival_time;
    }

    /**
     * @return the Leave_time
     */
    public double getLeave_time() {
        return Leave_time;
    }

    /**
     * @param Leave_time the Leave_time to set
     */
    public void setLeave_time(double Leave_time) {
        this.Leave_time = Leave_time;
    }

    /**
     * @return the OT_bonus
     */
    public double getOT_bonus() {
        return OT_bonus;
    }

    /**
     * @param OT_bonus the OT_bonus to set
     */
    public void setOT_bonus(double OT_bonus) {
        this.OT_bonus = OT_bonus;
    }
    
}
