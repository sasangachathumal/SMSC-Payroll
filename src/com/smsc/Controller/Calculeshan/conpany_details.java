/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.Controller.Calculeshan;

import java.sql.SQLException;
import com.smsc.controller1.Company_Details_Controller;

/**
 *
 * @author smsc
 */
public class conpany_details {
    
    /**
     *
     * @param id
     * @param name
     * @param address
     * @param telephone
     * @param fax
     * @param email
     * @param registerNo
     * @return type integer
     * if company details add return 1
     * if company details add fail return 0
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int Input_Company_Details(String id,String name,String address,String telephone,String fax,String email,String registerNo) throws ClassNotFoundException, SQLException{
        Company_Details_Controller company_Details_Controller=new Company_Details_Controller();
            com.smsc.model.Company_Details company_Details=new com.smsc.model.Company_Details(id, name, address, telephone, fax, email, registerNo);
            int addCompany_Details = company_Details_Controller.addCompany_Details(company_Details);
            if (addCompany_Details > 0) {
                return 1;
            } else {
                return 0;
            }
    }
}
