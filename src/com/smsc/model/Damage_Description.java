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
public class Damage_Description {
    private String Ddid;
    private String Deid;
    private String Description;

    public Damage_Description() {
    }

    public Damage_Description(String Ddid, String Deid, String Description) {
        this.Ddid = Ddid;
        this.Deid = Deid;
        this.Description = Description;
    }

    

    /**
     * @return the Ddid
     */
    public String getDdid() {
        return Ddid;
    }

    /**
     * @param Ddid the Ddid to set
     */
    public void setDdid(String Ddid) {
        this.Ddid = Ddid;
    }

    /**
     * @return the Deid
     */
    public String getDeid() {
        return Deid;
    }

    /**
     * @param Deid the Deid to set
     */
    public void setDeid(String Deid) {
        this.Deid = Deid;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
