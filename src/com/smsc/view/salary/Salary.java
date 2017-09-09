/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.view.salary;

import java.sql.SQLException;
import java.util.ArrayList;
import com.smsc.controller1.Advance_Salary_Contorller;
import com.smsc.controller1.Attendance_Contorller;
import com.smsc.controller1.Damage_Controller;
import com.smsc.controller1.Employee_Expetions_Controller;
import com.smsc.controller1.Empolyee_Controller;
import com.smsc.controller1.Grade_Controller;
import com.smsc.controller1.Leaves_Controller;
import com.smsc.controller1.Loan_Controller;
import com.smsc.controller1.Loan_Payment_Controller;
import com.smsc.model.Advance_Salary;
import com.smsc.model.Damage;
import com.smsc.model.Employee;
import com.smsc.model.Employee_Expetions;
import com.smsc.model.Grade;
import com.smsc.model.Leaves;
import com.smsc.model.Loan;
import com.smsc.model.Loan_Payment;
import com.smsc.model.getGrade_searchby_employeenic;
import com.smsc.model.getattendance_byemployee_nic;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author smsc
 */
public class Salary {
    
    /**
     *
     * @param nic
     * @return Employee data search by nic no
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Employee searchEmployee(String nic) throws ClassNotFoundException, SQLException{
        Empolyee_Controller empolyee_Controller=new Empolyee_Controller();
        Employee Search_Employee_by_Nic = empolyee_Controller.Search_Employee_by_Nic(nic);
        if (Search_Employee_by_Nic != null) {
            return Search_Employee_by_Nic;
        } else {
            return null;
        }
    }
    
    /**
     *
     * @param id
     * @return Grade data of one employee search by grade id
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Grade searchGrade(String id) throws ClassNotFoundException, SQLException{
        Grade_Controller grade_Controller=new Grade_Controller();
        Grade searchGrade_byGradeid = grade_Controller.searchGrade_byGradeid(id);
        if (searchGrade_byGradeid != null) {
            return searchGrade_byGradeid;
        } else {
            return null;
        }
    }
    
    /**
     *
     * @param nic
     * @param date
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static int getnoofWorkiningDays(String nic,String date) throws ClassNotFoundException, SQLException{
        int count=0;
        ArrayList<getattendance_byemployee_nic> search_Attendance_by_Employeeid_AllDetails = Attendance_Contorller.search_Attendance_by_EmployeeNIC_AllDetails(nic,date);
        for(getattendance_byemployee_nic attendance : search_Attendance_by_Employeeid_AllDetails){
            count++;
        }
        return count;
    }
    
    /**
     *
     * @param nic
     * @param date
     * @return one employee OT Bonus of this month
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getsumofOTBonus(String nic,String date) throws ClassNotFoundException, SQLException{
        double Total=0.0;
        ArrayList<getattendance_byemployee_nic> search_Attendance_by_Employeeid_AllDetails = Attendance_Contorller.search_Attendance_by_EmployeeNIC_AllDetails(nic,date);
        for(getattendance_byemployee_nic attendance : search_Attendance_by_Employeeid_AllDetails){
            Total=Total+attendance.getOT_bonus();
        }
        return Total;
    }
    
    /**
     *
     * @param nic
     * @param date
     * @return one employee present days count
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static int getpresent(String nic,String date) throws ClassNotFoundException, SQLException{
        int count=0;
        ArrayList<getattendance_byemployee_nic> search_Attendance_by_Employeeid_AllDetails = Attendance_Contorller.search_Attendance_by_EmployeeNIC_AllDetails(nic,date);
        for(getattendance_byemployee_nic attendance : search_Attendance_by_Employeeid_AllDetails){
            if (attendance.getAttend().equals("Present")) {
                count++;
            }
        }
        return count;
    }
    
    /**
     *
     * @param nic
     * @return if employee have loans there payments
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getloanPayment(String nic) throws ClassNotFoundException, SQLException{
        double loanpayment = 0.0;
        double value=0.0;
        double poli=0.0;
        int count=0;
        Employee searchEmployee = searchEmployee(nic);
        if (searchEmployee != null) {
            Loan_Controller loan_Controller = new Loan_Controller();
            ArrayList<Loan> searchLoans_byemployeeid = loan_Controller.searchLoans_byemployeeid(searchEmployee.getEid());
            for (Loan loan : searchLoans_byemployeeid) {
                if (loan.getIf_pay()==0) {
                    ArrayList<Loan_Payment> searchLoanPayment_byLoanid = new Loan_Payment_Controller().searchLoanPayment_byLoanid(loan.getLid());
                    for (Loan_Payment searchLoanPayment : searchLoanPayment_byLoanid) {
                        if (searchLoanPayment.getPay()==1) {
                            count=count+1;
                        }
                    }
                    if (count != Double.parseDouble(loan.getNo_of_Instalments())) {
                        value = value + loan.getValue_of_Instelment();
                        poli = poli + (loan.getAmount() / 100) * loan.getInterest_Rate();
                    } else {
                        
                    }
                }
            }
            loanpayment=value+poli;
            return loanpayment;
        } else {
            return loanpayment;
        }
    }
    
    /**
     *
     * @param eid
     * @param date
     * @return get one employee advance salary payment of this month
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getAdvanceSalary(String eid,String date) throws ClassNotFoundException, SQLException{
        Advance_Salary_Contorller advance_Salary_Contorller=new Advance_Salary_Contorller();
        Advance_Salary search_Last_Advance = advance_Salary_Contorller.search_Last_Advance(eid,date);
        if (search_Last_Advance != null) {
            return search_Last_Advance.getAdvance();
        } else {
            return 0.0;
        }
    }
    
    /**
     *
     * @param eid
     * @param nic
     * @return employee no pay amount
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getNopay(String eid,String nic) throws ClassNotFoundException, SQLException{
        double count=0.0;
        Leaves_Controller leaves_Controller=new Leaves_Controller();
        ArrayList<Leaves> search_leaves_by_Eid = leaves_Controller.search_leaves_by_Eid(eid);
        for(Leaves leaves : search_leaves_by_Eid){
            count++;
        }
        Employee searchEmployee = searchEmployee(nic);
        if (searchEmployee != null) {
            Grade_Controller grade_Controller=new Grade_Controller();
            Grade searchGrade_byGradeid = grade_Controller.searchGrade_byGradeid(searchEmployee.getGid());
            String leaves = searchGrade_byGradeid.getNo_of_Leaves();
            String leaves1 = leaves.substring(0, leaves.length()-4);
            double leavescount = Double.parseDouble(leaves1);
            double nopay_Fee = searchGrade_byGradeid.getNopay_Fee();
            if (count > leavescount) {
                double deferanse=count-leavescount;
                return deferanse*nopay_Fee;
            } else {
                return 0.0;
            }
        }else {
            return 0.0;
        }
    }
    
    /**
     *
     * @param nic
     * @return one employee basic salary
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getEmployee_BasicSalary(String nic) throws ClassNotFoundException, SQLException{
        getGrade_searchby_employeenic searchGrade_byGrade_employeenic = new Grade_Controller().searchGrade_byGrade_employeenic(nic);
        if (searchGrade_byGrade_employeenic != null) {
            return searchGrade_byGrade_employeenic.getBasic_Salary();
        } else {
            return 0.0;
        }
    }
    
    /**
     *
     * @param nic
     * @return one employee transport amount
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getEmployee_TransportAmount(String nic) throws ClassNotFoundException, SQLException {
        getGrade_searchby_employeenic searchGrade_byGrade_employeenic = new Grade_Controller().searchGrade_byGrade_employeenic(nic);
        if (searchGrade_byGrade_employeenic != null) {
            return searchGrade_byGrade_employeenic.getTransport_Amount();
        } else {
            return 1;
        }
    }
    
    /**
     *
     * @param nic
     * @param date
     * @return employee attendance incentive
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getAttendanceIncentive(String nic,String date) throws ClassNotFoundException, SQLException {
        Employee_Expetions all = new Employee_Expetions_Controller().getAll();
        int noofWorkiningDays = getnoofWorkiningDays(nic, date);
        if (noofWorkiningDays >= 22) {
            return all.getAttendance_Incentive();
        } else {
            return 0.0;
        }
    }
    
    /**
     *
     * @param nic
     * @return epf of employee half
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getEmployee_Epf(String nic) throws ClassNotFoundException, SQLException {
        double employee_BasicSalary = getEmployee_BasicSalary(nic);
        Employee_Expetions all = new Employee_Expetions_Controller().getAll();
        double epf=(employee_BasicSalary/100)*all.getEPFEmployee();
        return epf;
    }
    
    /**
     *
     * @param nic
     * @return epf of employee company half
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getCompany_Epf(String nic) throws ClassNotFoundException, SQLException {
        double employee_BasicSalary = getEmployee_BasicSalary(nic);
        Employee_Expetions all = new Employee_Expetions_Controller().getAll();
        double epf=(employee_BasicSalary/100)*all.getEPFCompany();
        return epf;
    }
    
    /**
     *
     * @param nic
     * @return etf of employee
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static double getETF(String nic) throws ClassNotFoundException, SQLException {
        double employee_BasicSalary = getEmployee_BasicSalary(nic);
        Employee_Expetions all = new Employee_Expetions_Controller().getAll();
        double epf=(employee_BasicSalary/100)*all.getETF();
        return epf;
    }
    
    
    private  double total_amount = 0;
    public  void setBonus(double amount){
        this.total_amount=this.total_amount+amount;
    }
    public  double getBonus_amount(){
        return this.total_amount;
    }
    
    
    
    public static double getDamageAmount(String Eid){
        double Amount=0.0;
        try {
            ArrayList<Damage> searchDamage_byEmployeeID = new Damage_Controller().searchDamage_byEmployeeID(Eid);
            if (!searchDamage_byEmployeeID.isEmpty()) {
                for (Damage damage : searchDamage_byEmployeeID) {
                    Amount=Amount+damage.getLost();
                }
                return Amount;
            } else {
                return Amount;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Amount;
    }
}
