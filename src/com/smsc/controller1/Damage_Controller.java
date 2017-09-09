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
import com.smsc.model.Damage;

/**
 *
 * @author smsc
 */
public class Damage_Controller {
    
    public int addDamage(Damage damage) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Damage VALUES(?,?,?,?)");
        ps.setObject(1, damage.getDaid());
        ps.setObject(2, damage.getEid());
        ps.setObject(3, damage.getDamage_Date());
        ps.setObject(4, damage.getLost());
        return ps.executeUpdate();
    }
    public int updateDamage(Damage damage) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Damage SET Eid=?,Damage_Date=?,Lost=? WHERE Deid=?");
        ps.setObject(4, damage.getDaid());
        ps.setObject(1, damage.getEid());
        ps.setObject(2, damage.getDamage_Date());
        ps.setObject(3, damage.getLost());
        return ps.executeUpdate();
    }
    public int deleteDamage(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE FROM Damage WHERE Deid=?");
        ps.setObject(1, id);
        return ps.executeUpdate();
    }
    public ArrayList<Damage> searchDamage_byEmployeeID(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Damage WHERE Eid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet exQuery = stm.executeQuery(sql);
        ArrayList<Damage> damages=new ArrayList<>();
        while(exQuery.next()){
            Damage damage=new Damage(exQuery.getString("Deid"), exQuery.getString("Eid"), exQuery.getString("Damage_Date"), exQuery.getInt("Lost"));
            damages.add(damage);
        }
        return damages;
    }
    public Damage searchDamage_byDamageID(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Damage WHERE Deid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet exQuery = stm.executeQuery(sql);
        if (exQuery.next()) {
            return new Damage(exQuery.getString("Deid"), exQuery.getString("Eid"), exQuery.getString("Damage_Date"), exQuery.getInt("Lost"));
        } else {
            return null;
        }
    }
    public ArrayList<Damage> searchDamage_byDamageDate(String date) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Damage WHERE Damage_Date='"+date+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cst = connection.createStatement();
        ResultSet exQuery = cst.executeQuery(sql);
        ArrayList<Damage> damages=new ArrayList<>();
        while(exQuery.next()){
            Damage damage=new Damage(exQuery.getString("Deid"), exQuery.getString("Eid"), exQuery.getString("Damage_Date"), exQuery.getInt("Lost"));
            damages.add(damage);
        }
        return damages;
    }
    public ArrayList<Damage> getallDamages() throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Damage";
        Connection connection = DBController.createConnection().getConnection();
        Statement cst = connection.createStatement();
        ResultSet exQuery = cst.executeQuery(sql);
        ArrayList<Damage> damages=new ArrayList<>();
        while(exQuery.next()){
            Damage damage=new Damage(exQuery.getString("Deid"), exQuery.getString("Eid"), exQuery.getString("Damage_Date"), exQuery.getInt("Lost"));
            damages.add(damage);
        }
        return damages;
    }
   
}
