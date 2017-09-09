/*
 * To change this template, choose Tools | Templates
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
import com.smsc.model.Advance_Salary;

/**
 *
 * @author linux
 */
public class Advance_Salary_Contorller {
    public int Add_Advance(Advance_Salary advance_Salary) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Advance_Salary VALUES(?,?,?,?)");
        ps.setObject(1, advance_Salary.getAsid());
        ps.setObject(2, advance_Salary.getEid());
        ps.setObject(3, advance_Salary.getPay_Date());
        ps.setObject(4, advance_Salary.getAdvance());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    public Advance_Salary search_Advance_by_id(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Advance_Salary WHERE Asid=?");
        ps.setObject(1, id);
        ResultSet exQuery = ps.executeQuery();
        if (exQuery.next()) {
            return new Advance_Salary(exQuery.getString("Asis"), exQuery.getString("Eid"), exQuery.getString("Pay_Date"), exQuery.getDouble("Advance"));
        } else {
            return null;
        }
    }
    public Advance_Salary search_Advance_by_Date(String date) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Advance_Salary WHERE Pay_Date=?");
        ps.setObject(1, date);
        ResultSet exQuery = ps.executeQuery();
        if (exQuery.next()) {
            return new Advance_Salary(exQuery.getString("Asis"), exQuery.getString("Eid"), exQuery.getString("Pay_Date"), exQuery.getDouble("Advance"));
        } else {
            return null;
        }
    }
    public Advance_Salary search_Last_Advance(String id,String date) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Advance_Salary WHERE Eid=? and Pay_Date like '"+date+"%' order by 2 desc limit 1");
        ps.setObject(1, id);
        ResultSet exQuery = ps.executeQuery();
        if (exQuery.next()) {
            return new Advance_Salary(exQuery.getString(1), exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4));
        } else {
            return null;
        }
    }
    public ArrayList<Advance_Salary> search_Advance_Salary_by_Employeeid(String employeeid) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Advance_Salary WHERE Eid='"+employeeid+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement createStatement = connection.createStatement();
        ResultSet exQuery = createStatement.executeQuery(sql);
        ArrayList<Advance_Salary> advance_Salarys=new ArrayList<>();
        if(exQuery.next()){
            Advance_Salary advance_Salary=new Advance_Salary(exQuery.getString("Asid"),exQuery.getString("Eid"),exQuery.getString("Pay_Date"), exQuery.getDouble("Advance"));
            advance_Salarys.add(advance_Salary);
        }
        return advance_Salarys;
    }
    public int delete_Advance_Salary(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement prepareStatement = connection.prepareStatement("DELETE FROM Advance_Salary WHERE Asid=?");
        prepareStatement.setObject(1, id);
        int executeUpdate = prepareStatement.executeUpdate();
        return executeUpdate;
    }
    public int update_Advance_Salary(Advance_Salary advance_Salary) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement prepareStatement = connection.prepareStatement("UPDATE Advance_Salary SET Eid=?,Pay_Date=?,Advance=? WHERE Asid=?");
        prepareStatement.setObject(4, advance_Salary.getAsid());
        prepareStatement.setObject(1, advance_Salary.getEid());
        prepareStatement.setObject(2, advance_Salary.getPay_Date());
        prepareStatement.setObject(3, advance_Salary.getAdvance());
        int executeUpdate = prepareStatement.executeUpdate();
        return executeUpdate;
    }
     public ArrayList<Advance_Salary> get_All_Advance_Salary() throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Advance_Salary";
        Connection connection = DBController.createConnection().getConnection();
        Statement createStatement = connection.createStatement();
        ResultSet exQuery = createStatement.executeQuery(sql);
        ArrayList<Advance_Salary> advance_Salarys=new ArrayList<>();
        if(exQuery.next()){
            Advance_Salary advance_Salary=new Advance_Salary(exQuery.getString("Asid"),exQuery.getString("Eid"),exQuery.getString("Pay_Date"), exQuery.getDouble("Advance"));
            advance_Salarys.add(advance_Salary);
        }
        return advance_Salarys;
    }
}
