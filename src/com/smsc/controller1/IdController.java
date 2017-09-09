/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.controller1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.smsc.db.DBController;


/**
 *
 * @author linux
 */
public class IdController {
    
    public static String getLastId(String tableName, String columnName) throws ClassNotFoundException, SQLException{
        String query = "select "+columnName+" from "+tableName+" order by 1 desc limit 1";
        Connection connection = DBController.createConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) {
            return rst.getString(columnName);
        }
        return null;
    }
}
