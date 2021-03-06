/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.view.departmant;

import com.smsc.controller1.Department_Controller;
import com.smsc.model.Department;
import com.smsc.other.IdGenerator;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author smsc
 */
public class input_department extends javax.swing.JFrame {
    int xmouse;
    int ymouse;
    /**
     * Creates new form input_department
     */
    public input_department() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            loadid();
            setdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(input_department.class.getName()).log(Level.SEVERE, null, ex);
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

        adddepartmentPanel = new javax.swing.JPanel();
        didLabel = new javax.swing.JLabel();
        didText = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        departmentnameText = new javax.swing.JTextField();
        buildingText = new javax.swing.JTextField();
        adddepartmentButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        departmentdetailTabel = new javax.swing.JTable();
        buildingLabel = new javax.swing.JLabel();
        departmentnameLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        adddepartmentPanel.setBackground(new java.awt.Color(255, 255, 255));
        adddepartmentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        didLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        didLabel.setForeground(new java.awt.Color(0, 0, 102));
        didLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        didLabel.setText("Department id  : ");
        adddepartmentPanel.add(didLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 180, -1));

        didText.setEditable(false);
        didText.setBackground(new java.awt.Color(0, 153, 204));
        didText.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        didText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                didTextActionPerformed(evt);
            }
        });
        adddepartmentPanel.add(didText, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 120, 30));

        dateLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 0, 102));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateLabel.setText("Date  :  ");
        adddepartmentPanel.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 110, -1));

        dateText.setEditable(false);
        dateText.setBackground(new java.awt.Color(0, 153, 204));
        dateText.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        adddepartmentPanel.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 140, 30));

        departmentnameText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        departmentnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentnameTextActionPerformed(evt);
            }
        });
        adddepartmentPanel.add(departmentnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 330, 40));

        buildingText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        buildingText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingTextActionPerformed(evt);
            }
        });
        adddepartmentPanel.add(buildingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 330, 40));

        adddepartmentButton.setBackground(new java.awt.Color(102, 102, 102));
        adddepartmentButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        adddepartmentButton.setText(" Input Department");
        adddepartmentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adddepartmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddepartmentButtonActionPerformed(evt);
            }
        });
        adddepartmentPanel.add(adddepartmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 180, 40));
        adddepartmentPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 860, 10));

        departmentdetailTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department Name", "Department Building"
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
        jScrollPane1.setViewportView(departmentdetailTabel);

        adddepartmentPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 660, 180));

        buildingLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        buildingLabel.setForeground(new java.awt.Color(0, 0, 102));
        buildingLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        buildingLabel.setText("Department Building  :  ");
        adddepartmentPanel.add(buildingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 240, 40));

        departmentnameLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        departmentnameLabel.setForeground(new java.awt.Color(0, 0, 102));
        departmentnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        departmentnameLabel.setText("Department Name  :  ");
        adddepartmentPanel.add(departmentnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 240, 40));

        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        adddepartmentPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, -1));

        jButton2.setText("_");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        adddepartmentPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input New Department");
        adddepartmentPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 860, 50));

        jLabel2.setBackground(new java.awt.Color(0, 102, 153));
        jLabel2.setOpaque(true);
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
        adddepartmentPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 860, 25));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/photos/dunya-donen1.gif"))); // NOI18N
        adddepartmentPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 250, 250));

        btSearch.setBackground(new java.awt.Color(102, 102, 102));
        btSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btSearch.setText("Search Department");
        btSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        adddepartmentPanel.add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smsc/view/photos/back3232.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 7));
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
        adddepartmentPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 864, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adddepartmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adddepartmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void didTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_didTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_didTextActionPerformed

    private void departmentnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentnameTextActionPerformed
        buildingText.requestFocus();
    }//GEN-LAST:event_departmentnameTextActionPerformed

    private void buildingTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buildingTextActionPerformed

    private void adddepartmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddepartmentButtonActionPerformed
        inputDepartment();
    }//GEN-LAST:event_adddepartmentButtonActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setState(input_department.ICONIFIED);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        new view_department().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btSearchActionPerformed

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
            java.util.logging.Logger.getLogger(input_department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input_department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adddepartmentButton;
    private javax.swing.JPanel adddepartmentPanel;
    private javax.swing.JButton btSearch;
    private javax.swing.JLabel buildingLabel;
    private javax.swing.JTextField buildingText;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateText;
    private javax.swing.JTable departmentdetailTabel;
    private javax.swing.JLabel departmentnameLabel;
    private javax.swing.JTextField departmentnameText;
    private javax.swing.JLabel didLabel;
    private javax.swing.JTextField didText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void loadid() throws ClassNotFoundException, SQLException {
        String newId = IdGenerator.getNewId("Department", "Did", "D");
        didText.setText(newId);
    }

    private void setdate() {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
        String format1 = format.format(date);
        dateText.setText(format1);
    }

    private void inputDepartment() {
        String id = didText.getText();
        String date = dateText.getText();
        String name = departmentnameText.getText();
        String building = buildingText.getText();
        Department department=new Department(id, name, building);
        Department_Controller controller=new Department_Controller();
        try {
            int Add_Department = controller.Add_Department(department);
            if (Add_Department > 0) {
                DefaultTableModel dtm=(DefaultTableModel) departmentdetailTabel.getModel();
                JOptionPane.showMessageDialog(this,"Department Input Success !");
                Object[]row={department.getName(),department.getBuilding()};
                dtm.addRow(row);
            } else {
                JOptionPane.showMessageDialog(this, "Department Input Fail !");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Manage_Department.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
