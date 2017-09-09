/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.other;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.smsc.db.DBController;

/**
 *
 * @author chamith
 */
public class DatabaseController {

    public static int createNewDatabase(String line) throws SQLException, ClassNotFoundException {
        Connection conn = DBController.createConnection().getConnection();
        Statement stm = conn.createStatement();
        int result = stm.executeUpdate(line);
        return result;
    }
}
