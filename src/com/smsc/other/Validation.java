/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.other;

import javax.swing.JTextField;
import org.jdesktop.swingx.JXSearchField;

/**
 *
 * @author smsc
 */
public class Validation {
    public static void validateNIC(JTextField field) {
        String text = field.getText();
        boolean matches = text.matches("[\\d]{0,9}");
        if (! matches) {
            field.setText(text.substring(0, text.length() - 1));
        }
        boolean matches1 = text.matches("[\\d]{9}");
        if (matches1) {
            field.setText(field.getText() + "V");
        }
    }
    public static void validateNIC(JXSearchField field) {
        String text = field.getText();
        boolean matches = text.matches("[\\d]{0,9}");
        if (! matches) {
            field.setText(text.substring(0, text.length() - 1));
        }
        boolean matches1 = text.matches("[\\d]{9}");
        if (matches1) {
            field.setText(field.getText() + "V");
        }
    }
    public static void validateTime(JTextField field){
        String text=field.getText();
        boolean matches=text.matches("[0-2]{0,2}");
        if (! matches) {
            field.setText(text.substring(0,text.length()));
        }
        boolean matches1=text.matches("[0-2]{1}[0-9]{1}");
        if (matches1) {
            field.setText(field.getText()+":");
        }
        boolean match=text.matches("[0-2]{1}[0-9]{1}[:]{1}[0-6]{1}[0-9]{1}");
        if (match) {
            field.setText(field.getText()+":");
        }
        boolean match1=text.matches("[0-2]{1}[0-9]{1}[:]{1}[0-6]{1}[0-9]{1}[:]{1}[0-6]{1}[0-9]{1}");
        if (match1) {
            field.setText(field.getText()+":");
        }
    }
    public static void validateTelephone(JTextField field){
        String tex=field.getText();
        boolean match=tex.matches("[0-9]{0,3}");
        if (! match ) {
            field.setText(tex.substring(0,tex.length()));
        }
        boolean match1=tex.matches("[0-9]{3}");
        if (match1) {
            field.setText(field.getText()+"-");
        }
        boolean match2=tex.matches("[0-9]{3}[-]{1}[0-9]{7}");
        if (match2) {
            field.setText(field.getText());
        }
    }
    public static void validateDate(JTextField field){
        String text=field.getText();
        boolean match=text.matches("[2]{0,1}[0-9]{0,1}[0-9]{0,1}[0-9]{0,1}");
        if (! match) {
            field.setText(text.substring(0,text.length()));
        }
        boolean match1=text.matches("[2]{1}[0-9]{1}[0-9]{1}[0-9]{1}");
        if (match1) {
            field.setText(field.getText()+"-");
        }
        boolean match2=text.matches("[2]{1}[0-9]{1}[0-9]{1}[0-9]{1}[-]{1}[0-1]{1}[1-9]{1}");
        if (match2) {
            field.setText(field.getText()+"-");
        }
        boolean match3=text.matches("[2]{1}[0-9]{1}[0-9]{1}[0-9]{1}[-]{1}[0-1]{1}[1-9]{1}[-]{1}[0-3]{1}[1-9]{1}");
        if (match3) {
            field.setText(field.getText());
        }
    }
    public static void validatenumber(JTextField field){
        String text=field.getText();
        boolean matches = text.matches("[\\d]*[.]{0,1}");
        if (! matches) {
            String replaceAll = text.replaceAll("[a-zA-Z]", "");
            field.setText(replaceAll);
        }
    }
}
