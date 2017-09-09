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
public class Salary {
    private String Sid;
    private String Eid;
    private double Attendance_Incentive;
    private double Promotion_Incentive;
    private double Ot_Bonus;
    private double Bonus;
    private double Transport;
    private double Etf;
    private double Epf;
    private double Loan_Payment;
    private double Damage;
    private double Union_Payment;
    private double Salary_Advance;
    private double Tax;
    private double Half_DAY;
    private double No_Pay;
    private int No_of_Working_days;
    private double Total_Amount;

    public Salary() {
    }

    public Salary(String Sid, String Eid, double Attendance_Incentive, double Promotion_Incentive, double Ot_Bonus, double Bonus, double Transport, double Etf, double Epf, double Loan_Payment, double Damage, double Union_Payment, double Salary_Advance, double Tax, double Half_DAY, double No_Pay, int No_of_Working_days, double Total_Amount) {
        this.Sid = Sid;
        this.Eid = Eid;
        this.Attendance_Incentive = Attendance_Incentive;
        this.Promotion_Incentive = Promotion_Incentive;
        this.Ot_Bonus = Ot_Bonus;
        this.Bonus = Bonus;
        this.Transport = Transport;
        this.Etf = Etf;
        this.Epf = Epf;
        this.Loan_Payment = Loan_Payment;
        this.Damage = Damage;
        this.Union_Payment = Union_Payment;
        this.Salary_Advance = Salary_Advance;
        this.Tax = Tax;
        this.Half_DAY = Half_DAY;
        this.No_Pay = No_Pay;
        this.No_of_Working_days = No_of_Working_days;
        this.Total_Amount = Total_Amount;
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
     * @return the Attendance_Incentive
     */
    public double getAttendance_Incentive() {
        return Attendance_Incentive;
    }

    /**
     * @param Attendance_Incentive the Attendance_Incentive to set
     */
    public void setAttendance_Incentive(double Attendance_Incentive) {
        this.Attendance_Incentive = Attendance_Incentive;
    }

    /**
     * @return the Promotion_Incentive
     */
    public double getPromotion_Incentive() {
        return Promotion_Incentive;
    }

    /**
     * @param Promotion_Incentive the Promotion_Incentive to set
     */
    public void setPromotion_Incentive(double Promotion_Incentive) {
        this.Promotion_Incentive = Promotion_Incentive;
    }

    /**
     * @return the Ot_Bonus
     */
    public double getOt_Bonus() {
        return Ot_Bonus;
    }

    /**
     * @param Ot_Bonus the Ot_Bonus to set
     */
    public void setOt_Bonus(double Ot_Bonus) {
        this.Ot_Bonus = Ot_Bonus;
    }

    /**
     * @return the Bonus
     */
    public double getBonus() {
        return Bonus;
    }

    /**
     * @param Bonus the Bonus to set
     */
    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }

    /**
     * @return the Transport
     */
    public double getTransport() {
        return Transport;
    }

    /**
     * @param Transport the Transport to set
     */
    public void setTransport(double Transport) {
        this.Transport = Transport;
    }

    /**
     * @return the Etf
     */
    public double getEtf() {
        return Etf;
    }

    /**
     * @param Etf the Etf to set
     */
    public void setEtf(double Etf) {
        this.Etf = Etf;
    }

    /**
     * @return the Epf
     */
    public double getEpf() {
        return Epf;
    }

    /**
     * @param Epf the Epf to set
     */
    public void setEpf(double Epf) {
        this.Epf = Epf;
    }

    /**
     * @return the Loan_Payment
     */
    public double getLoan_Payment() {
        return Loan_Payment;
    }

    /**
     * @param Loan_Payment the Loan_Payment to set
     */
    public void setLoan_Payment(double Loan_Payment) {
        this.Loan_Payment = Loan_Payment;
    }

    /**
     * @return the Damage
     */
    public double getDamage() {
        return Damage;
    }

    /**
     * @param Damage the Damage to set
     */
    public void setDamage(double Damage) {
        this.Damage = Damage;
    }

    /**
     * @return the Union_Payment
     */
    public double getUnion_Payment() {
        return Union_Payment;
    }

    /**
     * @param Union_Payment the Union_Payment to set
     */
    public void setUnion_Payment(double Union_Payment) {
        this.Union_Payment = Union_Payment;
    }

    /**
     * @return the Salary_Advance
     */
    public double getSalary_Advance() {
        return Salary_Advance;
    }

    /**
     * @param Salary_Advance the Salary_Advance to set
     */
    public void setSalary_Advance(double Salary_Advance) {
        this.Salary_Advance = Salary_Advance;
    }

    /**
     * @return the Tax
     */
    public double getTax() {
        return Tax;
    }

    /**
     * @param Tax the Tax to set
     */
    public void setTax(double Tax) {
        this.Tax = Tax;
    }

    /**
     * @return the Half_DAY
     */
    public double getHalf_DAY() {
        return Half_DAY;
    }

    /**
     * @param Half_DAY the Half_DAY to set
     */
    public void setHalf_DAY(double Half_DAY) {
        this.Half_DAY = Half_DAY;
    }

    /**
     * @return the No_Pay
     */
    public double getNo_Pay() {
        return No_Pay;
    }

    /**
     * @param No_Pay the No_Pay to set
     */
    public void setNo_Pay(double No_Pay) {
        this.No_Pay = No_Pay;
    }

    /**
     * @return the No_of_Working_days
     */
    public int getNo_of_Working_days() {
        return No_of_Working_days;
    }

    /**
     * @param No_of_Working_days the No_of_Working_days to set
     */
    public void setNo_of_Working_days(int No_of_Working_days) {
        this.No_of_Working_days = No_of_Working_days;
    }

    /**
     * @return the Total_Amount
     */
    public double getTotal_Amount() {
        return Total_Amount;
    }

    /**
     * @param Total_Amount the Total_Amount to set
     */
    public void setTotal_Amount(double Total_Amount) {
        this.Total_Amount = Total_Amount;
    }
    
    
}
