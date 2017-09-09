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
public class Employee_Expetions {
    private String EEid;
    private double EPFEmployee;
    private double EPFCompany;
    private double ETF;
    private double Attendance_Incentive;
    private double Promotion_Incentive;
    private String Add_Date;
    private String Update_Date;

    public Employee_Expetions() {
    }

    /**
     * To Add Basic Employee Viyadam.
     * @param EEid
     * @param EPFEmployee
     * @param EPFCompany
     * @param ETF
     * @param Attendance_Incentive
     * @param Promotion_Incentive
     * @param Add_Date
     * @param Update_Date
     */
    public Employee_Expetions(String EEid, double EPFEmployee, double EPFCompany, double ETF, double Attendance_Incentive, double Promotion_Incentive, String Add_Date, String Update_Date) {
        this.EEid = EEid;
        this.EPFEmployee = EPFEmployee;
        this.EPFCompany = EPFCompany;
        this.ETF = ETF;
        this.Attendance_Incentive = Attendance_Incentive;
        this.Promotion_Incentive = Promotion_Incentive;
        this.Add_Date = Add_Date;
        this.Update_Date = Update_Date;
    }

    /**
     * @return the EEid
     */
    public String getEEid() {
        return EEid;
    }

    /**
     * @param EEid the EEid to set
     */
    public void setEEid(String EEid) {
        this.EEid = EEid;
    }

    /**
     * @return the EPFEmployee
     */
    public double getEPFEmployee() {
        return EPFEmployee;
    }

    /**
     * @param EPFEmployee the EPFEmployee to set
     */
    public void setEPFEmployee(double EPFEmployee) {
        this.EPFEmployee = EPFEmployee;
    }

    /**
     * @return the EPFCompany
     */
    public double getEPFCompany() {
        return EPFCompany;
    }

    /**
     * @param EPFCompany the EPFCompany to set
     */
    public void setEPFCompany(double EPFCompany) {
        this.EPFCompany = EPFCompany;
    }

    /**
     * @return the ETF
     */
    public double getETF() {
        return ETF;
    }

    /**
     * @param ETF the ETF to set
     */
    public void setETF(double ETF) {
        this.ETF = ETF;
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
     * @return the Add_Date
     */
    public String getAdd_Date() {
        return Add_Date;
    }

    /**
     * @param Add_Date the Add_Date to set
     */
    public void setAdd_Date(String Add_Date) {
        this.Add_Date = Add_Date;
    }

    /**
     * @return the Update_Date
     */
    public String getUpdate_Date() {
        return Update_Date;
    }

    /**
     * @param Update_Date the Update_Date to set
     */
    public void setUpdate_Date(String Update_Date) {
        this.Update_Date = Update_Date;
    }
    
    
}
