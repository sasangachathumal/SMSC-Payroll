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
import com.smsc.model.Loan;

/**
 *
 * @author smsc
 */
public class Loan_Controller {
    public int addLoan(Loan loan) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Loan VALUES(?,?,?,?,?,?,?,?,?)");
        ps.setObject(1, loan.getLid());
        ps.setObject(2, loan.getEid());
        ps.setObject(3, loan.getDate());
        ps.setObject(4, loan.getAmount());
        ps.setObject(5, loan.getValid_Preiod());
        ps.setObject(6, loan.getNo_of_Instalments());
        ps.setObject(7, loan.getValue_of_Instelment());
        ps.setObject(8, loan.getInterest_Rate());
        ps.setObject(9, loan.getIf_pay());
        return ps.executeUpdate();
    }
    public int updateLoan(Loan loan) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Loan SET Eid=?,Date=?,Valid_Preiod=?,Amount=?,No_of_Instalments=?,Value_of_Instelment=?,Interest_Rate=?,If_Pay=? WHERE Lid=?");
        ps.setObject(9, loan.getLid());
        ps.setObject(1, loan.getEid());
        ps.setObject(2, loan.getDate());
        ps.setObject(3, loan.getValid_Preiod());
        ps.setObject(4, loan.getAmount());
        ps.setObject(5, loan.getNo_of_Instalments());
        ps.setObject(6, loan.getValue_of_Instelment());
        ps.setObject(7, loan.getInterest_Rate());
        ps.setObject(8, loan.getIf_pay());
        return ps.executeUpdate();
    }
    public int deleteLoan(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE FROM Loan WHERE Lid=?");
        ps.setObject(1, id);
        return ps.executeUpdate();
    }
    public Loan searchLoans_byloanid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Loan WHERE Lid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Loan(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getString(5), exQuery.getDouble(4), exQuery.getString(6), exQuery.getDouble(7), exQuery.getDouble(8),exQuery.getInt(9));
        } else {
            return null;
        }
    }
    public ArrayList<Loan> searchLoans_byemployeeid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Loan WHERE Eid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Loan> loans=new ArrayList<>();
        while(exQuery.next()){
            Loan loan=new Loan(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getString(5), exQuery.getDouble(4), exQuery.getString(6), exQuery.getDouble(7), exQuery.getDouble(8),exQuery.getInt(9));
            loans.add(loan);
        }
        return loans;
    }
     public ArrayList<Loan> searchLoans_bydate(String date) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Loan WHERE Date='"+date+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Loan> loans=new ArrayList<>();
        while(exQuery.next()){
            Loan loan=new Loan(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getString(5), exQuery.getDouble(4), exQuery.getString(6), exQuery.getDouble(7), exQuery.getDouble(8),exQuery.getInt(9));
            loans.add(loan);
        }
        return loans;
    }
     public ArrayList<Loan> searchLoans_byValid_Preiod(String preiod) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Loan WHERE Valid_Preiod='"+preiod+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Loan> loans=new ArrayList<>();
        while(exQuery.next()){
            Loan loan=new Loan(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getString(5), exQuery.getDouble(4), exQuery.getString(6), exQuery.getDouble(7), exQuery.getDouble(8),exQuery.getInt(9));
            loans.add(loan);
        }
        return loans;
    }
    public ArrayList<Loan> searchLoans_byAmount(String amount) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Loan WHERE Amount='"+amount+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Loan> loans=new ArrayList<>();
        while(exQuery.next()){
            Loan loan=new Loan(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getString(5), exQuery.getDouble(4), exQuery.getString(6), exQuery.getDouble(7), exQuery.getDouble(8),exQuery.getInt(9));
            loans.add(loan);
        }
        return loans;
    }
    public ArrayList<Loan> searchLoans_byNo_of_Instalments(String count) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Loan WHERE No_of_Instalments='"+count+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Loan> loans=new ArrayList<>();
        while(exQuery.next()){
            Loan loan=new Loan(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getString(5), exQuery.getDouble(4), exQuery.getString(6), exQuery.getDouble(7), exQuery.getDouble(8),exQuery.getInt(9));
            loans.add(loan);
        }
        return loans;
    }
    public ArrayList<Loan> searchLoans_byValue_of_Instelment(String value) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Loan WHERE Value_of_Instelment='"+value+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Loan> loans=new ArrayList<>();
        while(exQuery.next()){
            Loan loan=new Loan(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getString(5), exQuery.getDouble(4), exQuery.getString(6), exQuery.getDouble(7), exQuery.getDouble(8),exQuery.getInt(9));
            loans.add(loan);
        }
        return loans;
    }
    public ArrayList<Loan> searchLoans_byInterest_Rate(String rate) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Loan WHERE Interest_Rate='"+rate+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Loan> loans=new ArrayList<>();
        while(exQuery.next()){
            Loan loan=new Loan(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getString(5), exQuery.getDouble(4), exQuery.getString(6), exQuery.getDouble(7), exQuery.getDouble(8),exQuery.getInt(9));
            loans.add(loan);
        }
        return loans;
    }

    public ArrayList<Loan> GetAllLoans() throws ClassNotFoundException, SQLException {
        String sql="SELECT * FROM Loan ";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Loan> loans=new ArrayList<>();
        while(exQuery.next()){
            Loan loan=new Loan(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getString(5), exQuery.getDouble(4), exQuery.getString(6), exQuery.getDouble(7), exQuery.getDouble(8),exQuery.getInt(9));
            loans.add(loan);
        }
        return loans;
    }
}
