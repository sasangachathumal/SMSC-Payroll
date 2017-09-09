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
import com.smsc.model.Bonus;

/**
 *
 * @author smsc
 */
public class Bonus_Controller {
    
    public int addbonus(Bonus bonus) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Bonus VALUES (?,?,?,?,?)");
        ps.setObject(1, bonus.getBid());
        ps.setObject(2, bonus.getName());
        ps.setObject(3, bonus.getType());
        ps.setObject(4, bonus.getValid_preiod());
        ps.setObject(5, bonus.getAmount());
        return ps.executeUpdate();
    }
    public Bonus searchbonus_bybonusid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Bonus WHERE Bid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet exQuery = stm.executeQuery(sql);
        if (exQuery.next()) {
            return new Bonus(exQuery.getString(1), exQuery.getString(2),exQuery.getString(3),exQuery.getString(4),exQuery.getDouble(5));
        } else {
            return null;
        }
    }
    public Bonus searchbonus_bybonusname(String name) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Bonus WHERE Name='"+name+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet exQuery = stm.executeQuery(sql);
        if (exQuery.next()) {
            return new Bonus(exQuery.getString(1), exQuery.getString(2),exQuery.getString(3),exQuery.getString(4),exQuery.getDouble(5));
        } else {
            return null;
        }
    }
    public ArrayList<Bonus> searchbonus_bybonusvalidpreiod(String preiod) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Bonus WHERE Valid_preiod='"+preiod+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement st = connection.createStatement();
        ResultSet exQuery = st.executeQuery(sql);
        ArrayList<Bonus> bonuses=new ArrayList<>();
        while(exQuery.next()){
            Bonus bonus=new Bonus(exQuery.getString(1), exQuery.getString(2),exQuery.getString(3),exQuery.getString(4),exQuery.getDouble(5));
            bonuses.add(bonus);
        }
        return bonuses;
    }
    public ArrayList<Bonus> getallBonus() throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Bonus";
        Connection connection = DBController.createConnection().getConnection();
        Statement ct = connection.createStatement();
        ResultSet exQuery = ct.executeQuery(sql);
        ArrayList<Bonus> bonuses=new ArrayList<>();
        while(exQuery.next()){
            Bonus bonus=new Bonus(exQuery.getString(1), exQuery.getString(2),exQuery.getString(3),exQuery.getString(4),exQuery.getDouble(5));
            bonuses.add(bonus);
        }
        return bonuses;
    }
    public int deletebonus(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE FROM Bonus WHERE Bid=?");
        ps.setObject(1, id);
        return ps.executeUpdate();
    }
    public int updatebonus(Bonus bonus) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Bonus SET Name=?,Type=?,Valid_preiod=?,BAmount=? WHERE Bid=?");
        ps.setObject(5, bonus.getBid());
        ps.setObject(1, bonus.getName());
        ps.setObject(2, bonus.getType());
        ps.setObject(3, bonus.getValid_preiod());
        ps.setObject(4, bonus.getAmount());
        return ps.executeUpdate();
    }
}
