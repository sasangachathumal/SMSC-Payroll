/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smsc.controller1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.smsc.db.DBController;
import com.smsc.model.Company_Details;

/**
 *
 * @author smsc
 */
public class Company_Details_Controller {
    public int addCompany_Details(Company_Details company_Details) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Company_Details VALUES (?,?,?,?,?,?,?)");
        ps.setObject(1, company_Details.getCid());
        ps.setObject(2, company_Details.getCompany_Name());
        ps.setObject(3, company_Details.getCompany_Address());
        ps.setObject(4, company_Details.getTelephone());
        ps.setObject(5, company_Details.getFax());
        ps.setObject(6, company_Details.getE_Mail());
        ps.setObject(7, company_Details.getRegester_No());
        return ps.executeUpdate();
    }
    public Company_Details searchCompany_Details() throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Company_Details";
        Connection connection = DBController.createConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet exQuery = stm.executeQuery(sql);
        if (exQuery.next()) {
            return new Company_Details(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getString(4), exQuery.getString(5), exQuery.getString(6), exQuery.getString(7));
        } else {
            return null;
        }
    }
    public int updateCompany_Details(Company_Details company_Details) throws ClassNotFoundException, SQLException{
         Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Company_Details SET Company_Name=?,Company_Address=?,Telephone=?,Fax=?,E-Mail=?,Regester_No=? WHERE Cid=?");
        ps.setObject(1, company_Details.getCompany_Name());
        ps.setObject(2, company_Details.getCompany_Address());
        ps.setObject(3, company_Details.getTelephone());
        ps.setObject(4, company_Details.getFax());
        ps.setObject(5, company_Details.getE_Mail());
        ps.setObject(6, company_Details.getRegester_No());
        ps.setObject(7, company_Details.getCid());
        return ps.executeUpdate();
    }
    public int deleteCompany_Details() throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE FROM Company_Details");
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
}
