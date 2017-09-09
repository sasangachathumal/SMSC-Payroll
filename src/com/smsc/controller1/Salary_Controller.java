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
import com.smsc.model.Salary;

/**
 *
 * @author smsc
 */
public class Salary_Controller {
    
    public int Add_Salary(Salary salary) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("insert into Salary values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setObject(1, salary.getSid());
        ps.setObject(2, salary.getEid());
        ps.setObject(3, salary.getAttendance_Incentive());
        ps.setObject(4, salary.getPromotion_Incentive());
        ps.setObject(5, salary.getOt_Bonus());
        ps.setObject(6, salary.getBonus());
        ps.setObject(7, salary.getTransport());
        ps.setObject(8, salary.getEtf());
        ps.setObject(9, salary.getEpf());
        ps.setObject(10, salary.getLoan_Payment());
        ps.setObject(11, salary.getDamage());
        ps.setObject(12, salary.getUnion_Payment());
        ps.setObject(13, salary.getSalary_Advance());
        ps.setObject(14, salary.getTax());
        ps.setObject(15, salary.getHalf_DAY());
        ps.setObject(16, salary.getNo_Pay());
        ps.setObject(17, salary.getNo_of_Working_days());
        ps.setObject(18, salary.getTotal_Amount());
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
    public ArrayList<Salary> getSalaryAmount() throws ClassNotFoundException, SQLException{
        String sql="select e.Eid,sum(Total_Amount) from Employee e,Salary s where e.Eid=s.Eid";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet executeQuery = cstm.executeQuery(sql);
        ArrayList<Salary> salarys=new ArrayList<>();
        while(executeQuery.next()){
            Salary salary=new Salary(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getDouble(3), executeQuery.getDouble(4), executeQuery.getDouble(5), executeQuery.getDouble(6), executeQuery.getDouble(7), executeQuery.getDouble(8),executeQuery.getDouble(9),executeQuery.getDouble(10),executeQuery.getDouble(11),executeQuery.getDouble(12),executeQuery.getDouble(13),executeQuery.getDouble(14),executeQuery.getDouble(15),executeQuery.getDouble(16),executeQuery.getInt(17),executeQuery.getDouble(18));
            salarys.add(salary);
        }
        return salarys;
    }
    public Salary getLastSalary_Seachby_Employeeid(String id) throws ClassNotFoundException, SQLException{
        String sql="select * from Salary where Eid='"+id+"' order by 2 desc limit 1";
        Connection connection = DBController.createConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet executeQuery = stm.executeQuery(sql);
        if (executeQuery.next()) {
            return new Salary(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getDouble(3), executeQuery.getDouble(4), executeQuery.getDouble(5), executeQuery.getDouble(6), executeQuery.getDouble(7), executeQuery.getDouble(8),executeQuery.getDouble(9),executeQuery.getDouble(10),executeQuery.getDouble(11),executeQuery.getDouble(12),executeQuery.getDouble(13),executeQuery.getDouble(14),executeQuery.getDouble(15),executeQuery.getDouble(16),executeQuery.getInt(17),executeQuery.getDouble(18));
        } else {
            return null;
        }
    }
    public ArrayList<Salary> searchSalary_byEmployeeid(String id) throws ClassNotFoundException, SQLException{
        String sql="select * from Salary where Eid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet executeQuery = stm.executeQuery(sql);
        ArrayList<Salary> salarys=new ArrayList<>();
        if (executeQuery.next()) {
            Salary salary=new Salary(executeQuery.getString(1), executeQuery.getString(2), executeQuery.getDouble(3), executeQuery.getDouble(4), executeQuery.getDouble(5), executeQuery.getDouble(6), executeQuery.getDouble(7), executeQuery.getDouble(8), executeQuery.getDouble(9), executeQuery.getDouble(10), executeQuery.getDouble(11), executeQuery.getDouble(12), executeQuery.getDouble(13), executeQuery.getDouble(14), executeQuery.getDouble(15), executeQuery.getDouble(16), executeQuery.getInt(17), executeQuery.getDouble(18));
            salarys.add(salary);
        }
        return salarys;
    }
}
