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
public class HalfDay {
    private String Hid;
    private String Eid;
    private String Date;
    private double Today_ArrivalTime;
    private double Halfday_LeaveTime;

    public HalfDay() {
    }
    
    public HalfDay(String Date,double Halfday_LeaveTime){
        this.Date = Date;
        this.Halfday_LeaveTime = Halfday_LeaveTime;
    }

    public HalfDay(String Hid, String Eid, String Date, double Today_ArrivalTime, double Halfday_LeaveTime) {
        this.Hid = Hid;
        this.Eid = Eid;
        this.Date = Date;
        this.Today_ArrivalTime = Today_ArrivalTime;
        this.Halfday_LeaveTime = Halfday_LeaveTime;
    }

    /**
     * @return the Hid
     */
    public String getHid() {
        return Hid;
    }

    /**
     * @param Hid the Hid to set
     */
    public void setHid(String Hid) {
        this.Hid = Hid;
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
     * @return the Today_ArrivalTime
     */
    public double getToday_ArrivalTime() {
        return Today_ArrivalTime;
    }

    /**
     * @param Today_ArrivalTime the Today_ArrivalTime to set
     */
    public void setToday_ArrivalTime(double Today_ArrivalTime) {
        this.Today_ArrivalTime = Today_ArrivalTime;
    }

    /**
     * @return the Halfday_LeaveTime
     */
    public double getHalfday_LeaveTime() {
        return Halfday_LeaveTime;
    }

    /**
     * @param Halfday_LeaveTime the Halfday_LeaveTime to set
     */
    public void setHalfday_LeaveTime(double Halfday_LeaveTime) {
        this.Halfday_LeaveTime = Halfday_LeaveTime;
    }
    
    
}
