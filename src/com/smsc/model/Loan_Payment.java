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
public class Loan_Payment {
    private String Lid;
    private String Sid;
    private String Date;
    private double Amount;
    private int pay;

    public Loan_Payment() {
    }

    public Loan_Payment(String Lid, String Sid, String Date, double Amount, int pay) {
        this.Lid = Lid;
        this.Sid = Sid;
        this.Date = Date;
        this.Amount = Amount;
        this.pay = pay;
    }

    /**
     * @return the Lid
     */
    public String getLid() {
        return Lid;
    }

    /**
     * @param Lid the Lid to set
     */
    public void setLid(String Lid) {
        this.Lid = Lid;
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
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
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

    /**
     * @return the pay
     */
    public int getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(int pay) {
        this.pay = pay;
    }
    
    
}
