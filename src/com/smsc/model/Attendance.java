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
public class Attendance {
    private String Atid;
    private String Eid;
    private String Date;
    private String Date_type;
    private String Attend;
    private String Arrival_Time;
    private String Leave_Time;
    private double Ot_Bonus;

    public Attendance() {
    }

    public Attendance(String Atid, String Eid, String Date, String Date_type, String Attend, String Arrival_Time) {
        this.Atid = Atid;
        this.Eid = Eid;
        this.Date = Date;
        this.Date_type = Date_type;
        this.Attend = Attend;
        this.Arrival_Time = Arrival_Time;
    }
    
    public Attendance(String Atid, String Leave_Time, double Ot_Bonus) {
        this.Atid=Atid;
        this.Leave_Time = Leave_Time;
        this.Ot_Bonus = Ot_Bonus;
    }
    public Attendance(String Leave_Time, double Ot_Bonus) {
        this.Leave_Time = Leave_Time;
        this.Ot_Bonus = Ot_Bonus;
    }

    public Attendance(String Atid, String Eid, String Date, String Date_type, String Attend, String Arrival_Time, String Leave_Time, double Ot_Bonus) {
        this.Atid = Atid;
        this.Eid = Eid;
        this.Date = Date;
        this.Date_type = Date_type;
        this.Attend = Attend;
        this.Arrival_Time = Arrival_Time;
        this.Leave_Time = Leave_Time;
        this.Ot_Bonus = Ot_Bonus;
    }

    /**
     * @return the Atid
     */
    public String getAtid() {
        return Atid;
    }

    /**
     * @param Atid the Atid to set
     */
    public void setAtid(String Atid) {
        this.Atid = Atid;
    }

    /**
     * @return the Eid
     */
    public String getEid() {
        return Eid;
    }

    /**
     * @param Eid the Eid to set
     */
    public void setEid(String Eid) {
        this.Eid = Eid;
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
     * @return the Arrival_Time
     */
    public String getArrival_Time() {
        return Arrival_Time;
    }

    /**
     * @param Arrival_Time the Arrival_Time to set
     */
    public void setArrival_Time(String Arrival_Time) {
        this.Arrival_Time = Arrival_Time;
    }

    /**
     * @return the Leave_Time
     */
    public String getLeave_Time() {
        return Leave_Time;
    }

    /**
     * @param Leave_Time the Leave_Time to set
     */
    public void setLeave_Time(String Leave_Time) {
        this.Leave_Time = Leave_Time;
    }

    /**
     * @return the Ot_Bonus
     */
    public double getOt_Bonus() {
        return Ot_Bonus;
    }

    /**
     * @param Ot_Bonus the Ot_Bonus to set
     */
    public void setOt_Bonus(double Ot_Bonus) {
        this.Ot_Bonus = Ot_Bonus;
    }
    
}
