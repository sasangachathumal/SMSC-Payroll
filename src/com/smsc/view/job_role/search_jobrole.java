/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.view.job_role;

import com.smsc.controller1.Jobrole_Controller;
import com.smsc.model.Job_Role;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author smsc
 */
public class search_jobrole extends javax.swing.JFrame {
    int xmouse;
    int ymouse;
    private String JRID;
    private DefaultTableModel defaultTableModel;
    int selectedRow;
    /**
     * Creates new form search_jobrole
     */
    public search_jobrole() {
        initComponents();
        setLocationRelativeTo(null);
        loadtable();
        texName.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchjobrolePanel = new javax.swing.JPanel();
        texName = new javax.swing.JTextField();
        jrnameLabel1 = new javax.swing.JLabel();
        jrpensionageLabel1 = new javax.swing.JLabel();
        texAge = new javax.swing.JTextField();
        btUpdate = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabView = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        searchjobrolePanel.setBackground(new java.awt.Color(255, 255, 255));
        searchjobrolePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texNameActionPerformed(evt);
            }
        });
        searchjobrolePanel.add(texName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 300, 30));

        jrnameLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrnameLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jrnameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jrnameLabel1.setText("Job Role Name  :  ");
        searchjobrolePanel.add(jrnameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 190, -1));

        jrpensionageLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrpensionageLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jrpensionageLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jrpensionageLabel1.setText("Pension_Age  :  ");
        searchjobrolePanel.add(jrpensionageLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 190, -1));
        searchjobrolePanel.add(texAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 180, 30));

        btUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btUpdate.setText("Update Job Role");
        btUpdate.setBorderPainted(false);
        btUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });
        searchjobrolePanel.add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 170, 50));

        btRemove.setBackground(new java.awt.Color(102, 102, 102));
        btRemove.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btRemove.setText("Remove Job Role");
        btRemove.setBorderPainted(false);
        btRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });
        searchjobrolePanel.add(btRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 170, 50));

        tabView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Role Name", "Pension Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabViewMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabView);

        searchjobrolePanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 680, 200));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        searchjobrolePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        jButton2.setText("_");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        searchjobrolePanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

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
        searchjobrolePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 740, 25));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Search Job Role");
        searchjobrolePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 720, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        searchjobrolePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 700, 320));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/photos/back3232.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 7));
        searchjobrolePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 742, 544));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchjobrolePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchjobrolePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setState(search_jobrole.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabViewMouseClicked
        getvalue();
    }//GEN-LAST:event_tabViewMouseClicked

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        getIfUpdate();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        getIfRemove();
    }//GEN-LAST:event_btRemoveActionPerformed

    private void texNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texNameActionPerformed
        texAge.requestFocus();
    }//GEN-LAST:event_texNameActionPerformed

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
            java.util.logging.Logger.getLogger(search_jobrole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_jobrole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_jobrole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_jobrole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_jobrole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRemove;
    private javax.swing.JButton btUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jrnameLabel1;
    private javax.swing.JLabel jrpensionageLabel1;
    private javax.swing.JPanel searchjobrolePanel;
    private javax.swing.JTable tabView;
    private javax.swing.JTextField texAge;
    private javax.swing.JTextField texName;
    // End of variables declaration//GEN-END:variables


    private void loadtable() {
        try {
            ArrayList<Job_Role> alljobrole = new Jobrole_Controller().getalljobrole();
            defaultTableModel=(DefaultTableModel) tabView.getModel();
            defaultTableModel.setRowCount(0);
            for(Job_Role job_Role : alljobrole){
                Object [] row={job_Role.getName(),job_Role.getPension_Age()};
                defaultTableModel.addRow(row);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(search_jobrole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getvalue() {
        selectedRow = tabView.getSelectedRow();
        String name = tabView.getValueAt(selectedRow, 0).toString();
        try {
            Job_Role searchjobrole_byjobroleName = new Jobrole_Controller().searchjobrole_byjobroleName(name);
            JRID=searchjobrole_byjobroleName.getJrid();
            texAge.setText(searchjobrole_byjobroleName.getPension_Age());
            texName.setText(searchjobrole_byjobroleName.getName());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(search_jobrole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getIfUpdate() {
        if (selectedRow > -1) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(this, "You want to update this Job role details !!!");
            if (showConfirmDialog == JOptionPane.YES_OPTION) {
                updatejobrole();
            } else {
                
            }
        }else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "Please Select a Row !!!");
        }
    }

    private void updatejobrole() {
        String name = texName.getText();
        String age = texAge.getText();
        Job_Role job_Role=new Job_Role(JRID, name, age);
        try {
            int updateJobRole = new Jobrole_Controller().updateJobRole(job_Role);
            if (updateJobRole > 0) {
                JOptionPane.showMessageDialog(this, "Job Role Details Update Success !!!");
                texAge.setText("");
                texName.setText("");
                loadtable();
            } else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "Job Role Details Update Fail !!! \n Please Check Input Details and Try Again !!!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(search_jobrole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getIfRemove() {
        if (selectedRow > -1) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(this, "You want to remove this Job role !!!");
            if (showConfirmDialog == JOptionPane.YES_OPTION) {
                removejobrole();
            } else {
                
            }
        }else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "Please Select a Row !!!");
        }
    }

    private void removejobrole() {
        try {
            int remoreJobrole = new Jobrole_Controller().remoreJobrole(JRID);
            if (remoreJobrole > 0) {
                JOptionPane.showMessageDialog(this, "Job Role remove Success !!!");
                texAge.setText("");
                texName.setText("");
                loadtable();
            } else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(this, "Job Role Details remove Fail !!! \n Please Check Input Details and Try Again !!!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(search_jobrole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
