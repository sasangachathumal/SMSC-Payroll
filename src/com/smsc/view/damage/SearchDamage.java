/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.view.damage;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.smsc.controller1.Damage_Controller;
import com.smsc.controller1.Damage_Description_Controller;
import com.smsc.controller1.Empolyee_Controller;
import com.smsc.model.Damage;
import com.smsc.model.Damage_Description;
import com.smsc.model.Employee;
import com.smsc.other.Validation;

/**
 *
 * @author smsc
 */
public class SearchDamage extends javax.swing.JFrame {
    int xmouse;
    int ymouse;
    /**
     * Creates new form SearchDamage
     */
    public SearchDamage() {
        initComponents();
        setLocationRelativeTo(null);
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
        labEnterEmployeeNic = new javax.swing.JLabel();
        searchFieldEmployeeNic = new org.jdesktop.swingx.JXSearchField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabViewDamage = new javax.swing.JTable();
        labDamageDescription = new javax.swing.JLabel();
        texDamageDescription = new javax.swing.JTextField();
        btViewAllDamage = new javax.swing.JButton();
        btRemovaDamage = new javax.swing.JButton();
        btUpdateDamage = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        texDamageCount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labEnterEmployeeNic.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labEnterEmployeeNic.setForeground(new java.awt.Color(0, 0, 102));
        labEnterEmployeeNic.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEnterEmployeeNic.setText("Enter Employee Nic  : ");
        jPanel1.add(labEnterEmployeeNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, -1));

        searchFieldEmployeeNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldEmployeeNicActionPerformed(evt);
            }
        });
        searchFieldEmployeeNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldEmployeeNicKeyReleased(evt);
            }
        });
        jPanel1.add(searchFieldEmployeeNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 280, -1));

        tabViewDamage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Damage ID", "Damage Date", "Damage Cost"
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
        tabViewDamage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabViewDamageMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabViewDamage);
        if (tabViewDamage.getColumnModel().getColumnCount() > 0) {
            tabViewDamage.getColumnModel().getColumn(0).setResizable(false);
            tabViewDamage.getColumnModel().getColumn(1).setResizable(false);
            tabViewDamage.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 710, 190));

        labDamageDescription.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labDamageDescription.setForeground(new java.awt.Color(0, 0, 102));
        labDamageDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labDamageDescription.setText("Damage Description  : ");
        jPanel1.add(labDamageDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 270, -1));

        texDamageDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(texDamageDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 532, 32));

        btViewAllDamage.setBackground(new java.awt.Color(102, 102, 102));
        btViewAllDamage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btViewAllDamage.setText("View All Damages");
        btViewAllDamage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btViewAllDamage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewAllDamageActionPerformed(evt);
            }
        });
        jPanel1.add(btViewAllDamage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 140, 40));

        btRemovaDamage.setBackground(new java.awt.Color(102, 102, 102));
        btRemovaDamage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btRemovaDamage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/Attendance/delete.png"))); // NOI18N
        btRemovaDamage.setText("Remove");
        btRemovaDamage.setBorderPainted(false);
        btRemovaDamage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRemovaDamage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemovaDamageActionPerformed(evt);
            }
        });
        jPanel1.add(btRemovaDamage, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 120, 40));

        btUpdateDamage.setBackground(new java.awt.Color(102, 102, 102));
        btUpdateDamage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btUpdateDamage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/Attendance/arrow_up.png"))); // NOI18N
        btUpdateDamage.setText("Update");
        btUpdateDamage.setBorderPainted(false);
        btUpdateDamage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btUpdateDamage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateDamageActionPerformed(evt);
            }
        });
        jPanel1.add(btUpdateDamage, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 120, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SMSC Payroll");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 250, -1));

        texDamageCount.setEditable(false);
        texDamageCount.setBackground(new java.awt.Color(0, 153, 204));
        texDamageCount.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        texDamageCount.setForeground(new java.awt.Color(153, 0, 0));
        texDamageCount.setBorder(null);
        jPanel1.add(texDamageCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 700, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Employee Damages");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 742, 520));

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

    private void btUpdateDamageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateDamageActionPerformed
        updateDamage();
    }//GEN-LAST:event_btUpdateDamageActionPerformed

    private void tabViewDamageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabViewDamageMouseClicked
        getvalue();
    }//GEN-LAST:event_tabViewDamageMouseClicked

    private void searchFieldEmployeeNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldEmployeeNicActionPerformed
        searchDamage();
    }//GEN-LAST:event_searchFieldEmployeeNicActionPerformed

    private void searchFieldEmployeeNicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldEmployeeNicKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            Validation.validateNIC(searchFieldEmployeeNic);
        }
    }//GEN-LAST:event_searchFieldEmployeeNicKeyReleased

    private void btRemovaDamageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemovaDamageActionPerformed
        removeDamage();
    }//GEN-LAST:event_btRemovaDamageActionPerformed

    private void btViewAllDamageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewAllDamageActionPerformed
        new ViewAllDamages().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btViewAllDamageActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setState(SearchDamage.ICONIFIED);
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
            java.util.logging.Logger.getLogger(SearchDamage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchDamage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchDamage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchDamage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDamage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRemovaDamage;
    private javax.swing.JButton btUpdateDamage;
    private javax.swing.JButton btViewAllDamage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labDamageDescription;
    private javax.swing.JLabel labEnterEmployeeNic;
    private org.jdesktop.swingx.JXSearchField searchFieldEmployeeNic;
    private javax.swing.JTable tabViewDamage;
    private javax.swing.JTextField texDamageCount;
    private javax.swing.JTextField texDamageDescription;
    // End of variables declaration//GEN-END:variables

    private void updateDamage() {
        try {
            int selectedRow = tabViewDamage.getSelectedRow();
            String damageid = String.valueOf(tabViewDamage.getValueAt(selectedRow, 0));
            Damage_Description_Controller damage_Description_Controller=new Damage_Description_Controller();
            Damage_Description searchDescription_byDamageid = damage_Description_Controller.searchDescription_byDamageid(damageid);
            if (searchDescription_byDamageid != null) {
                Damage_Description damage_Description=new Damage_Description(searchDescription_byDamageid.getDdid(), damageid, texDamageDescription.getText());
                int updateDescription = damage_Description_Controller.updateDescription(damage_Description);
                if (updateDescription > 0) {
                    JOptionPane.showMessageDialog(this, "Damage Update Scuccess !!!");
                } else {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(this, "Damage Update Fail !!!");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SearchDamage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void removeDamage() {
        try {
            int selectedRow = tabViewDamage.getSelectedRow();
            String damageid = String.valueOf(tabViewDamage.getValueAt(selectedRow, 0));
            Damage_Controller damage_Controller=new Damage_Controller();
            int deleteDamage = damage_Controller.deleteDamage(damageid);
            if (deleteDamage > 0) {
                JOptionPane.showMessageDialog(this, "Damage Remove Scuccess !!!");
            } else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "Damage Remove Fail !!!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SearchDamage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getvalue() {
        int selectedRow = tabViewDamage.getSelectedRow();
        String id=tabViewDamage.getValueAt(selectedRow, 0).toString();
        Damage_Description_Controller controller=new Damage_Description_Controller();
        try {
            Damage_Description searchDescription_byDamageid = controller.searchDescription_byDamageid(id);
            if (searchDescription_byDamageid != null) {
                texDamageDescription.setText(searchDescription_byDamageid.getDescription());
            } else {
                JOptionPane.showMessageDialog(this,"\nNo Description To This Damage !\n");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SearchDamage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchDamage() {
        try {
            Empolyee_Controller empolyee_Controller=new Empolyee_Controller();
            Employee Search_Employee_by_Nic = empolyee_Controller.Search_Employee_by_Nic(searchFieldEmployeeNic.getText());
            if (Search_Employee_by_Nic != null) {
                Damage_Controller damage_Controller = new Damage_Controller();
                ArrayList<Damage> searchDamage_byEmployeeID = damage_Controller.searchDamage_byEmployeeID(Search_Employee_by_Nic.getEid());
                int x=0;
                DefaultTableModel dtm=(DefaultTableModel) tabViewDamage.getModel();
                dtm.setRowCount(0);
                for(Damage damage : searchDamage_byEmployeeID){
                    Object[] row={damage.getDaid(),damage.getDamage_Date(),damage.getLost()};
                    dtm.addRow(row);
                    x++;
                }
                texDamageCount.setText("This Employee Have "+x+" Damages");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SearchDamage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}