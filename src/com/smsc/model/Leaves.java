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
public class Leaves {
    private String Leid;
    private String Eid;
    private String Leaves_Date;
    private String Leaves_Type;
    private double Time;

    public Leaves() {
    }

    public Leaves(String Leid, String Eid, String Leaves_Date, String Leaves_Type, double Time) {
        this.Leid = Leid;
        this.Eid = Eid;
        this.Leaves_Date = Leaves_Date;
        this.Leaves_Type = Leaves_Type;
        this.Time = Time;
    }

    /**
     * @return the Leid
     */
    public String getLeid() {
        return Leid;
    }

    /**
     * @param Leid the Leid to set
     */
    public void setLeid(String Leid) {
        this.Leid = Leid;
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
     * @return the Leaves_Date
     */
    public String getLeaves_Date() {
        return Leaves_Date;
    }

    /**
     * @param Leaves_Date the Leaves_Date to set
     */
    public void setLeaves_Date(String Leaves_Date) {
        this.Leaves_Date = Leaves_Date;
    }

    /**
     * @return the Leaves_Type
     */
    public String getLeaves_Type() {
        return Leaves_Type;
    }

    /**
     * @param Leaves_Type the Leaves_Type to set
     */
    public void setLeaves_Type(String Leaves_Type) {
        this.Leaves_Type = Leaves_Type;
    }

    /**
     * @return the Time
     */
    public double getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(double Time) {
        this.Time = Time;
    }
    
    
}
