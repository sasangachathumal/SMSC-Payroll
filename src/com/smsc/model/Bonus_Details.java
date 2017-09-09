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
public class Bonus_Details {
    private String Bid;
    private String Eid;

    public Bonus_Details() {
    }

    public Bonus_Details(String Bid, String Eid) {
        this.Bid = Bid;
        this.Eid = Eid;
    }

    /**
     * @return the Bid
     */
    public String getBid() {
        return Bid;
    }

    /**
     * @param Bid the Bid to set
     */
    public void setBid(String Bid) {
        this.Bid = Bid;
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
