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
import com.smsc.model.Damage_Description;

/**
 *
 * @author smsc
 */
public class Damage_Description_Controller {
    public int addDescription(Damage_Description damage_Description) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Damage_Description VALUES(?,?,?)");
        ps.setObject(1, damage_Description.getDdid());
        ps.setObject(2, damage_Description.getDeid());
        ps.setObject(3, damage_Description.getDescription());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    public int updateDescription(Damage_Description damage_Description) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Damage_Description SET Deid=?,Description=? WHERE Ddid=?");
        ps.setObject(3, damage_Description.getDdid());
        ps.setObject(1, damage_Description.getDeid());
        ps.setObject(2, damage_Description.getDescription());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    public Damage_Description searchDescription_byDamage_Descriptionid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Damage_Description WHERE Ddid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Damage_Description(exQuery.getString("Ddid"), exQuery.getString("Deid"), exQuery.getString("Description"));
        } else {
            return null;
        }
    }
    public Damage_Description searchDescription_byDamageid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Damage_Description WHERE Deid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Damage_Description(exQuery.getString("Ddid"), exQuery.getString("Deid"), exQuery.getString("Description"));
        } else {
            return null;
        }
    }
}
