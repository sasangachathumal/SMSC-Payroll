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
public class Loan {
    private String Lid;
    private String Eid;
    private String Date;
    private String Valid_Preiod;
    private double Amount;
    private String No_of_Instalments;
    private double Value_of_Instelment;
    private double Interest_Rate;
    private int if_pay;

    public Loan() {
    }

    public Loan(String Lid, String Eid, String Date, String Valid_Preiod, double Amount, String No_of_Instalments, double Value_of_Instelment, double Interest_Rate, int if_pay) {
        this.Lid = Lid;
        this.Eid = Eid;
        this.Date = Date;
        this.Valid_Preiod = Valid_Preiod;
        this.Amount = Amount;
        this.No_of_Instalments = No_of_Instalments;
        this.Value_of_Instelment = Value_of_Instelment;
        this.Interest_Rate = Interest_Rate;
        this.if_pay = if_pay;
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
     * @return the Valid_Preiod
     */
    public String getValid_Preiod() {
        return Valid_Preiod;
    }

    /**
     * @param Valid_Preiod the Valid_Preiod to set
     */
    public void setValid_Preiod(String Valid_Preiod) {
        this.Valid_Preiod = Valid_Preiod;
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
     * @return the No_of_Instalments
     */
    public String getNo_of_Instalments() {
        return No_of_Instalments;
    }

    /**
     * @param No_of_Instalments the No_of_Instalments to set
     */
    public void setNo_of_Instalments(String No_of_Instalments) {
        this.No_of_Instalments = No_of_Instalments;
    }

    /**
     * @return the Value_of_Instelment
     */
    public double getValue_of_Instelment() {
        return Value_of_Instelment;
    }

    /**
     * @param Value_of_Instelment the Value_of_Instelment to set
     */
    public void setValue_of_Instelment(double Value_of_Instelment) {
        this.Value_of_Instelment = Value_of_Instelment;
    }

    /**
     * @return the Interest_Rate
     */
    public double getInterest_Rate() {
        return Interest_Rate;
    }

    /**
     * @param Interest_Rate the Interest_Rate to set
     */
    public void setInterest_Rate(double Interest_Rate) {
        this.Interest_Rate = Interest_Rate;
    }

    /**
     * @return the if_pay
     */
    public int getIf_pay() {
        return if_pay;
    }

    /**
     * @param if_pay the if_pay to set
     */
    public void setIf_pay(int if_pay) {
        this.if_pay = if_pay;
    }
    
    
}
