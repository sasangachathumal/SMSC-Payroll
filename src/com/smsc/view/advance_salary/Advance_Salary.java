/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.view.advance_salary;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.smsc.controller1.Advance_Salary_Contorller;
import com.smsc.controller1.Department_Controller;
import com.smsc.controller1.Department_Details_Controller;
import com.smsc.controller1.Empolyee_Controller;
import com.smsc.controller1.Grade_Controller;
import com.smsc.controller1.Jobrole_Controller;
import com.smsc.controller1.Jobrole_Details_Controller;
import com.smsc.controller1.Salary_Controller;
import com.smsc.controller1.Salary_Payment_Controller;
import com.smsc.model.Department;
import com.smsc.model.Department_Detail;
import com.smsc.model.Employee;
import com.smsc.model.Grade;
import com.smsc.model.Job_Role;
import com.smsc.model.Job_role_Detail;
import com.smsc.model.Salary;
import com.smsc.other.IdGenerator;
import com.smsc.other.Validation;

/**
 *
 * @author smsc
 */
public class Advance_Salary extends javax.swing.JFrame {
    private final Empolyee_Controller empolyee_Controller;
    private final Grade_Controller grade_Controller;
    private final Department_Details_Controller department_Details_Controller;
    private final Department_Controller department_Controller;
    private final Jobrole_Details_Controller jobrole_Details_Controller;
    private final Jobrole_Controller jobrole_Controller;
    private final Salary_Controller salary_Controller;
    private final Salary_Payment_Controller salary_Payment_Controller;
    private search_Advance_Salary advance_Salary = null;
    int xmouse;
    int ymouse;
    /**
     * Creates new form Advance_Salary
     */
    public Advance_Salary() {
        initComponents();
        setLocationRelativeTo(null);
        setDate();
        try {
            setid();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Advance_Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        empolyee_Controller=new Empolyee_Controller();
        grade_Controller=new Grade_Controller();
        department_Details_Controller=new Department_Details_Controller();
        department_Controller=new Department_Controller();
        jobrole_Details_Controller=new Jobrole_Details_Controller();
        jobrole_Controller=new Jobrole_Controller();
        salary_Controller=new Salary_Controller();
        salary_Payment_Controller=new Salary_Payment_Controller();

    }
    private void setDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formatedDate = dateFormat.format(date);
       texDate.setText(formatedDate);
    }
    private void setid() throws ClassNotFoundException, SQLException{
        String newId = IdGenerator.getNewId("Advance_Salary", "Asid", "As");
        texAdvanceSalaryid.setText(newId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btsearchAdvanceSalary = new javax.swing.JButton();
        btexit = new javax.swing.JButton();
        btmini = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labAdvanceSalaryid = new javax.swing.JLabel();
        texAdvanceSalaryid = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        labEmployeeName = new javax.swing.JLabel();
        labEmployeeGrade = new javax.swing.JLabel();
        labEmployeeDepartment = new javax.swing.JLabel();
        labEmployeeJobrole = new javax.swing.JLabel();
        labBasicSalary = new javax.swing.JLabel();
        texEmployeeDepartment = new javax.swing.JTextField();
        texEmployeeJobrole = new javax.swing.JTextField();
        texEmployeeSalary = new javax.swing.JTextField();
        texEmployeeGrade = new javax.swing.JTextField();
        texEmployeeName = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        labLastSalaryPayment = new javax.swing.JLabel();
        texLastSalaryPayment = new javax.swing.JTextField();
        labNoofPastSalaryAdvance = new javax.swing.JLabel();
        texNoofPastSalaryAdvance = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        labAdvancesalary3 = new javax.swing.JLabel();
        texAdvancesalary3 = new javax.swing.JTextField();
        btPayAdavanceSalary3 = new javax.swing.JButton();
        labEnterEmployeeNic3 = new javax.swing.JLabel();
        btSearchEmployee = new javax.swing.JButton();
        labDate = new javax.swing.JLabel();
        texDate = new javax.swing.JTextField();
        texSearchEmployeenic = new org.jdesktop.swingx.JXSearchField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setPreferredSize(new java.awt.Dimension(1382, 390));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SMSC Payroll");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 230, -1));

        btsearchAdvanceSalary.setBackground(new java.awt.Color(102, 102, 102));
        btsearchAdvanceSalary.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btsearchAdvanceSalary.setText("Search Advance Salary");
        btsearchAdvanceSalary.setBorderPainted(false);
        btsearchAdvanceSalary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsearchAdvanceSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchAdvanceSalaryActionPerformed(evt);
            }
        });
        jPanel3.add(btsearchAdvanceSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        btexit.setText("X");
        btexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btexitMouseClicked(evt);
            }
        });
        jPanel3.add(btexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, -1, -1));

        btmini.setText("_");
        btmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btminiMouseClicked(evt);
            }
        });
        jPanel3.add(btmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Employee Advance Salary Payment");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, -1));

        labAdvanceSalaryid.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labAdvanceSalaryid.setForeground(new java.awt.Color(0, 0, 102));
        labAdvanceSalaryid.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labAdvanceSalaryid.setText("Advance Salary Id  : ");
        jPanel3.add(labAdvanceSalaryid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        texAdvanceSalaryid.setEditable(false);
        texAdvanceSalaryid.setBackground(new java.awt.Color(0, 153, 204));
        texAdvanceSalaryid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        texAdvanceSalaryid.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(texAdvanceSalaryid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 110, 30));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labEmployeeName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labEmployeeName.setForeground(new java.awt.Color(0, 0, 102));
        labEmployeeName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEmployeeName.setText("Employee Name  : ");
        jPanel8.add(labEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 246, -1));

        labEmployeeGrade.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labEmployeeGrade.setForeground(new java.awt.Color(0, 0, 102));
        labEmployeeGrade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEmployeeGrade.setText("Employee Grade  : ");
        jPanel8.add(labEmployeeGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 246, -1));

        labEmployeeDepartment.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labEmployeeDepartment.setForeground(new java.awt.Color(0, 0, 102));
        labEmployeeDepartment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEmployeeDepartment.setText("Employee Department  : ");
        jPanel8.add(labEmployeeDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 246, -1));

        labEmployeeJobrole.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labEmployeeJobrole.setForeground(new java.awt.Color(0, 0, 102));
        labEmployeeJobrole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEmployeeJobrole.setText("Employee Job Role  : ");
        jPanel8.add(labEmployeeJobrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 246, -1));

        labBasicSalary.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labBasicSalary.setForeground(new java.awt.Color(0, 0, 102));
        labBasicSalary.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labBasicSalary.setText("Employee Basic Salary  : ");
        jPanel8.add(labBasicSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        texEmployeeDepartment.setEditable(false);
        texEmployeeDepartment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        texEmployeeDepartment.setForeground(new java.awt.Color(0, 0, 102));
        texEmployeeDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(texEmployeeDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 269, 28));

        texEmployeeJobrole.setEditable(false);
        texEmployeeJobrole.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        texEmployeeJobrole.setForeground(new java.awt.Color(0, 0, 102));
        texEmployeeJobrole.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(texEmployeeJobrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 269, 28));

        texEmployeeSalary.setEditable(false);
        texEmployeeSalary.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        texEmployeeSalary.setForeground(new java.awt.Color(0, 0, 102));
        texEmployeeSalary.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(texEmployeeSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 269, 28));

        texEmployeeGrade.setEditable(false);
        texEmployeeGrade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        texEmployeeGrade.setForeground(new java.awt.Color(0, 0, 102));
        texEmployeeGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(texEmployeeGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 269, 28));

        texEmployeeName.setEditable(false);
        texEmployeeName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        texEmployeeName.setForeground(new java.awt.Color(0, 0, 102));
        texEmployeeName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(texEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 374, 28));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 650, 270));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labLastSalaryPayment.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labLastSalaryPayment.setForeground(new java.awt.Color(0, 0, 102));
        labLastSalaryPayment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labLastSalaryPayment.setText("Last Salary Payment  : ");
        jPanel9.add(labLastSalaryPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 284, -1));

        texLastSalaryPayment.setEditable(false);
        texLastSalaryPayment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        texLastSalaryPayment.setForeground(new java.awt.Color(0, 0, 102));
        texLastSalaryPayment.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(texLastSalaryPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 269, 28));

        labNoofPastSalaryAdvance.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labNoofPastSalaryAdvance.setForeground(new java.awt.Color(0, 0, 102));
        labNoofPastSalaryAdvance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labNoofPastSalaryAdvance.setText("No of Past Salary Advance  : ");
        jPanel9.add(labNoofPastSalaryAdvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        texNoofPastSalaryAdvance.setEditable(false);
        texNoofPastSalaryAdvance.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        texNoofPastSalaryAdvance.setForeground(new java.awt.Color(0, 0, 102));
        texNoofPastSalaryAdvance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(texNoofPastSalaryAdvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 269, 28));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 590, 130));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Advance Salary info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanel10.setOpaque(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labAdvancesalary3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labAdvancesalary3.setForeground(new java.awt.Color(0, 0, 102));
        labAdvancesalary3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labAdvancesalary3.setText("Advance Salary Amount  : ");
        jPanel10.add(labAdvancesalary3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 29));

        texAdvancesalary3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        texAdvancesalary3.setForeground(new java.awt.Color(0, 0, 102));
        texAdvancesalary3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texAdvancesalary3KeyReleased(evt);
            }
        });
        jPanel10.add(texAdvancesalary3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 296, -1));

        btPayAdavanceSalary3.setBackground(new java.awt.Color(102, 102, 102));
        btPayAdavanceSalary3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btPayAdavanceSalary3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/Attendance/accept.png"))); // NOI18N
        btPayAdavanceSalary3.setText("Pay Advance Salary");
        btPayAdavanceSalary3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPayAdavanceSalary3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPayAdavanceSalary3ActionPerformed(evt);
            }
        });
        jPanel10.add(btPayAdavanceSalary3, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 60, 210, -1));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 590, 130));

        labEnterEmployeeNic3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labEnterEmployeeNic3.setForeground(new java.awt.Color(0, 0, 102));
        labEnterEmployeeNic3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEnterEmployeeNic3.setText("Enter Employee Nic  : ");
        jPanel3.add(labEnterEmployeeNic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        btSearchEmployee.setBackground(new java.awt.Color(102, 102, 102));
        btSearchEmployee.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btSearchEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/Attendance/search.png"))); // NOI18N
        btSearchEmployee.setText("Search");
        btSearchEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchEmployeeActionPerformed(evt);
            }
        });
        jPanel3.add(btSearchEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, -1, 40));

        labDate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labDate.setForeground(new java.awt.Color(0, 0, 102));
        labDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labDate.setText("Date  : ");
        jPanel3.add(labDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, -1, -1));

        texDate.setEditable(false);
        texDate.setBackground(new java.awt.Color(0, 153, 204));
        texDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        texDate.setForeground(new java.awt.Color(0, 0, 102));
        texDate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(texDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, 202, -1));

        texSearchEmployeenic.setSearchMode(org.jdesktop.swingx.JXSearchField.SearchMode.REGULAR);
        texSearchEmployeenic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texSearchEmployeenicActionPerformed(evt);
            }
        });
        texSearchEmployeenic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                texSearchEmployeenicKeyReleased(evt);
            }
        });
        jPanel3.add(texSearchEmployeenic, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 200, -1));

        jLabel3.setBackground(new java.awt.Color(0, 102, 153));
        jLabel3.setOpaque(true);
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1280, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/photos/back3232.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 7));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 427));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texAdvancesalary3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texAdvancesalary3KeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE || evt.getKeyCode() != KeyEvent.VK_PROPS) {
            Validation.validatenumber(texAdvancesalary3);
        }
    }//GEN-LAST:event_texAdvancesalary3KeyReleased

    private void btPayAdavanceSalary3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPayAdavanceSalary3ActionPerformed
        payAdvanceSalary();
    }//GEN-LAST:event_btPayAdavanceSalary3ActionPerformed

    private void btSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchEmployeeActionPerformed
        searchEmployee();
    }//GEN-LAST:event_btSearchEmployeeActionPerformed

    private void texSearchEmployeenicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texSearchEmployeenicActionPerformed
        btSearchEmployee.doClick();
        texAdvancesalary3.requestFocus();
    }//GEN-LAST:event_texSearchEmployeenicActionPerformed

    private void btexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btexitMouseClicked

        this.dispose();
    }//GEN-LAST:event_btexitMouseClicked

    private void btminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btminiMouseClicked
        this.setState(Advance_Salary.ICONIFIED);
    }//GEN-LAST:event_btminiMouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        xmouse= evt.getX();
        ymouse= evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void btsearchAdvanceSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchAdvanceSalaryActionPerformed
        if (advance_Salary == null) {
            advance_Salary = new search_Advance_Salary();
            advance_Salary.setVisible(true);
        } else {
            advance_Salary.setVisible(true);
            advance_Salary=null;
        }
    }//GEN-LAST:event_btsearchAdvanceSalaryActionPerformed

    private void texSearchEmployeenicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texSearchEmployeenicKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            Validation.validateNIC(texSearchEmployeenic);
        }
    }//GEN-LAST:event_texSearchEmployeenicKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Advance_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Advance_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Advance_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Advance_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Advance_Salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPayAdavanceSalary3;
    private javax.swing.JButton btSearchEmployee;
    private javax.swing.JButton btexit;
    private javax.swing.JButton btmini;
    private javax.swing.JButton btsearchAdvanceSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labAdvanceSalaryid;
    private javax.swing.JLabel labAdvancesalary3;
    private javax.swing.JLabel labBasicSalary;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labEmployeeDepartment;
    private javax.swing.JLabel labEmployeeGrade;
    private javax.swing.JLabel labEmployeeJobrole;
    private javax.swing.JLabel labEmployeeName;
    private javax.swing.JLabel labEnterEmployeeNic3;
    private javax.swing.JLabel labLastSalaryPayment;
    private javax.swing.JLabel labNoofPastSalaryAdvance;
    private javax.swing.JTextField texAdvanceSalaryid;
    private javax.swing.JTextField texAdvancesalary3;
    private javax.swing.JTextField texDate;
    private javax.swing.JTextField texEmployeeDepartment;
    private javax.swing.JTextField texEmployeeGrade;
    private javax.swing.JTextField texEmployeeJobrole;
    private javax.swing.JTextField texEmployeeName;
    private javax.swing.JTextField texEmployeeSalary;
    private javax.swing.JTextField texLastSalaryPayment;
    private javax.swing.JTextField texNoofPastSalaryAdvance;
    private org.jdesktop.swingx.JXSearchField texSearchEmployeenic;
    // End of variables declaration//GEN-END:variables

    private void payAdvanceSalary() {
        try {
            String id = texAdvanceSalaryid.getText();
            String employeenic = texSearchEmployeenic.getText();
            String date = texDate.getText();
            double advance = Double.parseDouble(texAdvancesalary3.getText());
            Employee Search_Employee_by_Nic = empolyee_Controller.Search_Employee_by_Nic(employeenic);
            if (Search_Employee_by_Nic != null) {
                com.smsc.model.Advance_Salary advance_Salary=new com.smsc.model.Advance_Salary(id, Search_Employee_by_Nic.getEid(), date, advance);
                Advance_Salary_Contorller advance_Salary_Contorller=new Advance_Salary_Contorller();
                int Add_Advance = advance_Salary_Contorller.Add_Advance(advance_Salary);
                if (Add_Advance > 0) {
                    JOptionPane.showMessageDialog(this, "Employee Advance Salary Input Scuccess !!!");
                    texEmployeeDepartment.setText("");
                    texEmployeeGrade.setText("");
                    texEmployeeJobrole.setText("");
                    texEmployeeName.setText("");
                    texEmployeeSalary.setText("");
                    texLastSalaryPayment.setText("");
                    texNoofPastSalaryAdvance.setText("");
                    texSearchEmployeenic.setText("");
                    texAdvancesalary3.setText("");
                    setid();
                } else {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "Employee Advance Salary Input Fail !!!");
                }
            } else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "Employee Not Found !!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Advance_Salary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Advance_Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void searchEmployee() {
        try {
            String employeenic = texSearchEmployeenic.getText();
            Employee Search_Employee_by_Nic = empolyee_Controller.Search_Employee_by_Nic(employeenic);
            if (Search_Employee_by_Nic != null) {
                Grade searchGrade_byGradeid = grade_Controller.searchGrade_byGradeid(Search_Employee_by_Nic.getGid());
                if (searchGrade_byGradeid != null) {
                    Department_Detail searchDepartment_Detailseid = department_Details_Controller.searchDepartment_Detailseid(Search_Employee_by_Nic.getEid());
                    if (searchDepartment_Detailseid != null) {
                        Department search_Department_by_id = department_Controller.search_Department_by_id(searchDepartment_Detailseid.getDid());
                        if (search_Department_by_id != null) {
                            Job_role_Detail searchjobrole_details = jobrole_Details_Controller.searchjobrole_details(Search_Employee_by_Nic.getEid());
                            if (searchjobrole_details != null) {
                                Job_Role searchjobrole_byjobroleid = jobrole_Controller.searchjobrole_byjobroleid(searchjobrole_details.getJrid());
                                if (searchjobrole_byjobroleid != null) {
                                    Salary lastSalary_Seachby_Employeeid = salary_Controller.getLastSalary_Seachby_Employeeid(Search_Employee_by_Nic.getEid());
                                    if (lastSalary_Seachby_Employeeid != null) {
                                        Advance_Salary_Contorller advance_Salary_Contorller=new Advance_Salary_Contorller();
                                        ArrayList<com.smsc.model.Advance_Salary> search_Advance_Salary_by_Employeeid = advance_Salary_Contorller.search_Advance_Salary_by_Employeeid(Search_Employee_by_Nic.getEid());
                                        int x=0;
                                        for (int i = 0; i < search_Advance_Salary_by_Employeeid.size(); i++) {
                                            for (com.smsc.model.Advance_Salary advance_Salary : search_Advance_Salary_by_Employeeid) {
                                                x++;
                                            }
                                        }
                                        texLastSalaryPayment.setText(String.valueOf(lastSalary_Seachby_Employeeid.getTotal_Amount()));
                                        texEmployeeName.setText(Search_Employee_by_Nic.getSurename() +" "+ Search_Employee_by_Nic.getLastname());
                                        texEmployeeGrade.setText(searchGrade_byGradeid.getName());
                                        texEmployeeDepartment.setText(search_Department_by_id.getName());
                                        texEmployeeJobrole.setText(searchjobrole_byjobroleid.getName());
                                        texEmployeeSalary.setText(String.valueOf(searchGrade_byGradeid.getBasic_Salary()));
                                        texNoofPastSalaryAdvance.setText(String.valueOf(x));
                                    }else {
                                        Toolkit.getDefaultToolkit().beep();
                                        JOptionPane.showMessageDialog(this, "Employee Haven't Eny Salary Payment !!!");
                                        Advance_Salary_Contorller advance_Salary_Contorller=new Advance_Salary_Contorller();
                                        ArrayList<com.smsc.model.Advance_Salary> search_Advance_Salary_by_Employeeid = advance_Salary_Contorller.search_Advance_Salary_by_Employeeid(Search_Employee_by_Nic.getEid());
                                        int x=0;
                                        for(com.smsc.model.Advance_Salary advance_Salary : search_Advance_Salary_by_Employeeid){
                                            x++;
                                        }
                                        texEmployeeName.setText(Search_Employee_by_Nic.getSurename() +" "+ Search_Employee_by_Nic.getLastname());
                                        texEmployeeGrade.setText(searchGrade_byGradeid.getName());
                                        texEmployeeDepartment.setText(search_Department_by_id.getName());
                                        texEmployeeJobrole.setText(searchjobrole_byjobroleid.getName());
                                        texEmployeeSalary.setText(String.valueOf(searchGrade_byGradeid.getBasic_Salary()));
                                        texNoofPastSalaryAdvance.setText(String.valueOf(x));
                                    }
                                } else {
                                    Toolkit.getDefaultToolkit().beep();
                                    JOptionPane.showMessageDialog(this, "Employee Job Rile Not Found !!!");
                                }
                            }else {
                                Toolkit.getDefaultToolkit().beep();
                                JOptionPane.showMessageDialog(this, "Employee Job Rile Not Found !!!");
                            }
                        } else {
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(this, "Employee Department Not Found !!!");
                        }
                    } else {
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(this, "Employee Department Not Found !!!");
                    }
                } else {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "Employee Grade Not Found !!!");
                }
            } else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "Employee Not Found !!!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Advance_Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
