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
import com.smsc.model.User_Details;

/**
 *
 * @author smsc
 */
public class User_Details_Controller {
    public int addUser(User_Details user_Details) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO login_Details VALUES(?,?,?,?,?)");
        ps.setObject(1, user_Details.getLid());
        ps.setObject(2, user_Details.getUser_Name());
        ps.setObject(3, user_Details.getPassword());
        ps.setObject(4, user_Details.getCode());
        ps.setObject(5, user_Details.getAnswer());
        return ps.executeUpdate();
    }
    public int updateUser(User_Details user_Details) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE login_Details SET User_Name=?,Password=?,Code=?,Answer=? WHERE Lid=?");
        ps.setObject(5, user_Details.getLid());
        ps.setObject(1, user_Details.getUser_Name());
        ps.setObject(2, user_Details.getPassword());
        ps.setObject(3, user_Details.getCode());
        ps.setObject(4, user_Details.getAnswer());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    public User_Details searchUser_byName(String name) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM login_Details WHERE User_Name='"+name+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet executeQuery = cstm.executeQuery(sql);
        if (executeQuery.next()) {
            return new User_Details(executeQuery.getString("Lid"), executeQuery.getString("User_Name"), executeQuery.getString("Password"), executeQuery.getString("Code"), executeQuery.getString("Answer"));
        } else {
            return null;
        }
    }
    public User_Details searchUser() throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM login_Details";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet executeQuery = cstm.executeQuery(sql);
        if (executeQuery.next()) {
            return new User_Details(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getString(4), executeQuery.getString(5));
        } else {
            return null;
        }
    }
}
