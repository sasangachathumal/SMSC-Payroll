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
public class Job_role_Detail {
    private String Jrid;
    private String Eid;

    public Job_role_Detail() {
    }

    public Job_role_Detail(String Jrid, String Eid) {
        this.Jrid = Jrid;
        this.Eid = Eid;
    }

    /**
     * @return the Jrid
     */
    public String getJrid() {
        return Jrid;
    }

    /**
     * @param Jrid the Jrid to set
     */
    public void setJrid(String Jrid) {
        this.Jrid = Jrid;
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
    
    
}
