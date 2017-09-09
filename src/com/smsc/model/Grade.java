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
public class Grade {
    private String Gid;
    private String Name;
    private String Date;
    private double Basic_Salary;
    private String Dalyworking_Rate;
    private double Maxloan_Amount;
    private double Transport_Amount;
    private String Training_Preiod;
    private double Training_Fee;
    private String Nopay_Rate;
    private double Nopay_Fee;
    private String Weekend_Ot_Rate;
    private double Weekend_ot_Fee;
    private String Weekday_Ot_Rate;
    private double Weekday_ot_Fee;
    private String No_of_Leaves;
    private String No_of_Halfday_Leaves;

    public Grade() {
    }
    
    public Grade(double Maxloan_Amount,double Transport_Amount,String Weekend_Ot_Rate,double Weekend_ot_Fee,String Weekday_Ot_rate,double Weekday_ot_Fee,String No_of_Leaves,String No_of_Halfday_Leaves){
        this.Maxloan_Amount=Maxloan_Amount;
        this.Transport_Amount=Transport_Amount;
        this.Weekend_Ot_Rate=Weekend_Ot_Rate;
        this.Weekend_ot_Fee=Weekend_ot_Fee;
        this.Weekday_Ot_Rate=Weekday_Ot_rate;
        this.Weekday_ot_Fee=Weekday_ot_Fee;
        this.No_of_Leaves=No_of_Leaves;
        this.No_of_Halfday_Leaves=No_of_Halfday_Leaves;
    }

    public Grade(String Gid, String Name, String Date, double Basic_Salary, String Dalyworking_Rate, double Maxloan_Amount, double Transport_Amount, String Training_Preiod, double Training_Fee, String Nopay_Rate, double Nopay_Fee, String Weekend_Ot_Rate, double Weekend_ot_Fee, String Weekday_Ot_Rate, double Weekday_ot_Fee, String No_of_Leaves, String No_of_Halfday_Leaves) {
        this.Gid = Gid;
        this.Name = Name;
        this.Date = Date;
        this.Basic_Salary = Basic_Salary;
        this.Dalyworking_Rate = Dalyworking_Rate;
        this.Maxloan_Amount = Maxloan_Amount;
        this.Transport_Amount = Transport_Amount;
        this.Training_Preiod = Training_Preiod;
        this.Training_Fee = Training_Fee;
        this.Nopay_Rate = Nopay_Rate;
        this.Nopay_Fee = Nopay_Fee;
        this.Weekend_Ot_Rate = Weekend_Ot_Rate;
        this.Weekend_ot_Fee = Weekend_ot_Fee;
        this.Weekday_Ot_Rate = Weekday_Ot_Rate;
        this.Weekday_ot_Fee = Weekday_ot_Fee;
        this.No_of_Leaves = No_of_Leaves;
        this.No_of_Halfday_Leaves = No_of_Halfday_Leaves;
    }

    /**
     * @return the Gid
     */
    public String getGid() {
        return Gid;
    }

    /**
     * @param Gid the Gid to set
     */
    public void setGid(String Gid) {
        this.Gid = Gid;
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
     * @return the Basic_Salary
     */
    public double getBasic_Salary() {
        return Basic_Salary;
    }

    /**
     * @param Basic_Salary the Basic_Salary to set
     */
    public void setBasic_Salary(double Basic_Salary) {
        this.Basic_Salary = Basic_Salary;
    }

    /**
     * @return the Dalyworking_Rate
     */
    public String getDalyworking_Rate() {
        return Dalyworking_Rate;
    }

    /**
     * @param Dalyworking_Rate the Dalyworking_Rate to set
     */
    public void setDalyworking_Rate(String Dalyworking_Rate) {
        this.Dalyworking_Rate = Dalyworking_Rate;
    }

    /**
     * @return the Maxloan_Amount
     */
    public double getMaxloan_Amount() {
        return Maxloan_Amount;
    }

    /**
     * @param Maxloan_Amount the Maxloan_Amount to set
     */
    public void setMaxloan_Amount(double Maxloan_Amount) {
        this.Maxloan_Amount = Maxloan_Amount;
    }

    /**
     * @return the Transport_Amount
     */
    public double getTransport_Amount() {
        return Transport_Amount;
    }

    /**
     * @param Transport_Amount the Transport_Amount to set
     */
    public void setTransport_Amount(double Transport_Amount) {
        this.Transport_Amount = Transport_Amount;
    }

    /**
     * @return the Training_Preiod
     */
    public String getTraining_Preiod() {
        return Training_Preiod;
    }

    /**
     * @param Training_Preiod the Training_Preiod to set
     */
    public void setTraining_Preiod(String Training_Preiod) {
        this.Training_Preiod = Training_Preiod;
    }

    /**
     * @return the Training_Fee
     */
    public double getTraining_Fee() {
        return Training_Fee;
    }

    /**
     * @param Training_Fee the Training_Fee to set
     */
    public void setTraining_Fee(double Training_Fee) {
        this.Training_Fee = Training_Fee;
    }

    /**
     * @return the Nopay_Rate
     */
    public String getNopay_Rate() {
        return Nopay_Rate;
    }

    /**
     * @param Nopay_Rate the Nopay_Rate to set
     */
    public void setNopay_Rate(String Nopay_Rate) {
        this.Nopay_Rate = Nopay_Rate;
    }

    /**
     * @return the Nopay_Fee
     */
    public double getNopay_Fee() {
        return Nopay_Fee;
    }

    /**
     * @param Nopay_Fee the Nopay_Fee to set
     */
    public void setNopay_Fee(double Nopay_Fee) {
        this.Nopay_Fee = Nopay_Fee;
    }

    /**
     * @return the Weekend_Ot_Rate
     */
    public String getWeekend_Ot_Rate() {
        return Weekend_Ot_Rate;
    }

    /**
     * @param Weekend_Ot_Rate the Weekend_Ot_Rate to set
     */
    public void setWeekend_Ot_Rate(String Weekend_Ot_Rate) {
        this.Weekend_Ot_Rate = Weekend_Ot_Rate;
    }

    /**
     * @return the Weekend_ot_Fee
     */
    public double getWeekend_ot_Fee() {
        return Weekend_ot_Fee;
    }

    /**
     * @param Weekend_ot_Fee the Weekend_ot_Fee to set
     */
    public void setWeekend_ot_Fee(double Weekend_ot_Fee) {
        this.Weekend_ot_Fee = Weekend_ot_Fee;
    }

    /**
     * @return the Weekday_Ot_Rate
     */
    public String getWeekday_Ot_Rate() {
        return Weekday_Ot_Rate;
    }

    /**
     * @param Weekday_Ot_Rate the Weekday_Ot_Rate to set
     */
    public void setWeekday_Ot_Rate(String Weekday_Ot_Rate) {
        this.Weekday_Ot_Rate = Weekday_Ot_Rate;
    }

    /**
     * @return the Weekday_ot_Fee
     */
    public double getWeekday_ot_Fee() {
        return Weekday_ot_Fee;
    }

    /**
     * @param Weekday_ot_Fee the Weekday_ot_Fee to set
     */
    public void setWeekday_ot_Fee(double Weekday_ot_Fee) {
        this.Weekday_ot_Fee = Weekday_ot_Fee;
    }

    /**
     * @return the No_of_Leaves
     */
    public String getNo_of_Leaves() {
        return No_of_Leaves;
    }

    /**
     * @param No_of_Leaves the No_of_Leaves to set
     */
    public void setNo_of_Leaves(String No_of_Leaves) {
        this.No_of_Leaves = No_of_Leaves;
    }

    /**
     * @return the No_of_Halfday_Leaves
     */
    public String getNo_of_Halfday_Leaves() {
        return No_of_Halfday_Leaves;
    }

    /**
     * @param No_of_Halfday_Leaves the No_of_Halfday_Leaves to set
     */
    public void setNo_of_Halfday_Leaves(String No_of_Halfday_Leaves) {
        this.No_of_Halfday_Leaves = No_of_Halfday_Leaves;
    }
    
    
}
