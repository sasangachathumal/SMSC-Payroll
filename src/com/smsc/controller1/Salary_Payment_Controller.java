/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smsc.controller1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.smsc.db.DBController;
import com.smsc.model.Salary_Payment;

/**
 *
 * @author smsc
 */
public class Salary_Payment_Controller {
    public int addSalary_Pyment(Salary_Payment payment) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Salary_Payment VALUES(?,?,?,?,?,?)");
        ps.setObject(1, payment.getSpid());
        ps.setObject(2, payment.getSid());
        ps.setObject(3, payment.getDate());
        ps.setObject(4, payment.getAmount());
        ps.setObject(5, payment.getCheque_No());
        ps.setObject(6, payment.getBank_Name());
        return ps.executeUpdate();
    }
    
}
