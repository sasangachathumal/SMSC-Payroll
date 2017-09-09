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
public class Job_Role {
    private String Jrid;
    private String Name;
    private String Pension_Age;

    public Job_Role() {
    }

    public Job_Role(String Jrid, String Name, String Pension_Age) {
        this.Jrid = Jrid;
        this.Name = Name;
        this.Pension_Age = Pension_Age;
    }

    /**
     * @return the Jrid
     */
    public String getJrid() {
        return Jrid;
    }

    /**
     * @param Jrid the Jrid to set
     */
    public void setJrid(String Jrid) {
        this.Jrid = Jrid;
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
     * @return the Pension_Age
     */
    public String getPension_Age() {
        return Pension_Age;
    }

    /**
     * @param Pension_Age the Pension_Age to set
     */
    public void setPension_Age(String Pension_Age) {
        this.Pension_Age = Pension_Age;
    }
    
    
}
