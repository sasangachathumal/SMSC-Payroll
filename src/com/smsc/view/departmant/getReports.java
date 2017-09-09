/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.view.departmant;

import com.smsc.db.DBController;
import java.awt.Container;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author smsc
 */
public class getReports extends javax.swing.JFrame {
    int xmouse;
    int ymouse;
    Connection connection;
    /**
     * Creates new form getReports
     */
    public getReports() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            connection = DBController.createConnection().getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(getReports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void print(String parth) throws JRException {
        JasperPrint fillReport = JasperFillManager.fillReport("AllDepartment.jasper", null, connection);
        JasperViewer.viewReport(fillReport, false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        labAllDepartmentsDetails = new javax.swing.JLabel();
        btViewReport = new javax.swing.JButton();
        labAllDepartmentsCustomDetails = new javax.swing.JLabel();
        checkBoxdepartmentName = new javax.swing.JCheckBox();
        CheckBoxnoofEmployees = new javax.swing.JCheckBox();
        btViewReportcustom = new javax.swing.JButton();
        btViewReportone = new javax.swing.JButton();
        labOneDepartmentDetails = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labAllDepartmentsDetails.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labAllDepartmentsDetails.setForeground(new java.awt.Color(0, 0, 102));
        labAllDepartmentsDetails.setText("All Departments In All Details  : ");
        jPanel4.add(labAllDepartmentsDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 320, -1));

        btViewReport.setBackground(new java.awt.Color(102, 102, 102));
        btViewReport.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btViewReport.setText("View Report");
        btViewReport.setBorderPainted(false);
        btViewReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewReportActionPerformed(evt);
            }
        });
        jPanel4.add(btViewReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 140, 30));

        labAllDepartmentsCustomDetails.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labAllDepartmentsCustomDetails.setForeground(new java.awt.Color(0, 0, 102));
        labAllDepartmentsCustomDetails.setText("All Departments In Custom Details  : ");
        jPanel4.add(labAllDepartmentsCustomDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        buttonGroup1.add(checkBoxdepartmentName);
        checkBoxdepartmentName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        checkBoxdepartmentName.setForeground(new java.awt.Color(0, 102, 153));
        checkBoxdepartmentName.setText("Department Name ");
        checkBoxdepartmentName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBoxdepartmentName.setOpaque(false);
        jPanel4.add(checkBoxdepartmentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        buttonGroup1.add(CheckBoxnoofEmployees);
        CheckBoxnoofEmployees.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CheckBoxnoofEmployees.setForeground(new java.awt.Color(0, 102, 153));
        CheckBoxnoofEmployees.setText("No of Employees in each Department");
        CheckBoxnoofEmployees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckBoxnoofEmployees.setOpaque(false);
        jPanel4.add(CheckBoxnoofEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        btViewReportcustom.setBackground(new java.awt.Color(102, 102, 102));
        btViewReportcustom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btViewReportcustom.setText("View Report");
        btViewReportcustom.setBorderPainted(false);
        btViewReportcustom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btViewReportcustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewReportcustomActionPerformed(evt);
            }
        });
        jPanel4.add(btViewReportcustom, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 140, 30));

        btViewReportone.setBackground(new java.awt.Color(102, 102, 102));
        btViewReportone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btViewReportone.setText("View Report");
        btViewReportone.setBorderPainted(false);
        btViewReportone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(btViewReportone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 150, 30));

        labOneDepartmentDetails.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labOneDepartmentDetails.setForeground(new java.awt.Color(0, 0, 102));
        labOneDepartmentDetails.setText("One Department In All Details  : ");
        jPanel4.add(labOneDepartmentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 330, -1));

        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        jButton2.setText("_");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setOpaque(true);
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 692, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/photos/dunya-donen1.gif"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 210, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/photos/back3232.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 7));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 692, 526));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setState(getReports.ICONIFIED);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void btViewReportcustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewReportcustomActionPerformed
        if (checkBoxdepartmentName.isSelected()) {
            
        } else if(CheckBoxnoofEmployees.isSelected()){
            try {
                print("noofEmployee.jrxml");
            } catch (JRException ex) {
                Logger.getLogger(getReports.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select One Option !!");
        }
    }//GEN-LAST:event_btViewReportcustomActionPerformed

    private void btViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewReportActionPerformed
        printrep();
//        try {
//            print("AllDepartment.jasper");
//        } catch (JRException ex) {
//            Logger.getLogger(getReports.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btViewReportActionPerformed

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
            java.util.logging.Logger.getLogger(getReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(getReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(getReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(getReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new getReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxnoofEmployees;
    private javax.swing.JButton btViewReport;
    private javax.swing.JButton btViewReportcustom;
    private javax.swing.JButton btViewReportone;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBoxdepartmentName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labAllDepartmentsCustomDetails;
    private javax.swing.JLabel labAllDepartmentsDetails;
    private javax.swing.JLabel labOneDepartmentDetails;
    // End of variables declaration//GEN-END:variables

    private void printrep() {
        try {
            //JRTableModelDataSource jrTable = new JRTableModelDataSource(dtm1);
            //Connection connection = DBConnection.getDBConnection().getConnection();
            JasperPrint fillReport = JasperFillManager.fillReport("AllDepartment.jasper", null, connection);
            JasperViewer jasperViewer = new JasperViewer(fillReport, true);
            Container contentPane = jasperViewer.getContentPane();
            JDialog jasperView = new JDialog();
            jasperView.setSize(jasperViewer.getSize());
            jasperView.setContentPane(contentPane);
            jasperView.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(getReports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}