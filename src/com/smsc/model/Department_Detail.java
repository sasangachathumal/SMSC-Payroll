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
public class Department_Detail {
    private String Did;
    private String Eid;

    public Department_Detail() {
    }

    public Department_Detail(String Did, String Eid) {
        this.Did = Did;
        this.Eid = Eid;
    }

    /**
     * @return the Did
     */
    public String getDid() {
        return Did;
    }

    /**
     * @param Did the Did to set
     */
    public void setDid(String Did) {
        this.Did = Did;
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
