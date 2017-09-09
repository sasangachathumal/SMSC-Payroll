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
import java.util.ArrayList;
import com.smsc.db.DBController;
import com.smsc.model.Loan_Payment;

/**
 *
 * @author smsc
 */
public class Loan_Payment_Controller {
    public int addLoan_Payment(Loan_Payment loan_Payment) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Loan_Payment VALUES(?,?,?,?,?)");
        ps.setObject(1, loan_Payment.getLid());
        ps.setObject(2, loan_Payment.getSid());
        ps.setObject(3, loan_Payment.getDate());
        ps.setObject(4, loan_Payment.getAmount());
        ps.setObject(5, loan_Payment.getPay());
        return ps.executeUpdate();
    }
    public int updateLoan_Payment(Loan_Payment loan_Payment) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Loan_Payment SET Date=?,Amount=?,pay=? WHERE Lid=?,Sid=?");
        ps.setObject(4, loan_Payment.getLid());
        ps.setObject(5, loan_Payment.getSid());
        ps.setObject(1, loan_Payment.getDate());
        ps.setObject(2, loan_Payment.getAmount());
        ps.setObject(3, loan_Payment.getPay());
        return ps.executeUpdate();
    }
    public ArrayList<Loan_Payment> searchLoan_Payment_byDate(String date) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Loan_Payment WHERE Date='"+date+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Loan_Payment> payments=new ArrayList<>();
        while(exQuery.next()){
            Loan_Payment loan_Payment=new Loan_Payment(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4),exQuery.getInt(5));
            payments.add(loan_Payment);
        }
        return payments;
    }
    public ArrayList<Loan_Payment> searchLoanPayment_byLoanid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Loan_Payment WHERE Lid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Loan_Payment> payments=new ArrayList<>();
        while(exQuery.next()){
            Loan_Payment loan_Payment=new Loan_Payment(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4),exQuery.getInt(5));
            payments.add(loan_Payment);
        }
        return payments;
    }
    public ArrayList<Loan_Payment> searchLoanPayment_bySlaryid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Loan_Payment WHERE Sid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Loan_Payment> payments=new ArrayList<>();
        while(exQuery.next()){
            Loan_Payment loan_Payment=new Loan_Payment(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4),exQuery.getInt(5));
            payments.add(loan_Payment);
        }
        return payments;
    }
}
