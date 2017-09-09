/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.view.damage;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.smsc.controller1.Damage_Controller;
import com.smsc.controller1.Empolyee_Controller;
import com.smsc.model.Damage;
import com.smsc.model.Employee;

/**
 *
 * @author smsc
 */
public class ViewAllDamages extends javax.swing.JFrame {
    private int x=0;
    int xmouse;
    int ymouse;
    /**
     * Creates new form ViewAllDamages
     */
    public ViewAllDamages() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            loadDamage();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ViewAllDamages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void loadDamage() throws ClassNotFoundException, SQLException{
        Damage_Controller damage_Controller=new Damage_Controller();
        ArrayList<Damage> allDamages = damage_Controller.getallDamages();
        DefaultTableModel defaultTableModel=(DefaultTableModel) tabViewAllDamages.getModel();
        defaultTableModel.setRowCount(0);
        for (Damage damage: allDamages) {
            Empolyee_Controller empolyee_Controller=new Empolyee_Controller();
            Employee Search_Employee_by_id = empolyee_Controller.Search_Employee_by_id(damage.getEid());
            Object[]row={Search_Employee_by_id.getLastname(),damage.getDamage_Date(),damage.getLost()};
            defaultTableModel.addRow(row);
            x++;
            if (x==20) {
                break;
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabViewAllDamages = new javax.swing.JTable();
        btReloadDamage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabViewAllDamages.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Damage Date", "Damage Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabViewAllDamages);
        if (tabViewAllDamages.getColumnModel().getColumnCount() > 0) {
            tabViewAllDamages.getColumnModel().getColumn(0).setResizable(false);
            tabViewAllDamages.getColumnModel().getColumn(1).setResizable(false);
            tabViewAllDamages.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 720, 320));

        btReloadDamage.setBackground(new java.awt.Color(102, 102, 102));
        btReloadDamage.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btReloadDamage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/Attendance/refresh.png"))); // NOI18N
        btReloadDamage.setText("Reload");
        btReloadDamage.setBorderPainted(false);
        btReloadDamage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btReloadDamage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReloadDamageActionPerformed(evt);
            }
        });
        jPanel1.add(btReloadDamage, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 140, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View All Damages ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 470, 40));

        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SMSC Payroll");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 250, -1));

        jButton2.setText("_");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 102, 153));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 740, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/photos/back3232.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 7));
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 742, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btReloadDamageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReloadDamageActionPerformed
        try {
            Damage_Controller damage_Controller=new Damage_Controller();
            ArrayList<Damage> allDamages = damage_Controller.getallDamages();
            DefaultTableModel defaultTableModel=(DefaultTableModel) tabViewAllDamages.getModel();
            defaultTableModel.setRowCount(0);
            for (Damage damage: allDamages) {
                Empolyee_Controller empolyee_Controller=new Empolyee_Controller();
                Employee Search_Employee_by_id = empolyee_Controller.Search_Employee_by_id(damage.getEid());
                Object[]row={Search_Employee_by_id.getLastname(),damage.getDamage_Date(),damage.getLost()};
                defaultTableModel.addRow(row);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ViewAllDamages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btReloadDamageActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setState(ViewAllDamages.ICONIFIED);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jLabel2MouseDragged

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
            java.util.logging.Logger.getLogger(ViewAllDamages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllDamages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllDamages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllDamages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllDamages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReloadDamage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabViewAllDamages;
    // End of variables declaration//GEN-END:variables
}