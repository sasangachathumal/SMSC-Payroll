/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.other;

import javax.swing.JPasswordField;

/**
 *
 * @author linux
 */
public class Unlock {
    private String password;
    
   public void getpassword(String pass){
     this.password=pass;
   }
    public boolean checkpassword(String pass){
        if (password.equals(pass)) {
            return true;
        } else {
            return false;
        }
    }
}
