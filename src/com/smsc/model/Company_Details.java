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
public class Company_Details {
    private String Cid;
    private String Company_Name;
    private String Company_Address;
    private String Telephone;
    private String Fax;
    private String E_Mail;
    private String Regester_No;

    public Company_Details() {
    }

    public Company_Details(String Cid, String Company_Name, String Company_Address, String Telephone, String Fax, String E_Mail, String Regester_No) {
        this.Cid = Cid;
        this.Company_Name = Company_Name;
        this.Company_Address = Company_Address;
        this.Telephone = Telephone;
        this.Fax = Fax;
        this.E_Mail = E_Mail;
        this.Regester_No = Regester_No;
    }

    /**
     * @return the Cid
     */
    public String getCid() {
        return Cid;
    }

    /**
     * @param Cid the Cid to set
     */
    public void setCid(String Cid) {
        this.Cid = Cid;
    }

    /**
     * @return the Company_Name
     */
    public String getCompany_Name() {
        return Company_Name;
    }

    /**
     * @param Company_Name the Company_Name to set
     */
    public void setCompany_Name(String Company_Name) {
        this.Company_Name = Company_Name;
    }

    /**
     * @return the Company_Address
     */
    public String getCompany_Address() {
        return Company_Address;
    }

    /**
     * @param Company_Address the Company_Address to set
     */
    public void setCompany_Address(String Company_Address) {
        this.Company_Address = Company_Address;
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
     * @return the Fax
     */
    public String getFax() {
        return Fax;
    }

    /**
     * @param Fax the Fax to set
     */
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    /**
     * @return the E_Mail
     */
    public String getE_Mail() {
        return E_Mail;
    }

    /**
     * @param E_Mail the E_Mail to set
     */
    public void setE_Mail(String E_Mail) {
        this.E_Mail = E_Mail;
    }

    /**
     * @return the Regester_No
     */
    public String getRegester_No() {
        return Regester_No;
    }

    /**
     * @param Regester_No the Regester_No to set
     */
    public void setRegester_No(String Regester_No) {
        this.Regester_No = Regester_No;
    }
    
    
}
