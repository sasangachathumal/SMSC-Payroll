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
public class Department {
    private String Did;
    private String Name;
    private String Building;

    public Department() {
    }

    public Department(String Did, String Name, String Building) {
        this.Did = Did;
        this.Name = Name;
        this.Building = Building;
    }

    /**
     * @return the Did
     */
    public String getDid() {
        return Did;
    }

    /**
     * @param Did the Did to set
     */
    public void setDid(String Did) {
        this.Did = Did;
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
     * @return the Building
     */
    public String getBuilding() {
        return Building;
    }

    /**
     * @param Building the Building to set
     */
    public void setBuilding(String Building) {
        this.Building = Building;
    }
    
    
}
