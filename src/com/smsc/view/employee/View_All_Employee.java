/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsc.view.employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.smsc.controller1.Empolyee_Controller;
import com.smsc.controller1.Grade_Controller;
import com.smsc.model.Employee;
import com.smsc.model.Grade;

/**
 *
 * @author smsc
 */
public class View_All_Employee extends javax.swing.JFrame {
int x=0;
    /**
     * Creates new form View_All_Employee
     */
    public View_All_Employee() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            ArrayList<Employee> employees = getEmployee();
            DefaultTableModel dtm = (DefaultTableModel) tabBasicdetails.getModel();
            dtm.setRowCount(0);
            for (Employee employee : employees) {
                Object[] row = {employee.getEid(), employee.getSurename(), employee.getLastname(), employee.getNic_No(), employee.getDate()};
                dtm.addRow(row);
                x++;
                if (x==20) {
                    break;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(View_All_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Employee> getEmployee() throws ClassNotFoundException, SQLException {
        Empolyee_Controller controller = new Empolyee_Controller();
        ArrayList<Employee> _all_Employee = controller.get_all_Employee();
        return _all_Employee;
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
        jPanel2 = new javax.swing.JPanel();
        labEmployeeTrlrphone = new javax.swing.JLabel();
        labGradename = new javax.swing.JLabel();
        labEmployeeAddress = new javax.swing.JLabel();
        TexGrade = new javax.swing.JTextField();
        texEmployeetelephone = new javax.swing.JTextField();
        TexEmployeeaddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabBasicdetails = new javax.swing.JTable();
        reloadButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Employees", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        labEmployeeTrlrphone.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labEmployeeTrlrphone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEmployeeTrlrphone.setText("Employee Telephone  : ");

        labGradename.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labGradename.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labGradename.setText("Grade Name  : ");

        labEmployeeAddress.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labEmployeeAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEmployeeAddress.setText("Employee Address  : ");

        TexGrade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        texEmployeetelephone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        TexEmployeeaddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        tabBasicdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee id", "Surname", "Lastname", "NIC", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabBasicdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabBasicdetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabBasicdetails);
        if (tabBasicdetails.getColumnModel().getColumnCount() > 0) {
            tabBasicdetails.getColumnModel().getColumn(0).setResizable(false);
            tabBasicdetails.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabBasicdetails.getColumnModel().getColumn(1).setResizable(false);
            tabBasicdetails.getColumnModel().getColumn(2).setResizable(false);
            tabBasicdetails.getColumnModel().getColumn(3).setResizable(false);
            tabBasicdetails.getColumnModel().getColumn(4).setResizable(false);
        }

        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(labGradename, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TexGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(labEmployeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TexEmployeeaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(labEmployeeTrlrphone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(texEmployeetelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labGradename, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labEmployeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexEmployeeaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labEmployeeTrlrphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texEmployeetelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        reloadButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        reloadButton.setForeground(new java.awt.Color(0, 153, 204));
        reloadButton.setText("Reload");
        reloadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(reloadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(reloadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
        try {
            ArrayList<Employee> employees = getEmployee();
            DefaultTableModel dtm = (DefaultTableModel) tabBasicdetails.getModel();
            dtm.setRowCount(0);
            for (Employee employee : employees) {
                Object[] row = {employee.getEid(), employee.getSurename(), employee.getLastname(), employee.getNic_No(), employee.getDate()};
                dtm.addRow(row);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(View_All_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void tabBasicdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBasicdetailsMouseClicked
        int selectedRow = tabBasicdetails.getSelectedRow();
        String id = tabBasicdetails.getValueAt(selectedRow, 0).toString();
       /* Empolyee_Controller controller=new Empolyee_Controller();
            try {
            Employee Search_Employee_by_id = controller.Search_Employee_by_id(id);
            Grade_Controller controller1=new Grade_Controller();
            Grade searchGrade_byGradeid = controller1.searchGrade_byGradeid(Search_Employee_by_id.getGid());
                if (searchGrade_byGradeid != null) {
                    texEmployeetelephone.setText(Search_Employee_by_id.getTelephone());
                    TexEmployeeaddress.setText(Search_Employee_by_id.getAddress());
                    TexGrade.setText(searchGrade_byGradeid.getName());
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(View_All_Employee.class.getName()).log(Level.SEVERE, null, ex);
            }*/

    }//GEN-LAST:event_tabBasicdetailsMouseClicked

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
            java.util.logging.Logger.getLogger(View_All_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_All_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_All_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_All_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_All_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TexEmployeeaddress;
    private javax.swing.JTextField TexGrade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labEmployeeAddress;
    private javax.swing.JLabel labEmployeeTrlrphone;
    private javax.swing.JLabel labGradename;
    private javax.swing.JButton reloadButton;
    private javax.swing.JTable tabBasicdetails;
    private javax.swing.JTextField texEmployeetelephone;
    // End of variables declaration//GEN-END:variables
}
