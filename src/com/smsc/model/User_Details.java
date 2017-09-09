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
public class User_Details {
    private String Lid;
    private String User_Name;
    private String Password;
    private String Code;
    private String Answer;

    public User_Details() {
    }
    
    public User_Details(String name){
        this.User_Name=name;
    }
    
    public User_Details(String Lid, String User_Name, String Password, String Code, String Answer) {
        this.Lid = Lid;
        this.User_Name = User_Name;
        this.Password = Password;
        this.Code = Code;
        this.Answer = Answer;
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
     * @return the User_Name
     */
    public String getUser_Name() {
        return User_Name;
    }

    /**
     * @param User_Name the User_Name to set
     */
    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Code
     */
    public String getCode() {
        return Code;
    }

    /**
     * @param Code the Code to set
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * @return the Answer
     */
    public String getAnswer() {
        return Answer;
    }

    /**
     * @param Answer the Answer to set
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }
    
    
}
