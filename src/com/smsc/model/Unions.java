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
public class Unions {
    private String Uid;
    private String Name;
    private String OpenDate;
    private double MSFee;
    private String Register_No;

    public Unions() {
    }

    public Unions(String Uid, String Name, String OpenDate, double MSFee, String Register_No) {
        this.Uid = Uid;
        this.Name = Name;
        this.OpenDate = OpenDate;
        this.MSFee = MSFee;
        this.Register_No = Register_No;
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
     * @return the OpenDate
     */
    public String getOpenDate() {
        return OpenDate;
    }

    /**
     * @param OpenDate the OpenDate to set
     */
    public void setOpenDate(String OpenDate) {
        this.OpenDate = OpenDate;
    }

    /**
     * @return the MSFee
     */
    public double getMSFee() {
        return MSFee;
    }

    /**
     * @param MSFee the MSFee to set
     */
    public void setMSFee(double MSFee) {
        this.MSFee = MSFee;
    }

    /**
     * @return the Register_No
     */
    public String getRegister_No() {
        return Register_No;
    }

    /**
     * @param Register_No the Register_No to set
     */
    public void setRegister_No(String Register_No) {
        this.Register_No = Register_No;
    }
    
    
}
