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
public class Damage {
    private String Daid;
    private String Eid;
    private String Damage_Date;
    private int Lost;

    public Damage() {
    }

    public Damage(String Daid, String Eid, String Damage_Date, int Lost) {
        this.Daid = Daid;
        this.Eid = Eid;
        this.Damage_Date = Damage_Date;
        this.Lost = Lost;
    }

    /**
     * @return the Daid
     */
    public String getDaid() {
        return Daid;
    }

    /**
     * @param Daid the Daid to set
     */
    public void setDaid(String Daid) {
        this.Daid = Daid;
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
     * @return the Damage_Date
     */
    public String getDamage_Date() {
        return Damage_Date;
    }

    /**
     * @param Damage_Date the Damage_Date to set
     */
    public void setDamage_Date(String Damage_Date) {
        this.Damage_Date = Damage_Date;
    }

    /**
     * @return the Lost
     */
    public int getLost() {
        return Lost;
    }

    /**
     * @param Lost the Lost to set
     */
    public void setLost(int Lost) {
        this.Lost = Lost;
    }
    
    
}
