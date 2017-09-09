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
public class Employee_Expetion_Details {
    private String Sid;
    private String EEid;

    public Employee_Expetion_Details() {
    }

    public Employee_Expetion_Details(String Sid, String EEid) {
        this.Sid = Sid;
        this.EEid = EEid;
    }

    /**
     * @return the Sid
     */
    public String getSid() {
        return Sid;
    }

    /**
     * @param Sid the Sid to set
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * @return the EEid
     */
    public String getEEid() {
        return EEid;
    }

    /**
     * @param EEid the EEid to set
     */
    public void setEEid(String EEid) {
        this.EEid = EEid;
    }
    
    
}
