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
public class Union_Detail {
    private String Uid;
    private String Eid;

    public Union_Detail() {
    }

    public Union_Detail(String Uid, String Eid) {
        this.Uid = Uid;
        this.Eid = Eid;
    }

    /**
     * @return the Uid
     */
    public String getUid() {
        return Uid;
    }

    /**
     * @param Uid the Uid to set
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
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
