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
import com.smsc.model.Bonus_Details;

/**
 *
 * @author smsc
 */
public class Bonus_Details_Controller {
    
    public int addBonusDetails(Bonus_Details bonus_Details) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Bonus_Details VALUES(?,?)");
        ps.setObject(1, bonus_Details.getBid());
        ps.setObject(2, bonus_Details.getEid());
        return ps.executeUpdate();
    }
    public ArrayList<Bonus_Details> searchBonusDetails_byBonusid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Bonus_Details WHERE Bid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement st = connection.createStatement();
        ResultSet exQuery = st.executeQuery(sql);
        ArrayList<Bonus_Details> detailses=new ArrayList<>();
        while(exQuery.next()){
            Bonus_Details bonus_Details=new Bonus_Details(exQuery.getString("Bid"), exQuery.getString("Eid"));
            detailses.add(bonus_Details);
        }
        return detailses;
    }
    public ArrayList<Bonus_Details> searchBonusDetails_byemployeeid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Bonus_Details WHERE Eid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement st = connection.createStatement();
        ResultSet exQuery = st.executeQuery(sql);
        ArrayList<Bonus_Details> detailses=new ArrayList<>();
        while(exQuery.next()){
            Bonus_Details bonus_Details=new Bonus_Details(exQuery.getString("Bid"), exQuery.getString("Eid"));
            detailses.add(bonus_Details);
        }
        return detailses;
    }
    
}
