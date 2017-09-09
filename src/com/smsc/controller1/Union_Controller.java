/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smsc.controller1;

import com.smsc.db.DBController;
import com.smsc.model.Unions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author smsc
 */
public class Union_Controller {

    public int inputUnions(Unions unions) throws ClassNotFoundException, SQLException {
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("insert into Unions values(?,?,?,?,?)");
        ps.setObject(1, unions.getUid());
        ps.setObject(2, unions.getName());
        ps.setObject(3, unions.getOpenDate());
        ps.setObject(4, unions.getMSFee());
        ps.setObject(5, unions.getRegister_No());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }

    public ArrayList<Unions> getAll() throws ClassNotFoundException, SQLException {
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from Unions");
        ResultSet executeQuery = ps.executeQuery();
        ArrayList<Unions> list=new ArrayList<>();
        while(executeQuery.next()){
            Unions unions=new Unions(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getDouble(4), executeQuery.getString(5));
            list.add(unions);
        }
        return list;
    }

    public Unions searchUnions_byname(String name) throws ClassNotFoundException, SQLException {
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from Unions where Name=?");
        ps.setObject(1, name);
        ResultSet executeQuery = ps.executeQuery();
        if (executeQuery.next()) {
            return new Unions(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getDouble(4), executeQuery.getString(5));
        } else {
            return null;
        }
    }

    public int updateUnion(Unions unions) throws ClassNotFoundException, SQLException {
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("update Unions set Name=?,OpenDate=?,MSFee=?,Register_No=? where Uid=?");
        ps.setObject(1, unions.getName());
        ps.setObject(2, unions.getOpenDate());
        ps.setObject(3, unions.getMSFee());
        ps.setObject(4, unions.getRegister_No());
        ps.setObject(5, unions.getUid());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }

    public int Removeunion(String UID) throws ClassNotFoundException, SQLException {
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("delete from Unions where Uid=?");
        ps.setObject(1, UID);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    
}
