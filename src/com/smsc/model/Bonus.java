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
public class Bonus {
    private String Bid;
    private String Name;
    private String Type;
    private String Valid_preiod;
    private double Amount;

    public Bonus() {
    }

    public Bonus(String Bid, String Name, String Type, String Valid_preiod, double Amount) {
        this.Bid = Bid;
        this.Name = Name;
        this.Type = Type;
        this.Valid_preiod = Valid_preiod;
        this.Amount = Amount;
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
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @return the Valid_preiod
     */
    public String getValid_preiod() {
        return Valid_preiod;
    }

    /**
     * @param Valid_preiod the Valid_preiod to set
     */
    public void setValid_preiod(String Valid_preiod) {
        this.Valid_preiod = Valid_preiod;
    }

    /**
     * @return the Amount
     */
    public double getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
    
    
}
