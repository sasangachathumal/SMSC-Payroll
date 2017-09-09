/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smsc.controller1;

import java.sql.*;
import java.util.ArrayList;
import com.smsc.db.DBController;
import com.smsc.model.Grade;
import com.smsc.model.getGrade_searchby_employeenic;

/**
 *
 * @author smsc
 */
public class Grade_Controller {
    public int addgrade(Grade grade) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Grade VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setObject(1, grade.getGid());
        ps.setObject(2, grade.getName());
        ps.setObject(3, grade.getDate());
        ps.setObject(4, grade.getBasic_Salary());
        ps.setObject(5, grade.getDalyworking_Rate());
        ps.setObject(6, grade.getMaxloan_Amount());
        ps.setObject(7, grade.getTransport_Amount());
        ps.setObject(8, grade.getTraining_Preiod());
        ps.setObject(9, grade.getTraining_Fee());
        ps.setObject(10, grade.getNopay_Rate());
        ps.setObject(11, grade.getNopay_Fee());
        ps.setObject(12, grade.getWeekend_Ot_Rate());
        ps.setObject(13, grade.getWeekend_ot_Fee());
        ps.setObject(14, grade.getWeekday_Ot_Rate());
        ps.setObject(15, grade.getWeekday_ot_Fee());
        ps.setObject(16, grade.getNo_of_Leaves());
        ps.setObject(17, grade.getNo_of_Halfday_Leaves());
        return ps.executeUpdate();
    }
    public int updateGrade(Grade grade) throws ClassNotFoundException, SQLException{
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Grade SET Name=?,Date=?,Basic_Salary=?,Dalyworking_Rate=?,Maxloan_Amount=?,Transport_Amount=?,Training_Preiod=?,Training_Fee=?,MaxNopay_Rate=?,Nopey_Fee=?,Weekend_Ot_Rate=?,Weekend_ot_Fee=?,Weekday_Ot_Rate=?,Weekday_ot_Fee=?,No_of_Leaves=?,No_of_Halfday_Leaves=? WHERE Gid=?");
        ps.setObject(17, grade.getGid());
        ps.setObject(1, grade.getName());
        ps.setObject(2, grade.getDate());
        ps.setObject(3, grade.getBasic_Salary());
        ps.setObject(4, grade.getDalyworking_Rate());
        ps.setObject(5, grade.getMaxloan_Amount());
        ps.setObject(6, grade.getTransport_Amount());
        ps.setObject(7, grade.getTraining_Preiod());
        ps.setObject(8, grade.getTraining_Fee());
        ps.setObject(9, grade.getNopay_Rate());
        ps.setObject(10, grade.getNopay_Fee());
        ps.setObject(11, grade.getWeekend_Ot_Rate());
        ps.setObject(12, grade.getWeekend_ot_Fee());
        ps.setObject(13, grade.getWeekday_Ot_Rate());
        ps.setObject(14, grade.getWeekday_ot_Fee());
        ps.setObject(15, grade.getNo_of_Leaves());
        ps.setObject(16, grade.getNo_of_Halfday_Leaves());
        return ps.executeUpdate();
    }
    public Grade searchGrade_byGradeid(String id) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Grade WHERE Gid='"+id+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Grade(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4), exQuery.getString(5), exQuery.getDouble(6), exQuery.getDouble(7), exQuery.getString(8),exQuery.getDouble(9), exQuery.getString(10),exQuery.getDouble(11), exQuery.getString(12),exQuery.getDouble(13), exQuery.getString(14),exQuery.getDouble(15),exQuery.getString(16),exQuery.getString(17));
        } else {
            return null;
        }
    }
    public Grade searchGrade_byGradename(String name) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Grade WHERE Name='"+name+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new Grade(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4), exQuery.getString(5), exQuery.getDouble(6), exQuery.getDouble(7), exQuery.getString(8),exQuery.getDouble(9), exQuery.getString(10),exQuery.getDouble(11), exQuery.getString(12),exQuery.getDouble(13), exQuery.getString(14),exQuery.getDouble(15),exQuery.getString(16),exQuery.getString(17));
        } else {
            return null;
        }
    }
    public getGrade_searchby_employeenic searchGrade_byGrade_employeenic(String nic) throws ClassNotFoundException, SQLException{
        String sql="SELECT e.Eid,e.Nic_No,e.Lastname,e.Gnder,g.Basic_Salary,g.Transport_Amount,g.Dalyworking_Rate,g.Maxloan_Amount,g.Training_Fee,g.Nopey_Fee,g.Weekend_ot_Fee,g.Weekday_ot_Fee,g.Name,g.Training_Preiod,g.Weekend_Ot_Rate,g.Weekday_Ot_Rate,g.No_of_Leaves,g.No_of_Halfday_Leaves FROM Employee e , Grade g  WHERE e.Nic_No='"+nic+"' and e.Gid=g.Gid";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        if (exQuery.next()) {
            return new getGrade_searchby_employeenic(exQuery.getString(1),exQuery.getString(2),exQuery.getString(3),exQuery.getString(4),exQuery.getDouble(5),exQuery.getDouble(6),exQuery.getString(7),exQuery.getDouble(8),exQuery.getDouble(9),exQuery.getDouble(10),exQuery.getDouble(11),exQuery.getDouble(12),exQuery.getString(13),exQuery.getString(14),exQuery.getString(15),exQuery.getString(16),exQuery.getString(17),exQuery.getString(18));
        } else {
            return null;
        }
    }
    public ArrayList<Grade> searchGrade_byDate(String date) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Grade WHERE AddDate='"+date+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Grade> grades=new ArrayList<>();
        while(exQuery.next()){
            Grade grade=new Grade(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4), exQuery.getString(5), exQuery.getDouble(6), exQuery.getDouble(7), exQuery.getString(8),exQuery.getDouble(9), exQuery.getString(10),exQuery.getDouble(11), exQuery.getString(12),exQuery.getDouble(13), exQuery.getString(14),exQuery.getDouble(15),exQuery.getString(16),exQuery.getString(17));
            grades.add(grade);
        }
        return grades;
    }
    public ArrayList<Grade> searchGrade_byBasicSalary(String salary) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Grade WHERE Basic_Salary='"+salary+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Grade> grades=new ArrayList<>();
        while(exQuery.next()){
            Grade grade=new Grade(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4), exQuery.getString(5), exQuery.getDouble(6), exQuery.getDouble(7), exQuery.getString(8),exQuery.getDouble(9), exQuery.getString(10),exQuery.getDouble(11), exQuery.getString(12),exQuery.getDouble(13), exQuery.getString(14),exQuery.getDouble(15),exQuery.getString(16),exQuery.getString(17));
            grades.add(grade);
        }
        return grades;
    }
    public ArrayList<Grade> searchGrade_byTraining_Preiod(String preiod) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Grade WHERE Training_Preiod='"+preiod+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Grade> grades=new ArrayList<>();
        while(exQuery.next()){
            Grade grade=new Grade(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4), exQuery.getString(5), exQuery.getDouble(6), exQuery.getDouble(7), exQuery.getString(8),exQuery.getDouble(9), exQuery.getString(10),exQuery.getDouble(11), exQuery.getString(12),exQuery.getDouble(13), exQuery.getString(14),exQuery.getDouble(15),exQuery.getString(16),exQuery.getString(17));
            grades.add(grade);
        }
        return grades;
    }
    public ArrayList<Grade> searchGrade_byNopay_Rate(String nopay) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Grade WHERE Nopay_Rate='"+nopay+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Grade> grades=new ArrayList<>();
        while(exQuery.next()){
            Grade grade=new Grade(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4), exQuery.getString(5), exQuery.getDouble(6), exQuery.getDouble(7), exQuery.getString(8),exQuery.getDouble(9), exQuery.getString(10),exQuery.getDouble(11), exQuery.getString(12),exQuery.getDouble(13), exQuery.getString(14),exQuery.getDouble(15),exQuery.getString(16),exQuery.getString(17));
            grades.add(grade);
        }
        return grades;
    }
    public ArrayList<Grade> searchGrade_byWeekend_Ot_Rate(String weot) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Grade WHERE Weekend_Ot_Rate='"+weot+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Grade> grades=new ArrayList<>();
        while(exQuery.next()){
            Grade grade=new Grade(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4), exQuery.getString(5), exQuery.getDouble(6), exQuery.getDouble(7), exQuery.getString(8),exQuery.getDouble(9), exQuery.getString(10),exQuery.getDouble(11), exQuery.getString(12),exQuery.getDouble(13), exQuery.getString(14),exQuery.getDouble(15),exQuery.getString(16),exQuery.getString(17));
            grades.add(grade);
        }
        return grades;
    }
    public ArrayList<Grade> searchGrade_byWeekday_Ot_Rate(String wdot) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Grade WHERE Weekday_Ot_Rate='"+wdot+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Grade> grades=new ArrayList<>();
        while(exQuery.next()){
            Grade grade=new Grade(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4), exQuery.getString(5), exQuery.getDouble(6), exQuery.getDouble(7), exQuery.getString(8),exQuery.getDouble(9), exQuery.getString(10),exQuery.getDouble(11), exQuery.getString(12),exQuery.getDouble(13), exQuery.getString(14),exQuery.getDouble(15),exQuery.getString(16),exQuery.getString(17));
            grades.add(grade);
        }
        return grades;
    }
    public ArrayList<Grade> searchGrade_byDalyworking(String dalywrate) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Grade WHERE Dalyworking_Rate='"+dalywrate+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Grade> grades=new ArrayList<>();
        while(exQuery.next()){
            Grade grade=new Grade(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4), exQuery.getString(5), exQuery.getDouble(6), exQuery.getDouble(7), exQuery.getString(8),exQuery.getDouble(9), exQuery.getString(10),exQuery.getDouble(11), exQuery.getString(12),exQuery.getDouble(13), exQuery.getString(14),exQuery.getDouble(15),exQuery.getString(16),exQuery.getString(17));
            grades.add(grade);
        }
        return grades;
    }
    public ArrayList<Grade> searchGrade_byMaxloan_Amount(String loanamount) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Grade WHERE Maxloan_Amount='"+loanamount+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Grade> grades=new ArrayList<>();
        while(exQuery.next()){
            Grade grade=new Grade(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4), exQuery.getString(5), exQuery.getDouble(6), exQuery.getDouble(7), exQuery.getString(8),exQuery.getDouble(9), exQuery.getString(10),exQuery.getDouble(11), exQuery.getString(12),exQuery.getDouble(13), exQuery.getString(14),exQuery.getDouble(15),exQuery.getString(16),exQuery.getString(17));
            grades.add(grade);
        }
        return grades;
    }
    public ArrayList<Grade> searchGrade_byTransport_Amount(String trnsAmount) throws ClassNotFoundException, SQLException{
        String sql="SELECT * FROM Grade WHERE Transport_Amount='"+trnsAmount+"'";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet exQuery = cstm.executeQuery(sql);
        ArrayList<Grade> grades=new ArrayList<>();
        while(exQuery.next()){
            Grade grade=new Grade(exQuery.getString(1),exQuery.getString(2), exQuery.getString(3), exQuery.getDouble(4), exQuery.getString(5), exQuery.getDouble(6), exQuery.getDouble(7), exQuery.getString(8),exQuery.getDouble(9), exQuery.getString(10),exQuery.getDouble(11), exQuery.getString(12),exQuery.getDouble(13), exQuery.getString(14),exQuery.getDouble(15),exQuery.getString(16),exQuery.getString(17));
            grades.add(grade);
        }
        return grades;
    }

    public ArrayList<Grade> getAllgrades() throws ClassNotFoundException, SQLException {
        String sql="SELECT * FROM Grade";
        Connection connection = DBController.createConnection().getConnection();
        Statement cstm = connection.createStatement();
        ResultSet executeQuery = cstm.executeQuery(sql);
        ArrayList<Grade> grades=new ArrayList<>();
        while(executeQuery.next()){
            Grade grade=new Grade(executeQuery.getString(1),executeQuery.getString(2), executeQuery.getString(3), executeQuery.getDouble(4), executeQuery.getString(5), executeQuery.getDouble(6), executeQuery.getDouble(7), executeQuery.getString(8),executeQuery.getDouble(9), executeQuery.getString(10),executeQuery.getDouble(11), executeQuery.getString(12),executeQuery.getDouble(13), executeQuery.getString(14),executeQuery.getDouble(15),executeQuery.getString(16),executeQuery.getString(17));
            grades.add(grade);
        }
        return grades;
    }

    public int removeGrade(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE FROM Grade WHERE Gid=?");
        ps.setObject(1, id);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }

    public int updateone(String GID, Grade grade) throws ClassNotFoundException, SQLException {
        Connection connection = DBController.createConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE Grade SET Maxloan_Amount=?,Transport_Amount=?,Weekend_Ot_Rate=?,Weekend_ot_Fee=?,Weekday_Ot_Rate=?,Weekday_ot_Fee=?,No_of_Leaves=?,No_of_Halfday_Leaves=? WHERE Gid=?");
        ps.setObject(1, grade.getMaxloan_Amount());
        ps.setObject(2, grade.getTransport_Amount());
        ps.setObject(3, grade.getWeekend_Ot_Rate());
        ps.setObject(4, grade.getWeekend_ot_Fee());
        ps.setObject(5, grade.getWeekday_Ot_Rate());
        ps.setObject(6, grade.getWeekday_ot_Fee());
        ps.setObject(7, grade.getNo_of_Leaves());
        ps.setObject(8, grade.getNo_of_Halfday_Leaves());
        ps.setObject(9, GID);
        int executeUpdate = ps.executeUpdate();
        return executeUpdate;
    }
}
