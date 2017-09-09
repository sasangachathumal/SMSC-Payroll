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
public class Salary_Payment {
    private String Spid;
    private String Sid;
    private String Date;
    private double Amount;
    private String Cheque_No;
    private String Bank_Name;

    public Salary_Payment() {
    }

    public Salary_Payment(String Spid, String Sid, String Date, double Amount, String Cheque_No, String Bank_Name) {
        this.Spid = Spid;
        this.Sid = Sid;
        this.Date = Date;
        this.Amount = Amount;
        this.Cheque_No = Cheque_No;
        this.Bank_Name = Bank_Name;
    }

    /**
     * @return the Spid
     */
    public String getSpid() {
        return Spid;
    }

    /**
     * @param Spid the Spid to set
     */
    public void setSpid(String Spid) {
        this.Spid = Spid;
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
     * @return the Cheque_No
     */
    public String getCheque_No() {
        return Cheque_No;
    }

    /**
     * @param Cheque_No the Cheque_No to set
     */
    public void setCheque_No(String Cheque_No) {
        this.Cheque_No = Cheque_No;
    }

    /**
     * @return the Bank_Name
     */
    public String getBank_Name() {
        return Bank_Name;
    }

    /**
     * @param Bank_Name the Bank_Name to set
     */
    public void setBank_Name(String Bank_Name) {
        this.Bank_Name = Bank_Name;
    }
    
        
}
