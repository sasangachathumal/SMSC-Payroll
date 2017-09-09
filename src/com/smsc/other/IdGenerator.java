/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.other;

import java.sql.SQLException;
import java.text.NumberFormat;
import com.smsc.controller1.IdController;


/**
 *
 * @author smsc
 */
public class IdGenerator {
    
    public static String getNewId(String tableName, String colomnName, String prefix) throws ClassNotFoundException, SQLException{
        String lastId = IdController.getLastId(tableName, colomnName);
        if (lastId != null) {
            int id = Integer.parseInt(lastId.split(prefix)[1]);
            id++;
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setMinimumIntegerDigits(3);
            numberFormat.setGroupingUsed(false);
            String newId = numberFormat.format(id);
            return prefix + newId;
        } else {
            return prefix + "001";
        }
    }
}
