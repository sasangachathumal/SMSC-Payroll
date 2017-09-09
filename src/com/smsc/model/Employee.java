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
public class Employee {
    private String Eid;
    private String Gid;
    private String Surename;
    private String Lastname;
    private String Gender;
    private String Nic_No;
    private String Address;
    private String Telephone;
    private String Date;

    public Employee() {
    }

    public Employee(String Eid, String Gid, String Surename, String Lastname, String Gender, String Nic_No, String Address, String Telephone, String Date) {
        this.Eid = Eid;
        this.Gid = Gid;
        this.Surename = Surename;
        this.Lastname = Lastname;
        this.Gender = Gender;
        this.Nic_No = Nic_No;
        this.Address = Address;
        this.Telephone = Telephone;
        this.Date = Date;
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
     * @return the Surename
     */
    public String getSurename() {
        return Surename;
    }

    /**
     * @param Surename the Surename to set
     */
    public void setSurename(String Surename) {
        this.Surename = Surename;
    }

    /**
     * @return the Lastname
     */
    public String getLastname() {
        return Lastname;
    }

    /**
     * @param Lastname the Lastname to set
     */
    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Nic_No
     */
    public String getNic_No() {
        return Nic_No;
    }

    /**
     * @param Nic_No the Nic_No to set
     */
    public void setNic_No(String Nic_No) {
        this.Nic_No = Nic_No;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Telephone
     */
    public String getTelephone() {
        return Telephone;
    }

    /**
     * @param Telephone the Telephone to set
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
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
    
    
}
