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
public class Advance_Salary {
    private String Asid;
    private String Eid;
    private String Pay_Date;
    private double Advance;

    public Advance_Salary() {
    }

    public Advance_Salary(String Asid, String Eid, String Pay_Date, double Advance) {
        this.Asid = Asid;
        this.Eid = Eid;
        this.Pay_Date = Pay_Date;
        this.Advance = Advance;
    }

    /**
     * @return the Asid
     */
    public String getAsid() {
        return Asid;
    }

    /**
     * @param Asid the Asid to set
     */
    public void setAsid(String Asid) {
        this.Asid = Asid;
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
     * @return the Pay_Date
     */
    public String getPay_Date() {
        return Pay_Date;
    }

    /**
     * @param Pay_Date the Pay_Date to set
     */
    public void setPay_Date(String Pay_Date) {
        this.Pay_Date = Pay_Date;
    }

    /**
     * @return the Advance
     */
    public double getAdvance() {
        return Advance;
    }

    /**
     * @param Advance the Advance to set
     */
    public void setAdvance(double Advance) {
        this.Advance = Advance;
    }
    
    
}
