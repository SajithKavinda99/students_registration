/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package studentregister;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;



public final class internalupdate extends javax.swing.JInternalFrame {

   Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int SelectedStudentID;
    private String ImagePath;
    public internalupdate() throws SQLException {
        initComponents();
        table();
        
    }
    
    void table(){
        try {
            conn = DBConnection.connect();
            String GetData = "SELECT StudentID, FullName AS `Full Name` , `NIC Number` FROM students";
            pst = (PreparedStatement) conn.prepareStatement(GetData);
            rs = pst.executeQuery();
            
            updatetable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(internalupdate.class.getName()).log(Level.SEVERE, null, ex);
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

        usernamebox = new javax.swing.JTextField();
        login3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        login9 = new javax.swing.JButton();
        updatefullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateaddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        updatenic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        updateemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        updatemobile = new javax.swing.JTextField();
        login10 = new javax.swing.JButton();
        login11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        updatepicture = new javax.swing.JLabel();
        login12 = new javax.swing.JButton();
        login13 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        updatetable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        internalsearchbox = new javax.swing.JTextField();

        usernamebox.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        usernamebox.setForeground(new java.awt.Color(0, 51, 102));
        usernamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameboxActionPerformed(evt);
            }
        });

        login3.setBackground(new java.awt.Color(0, 51, 102));
        login3.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        login3.setForeground(new java.awt.Color(255, 255, 255));
        login3.setText("Search");
        login3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Students Data");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        login9.setBackground(new java.awt.Color(0, 51, 102));
        login9.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        login9.setForeground(new java.awt.Color(255, 255, 255));
        login9.setText("Delete");
        login9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login2ActionPerformed(evt);
            }
        });

        updatefullname.setFont(new java.awt.Font("Book Antiqua", 3, 16)); // NOI18N
        updatefullname.setForeground(new java.awt.Color(0, 51, 102));
        updatefullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatefullnameusernamebox1ActionPerformed(evt);
            }
        });
        updatefullname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                updatefullnameKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Full Name");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Address");

        updateaddress.setFont(new java.awt.Font("Book Antiqua", 3, 16)); // NOI18N
        updateaddress.setForeground(new java.awt.Color(0, 51, 102));
        updateaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateaddressusernamebox1ActionPerformed(evt);
            }
        });
        updateaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                updateaddressKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("NIC Number");

        updatenic.setFont(new java.awt.Font("Book Antiqua", 3, 16)); // NOI18N
        updatenic.setForeground(new java.awt.Color(0, 51, 102));
        updatenic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatenicusernamebox1ActionPerformed(evt);
            }
        });
        updatenic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                updatenicKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("E-mail");

        updateemail.setFont(new java.awt.Font("Book Antiqua", 3, 16)); // NOI18N
        updateemail.setForeground(new java.awt.Color(0, 51, 102));
        updateemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateemailusernamebox1ActionPerformed(evt);
            }
        });
        updateemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                updateemailKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Mobile");

        updatemobile.setFont(new java.awt.Font("Book Antiqua", 3, 16)); // NOI18N
        updatemobile.setForeground(new java.awt.Color(0, 51, 102));
        updatemobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatemobileusernamebox1ActionPerformed(evt);
            }
        });
        updatemobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                updatemobileKeyReleased(evt);
            }
        });

        login10.setBackground(new java.awt.Color(0, 51, 102));
        login10.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        login10.setForeground(new java.awt.Color(255, 255, 255));
        login10.setText("Update");
        login10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login10login2ActionPerformed(evt);
            }
        });

        login11.setBackground(new java.awt.Color(0, 51, 102));
        login11.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        login11.setForeground(new java.awt.Color(255, 255, 255));
        login11.setText("Clear");
        login11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login11login2ActionPerformed(evt);
            }
        });

        updatepicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updatepicture, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updatepicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        login12.setBackground(new java.awt.Color(0, 51, 102));
        login12.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        login12.setForeground(new java.awt.Color(255, 255, 255));
        login12.setText("Delete All");
        login12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login12login2ActionPerformed(evt);
            }
        });

        login13.setBackground(new java.awt.Color(0, 51, 102));
        login13.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        login13.setForeground(new java.awt.Color(255, 255, 255));
        login13.setText("Upload");
        login13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login13login2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(login10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatemobile, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(login13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateemail, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updatefullname, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updatenic, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(updatefullname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(updateaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(updatenic, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addComponent(updateemail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(login13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatemobile, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        updatetable.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        updatetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        updatetable.setRowHeight(40);
        updatetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatetableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(updatetable);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter Student ID or Name");

        internalsearchbox.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        internalsearchbox.setForeground(new java.awt.Color(0, 51, 102));
        internalsearchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamebox1ActionPerformed(evt);
            }
        });
        internalsearchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                internalsearchboxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(internalsearchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(internalsearchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

    private void usernameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameboxActionPerformed

    private void login3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login3ActionPerformed

    private void usernamebox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamebox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamebox1ActionPerformed

    private void internalsearchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_internalsearchboxKeyReleased
        
        try {
            String UserInput = internalsearchbox.getText();
            
            conn = DBConnection.connect();
            String GetData = "SELECT StudentID, FullName AS `Full Name`, `NIC Number`, Address, Email, Mobile FROM students WHERE `NIC Number` LIKE '%" + UserInput + "%' OR FullName LIKE '%" + UserInput + "%'";
            pst = (PreparedStatement) conn.prepareStatement(GetData);
            //pst.setString(1, UserInput.trim());
            ResultSet search_rs = pst.executeQuery();
            updatetable.setModel(DbUtils.resultSetToTableModel(search_rs));
        } catch (SQLException ex) {
            Logger.getLogger(internalupdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_internalsearchboxKeyReleased

    private void login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login2ActionPerformed

       String message = "Do you really want to delete this record";
        int reply = JOptionPane.showConfirmDialog(null, message,"Delete",JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION){
          if(SelectedStudentID>0){
            try {
                 String delQuery = "DELETE FROM students WHERE StudentID =?";
                pst = (PreparedStatement) conn.prepareStatement(delQuery);
                pst.setInt(1, SelectedStudentID);
                pst.execute();
                table();
                updatefullname.setText(null);
        updateaddress.setText(null);
        updatenic.setText(null);
        updateemail.setText(null);
        updatemobile.setText(null);
                
            } catch (SQLException ex) {
                Logger.getLogger(internalupdate.class.getName()).log(Level.SEVERE, null, ex);
            }
          }else{
                    
                    }
               
          
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_login2ActionPerformed

    private void updatefullnameusernamebox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatefullnameusernamebox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatefullnameusernamebox1ActionPerformed

    private void updatefullnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updatefullnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_updatefullnameKeyReleased

    private void updateaddressusernamebox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateaddressusernamebox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateaddressusernamebox1ActionPerformed

    private void updateaddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateaddressKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_updateaddressKeyReleased

    private void updatenicusernamebox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatenicusernamebox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatenicusernamebox1ActionPerformed

    private void updatenicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updatenicKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_updatenicKeyReleased

    private void updateemailusernamebox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateemailusernamebox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateemailusernamebox1ActionPerformed

    private void updateemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateemailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_updateemailKeyReleased

    private void updatemobileusernamebox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatemobileusernamebox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatemobileusernamebox1ActionPerformed

    private void updatemobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updatemobileKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_updatemobileKeyReleased

    private void login10login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login10login2ActionPerformed
        
        try {
            String getname = updatefullname.getText();
            String getaddress = updateaddress.getText();
            String getnic = updatenic.getText();
            String getemail = updateemail.getText();
            int getmobile = Integer.parseInt( updatemobile.getText());
            
            
            String updateQuery = "UPDATE students SET FullName='" + getname + "', Address='" + getaddress + "', `NIC Number`='" + getnic + "', Email='" + getemail + "', Mobile='" + getmobile + "' WHERE StudentID = '" + SelectedStudentID + "'";
            pst = (PreparedStatement) conn.prepareStatement(updateQuery);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Record Update");
            table();
            updatefullname.setText(null);
            updateaddress.setText(null);
            updatenic.setText(null);
            updateemail.setText(null);
            updatemobile.setText(null);
            
        } catch (SQLException ex) {
            Logger.getLogger(internalupdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_login10login2ActionPerformed

    private void login11login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login11login2ActionPerformed
        
        updatefullname.setText(null);
        updateaddress.setText(null);
        updatenic.setText(null);
        updateemail.setText(null);
        updatemobile.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_login11login2ActionPerformed

    private void updatetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatetableMouseClicked
        
          try {
            int rowindex = updatetable.getSelectedRow();
            SelectedStudentID = (int) updatetable.getModel().getValueAt(rowindex, 0);
            
            String GetRowData = "Select * From students WHERE StudentID="+SelectedStudentID;
            pst = (PreparedStatement) conn.prepareStatement(GetRowData);
            rs = pst.executeQuery();
            
            if(rs.next()==true){
                updatefullname.setText(rs.getString("FullName"));
                updateaddress.setText(rs.getString("Address"));
                updatenic.setText(rs.getString("NIC Number"));
                updateemail.setText(rs.getString("Email"));
                updatemobile.setText(rs.getString("Mobile"));
                
//                InputStream img = rs.getBinaryStream("Image");
//                manageimg.setIcon((Icon)img);
            }
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(internalupdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_updatetableMouseClicked

    private void login12login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login12login2ActionPerformed
        
        String message = "Do you really want to delete all records?";
int reply = JOptionPane.showConfirmDialog(null, message,"Delete All Records",JOptionPane.YES_NO_OPTION);
if(reply == JOptionPane.YES_OPTION){
    try {
        String delAllQuery = "DELETE FROM students";
        pst = (PreparedStatement) conn.prepareStatement(delAllQuery);
        pst.executeUpdate(); // Use executeUpdate() for DELETE queries
        table(); // Assuming table() updates the UI to reflect changes
    } catch (SQLException ex) {
        Logger.getLogger(internalupdate.class.getName()).log(Level.SEVERE, null, ex);
    }
}

        // TODO add your handling code here:
    }//GEN-LAST:event_login12login2ActionPerformed

    private void login13login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login13login2ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_login13login2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField internalsearchbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton login10;
    private javax.swing.JButton login11;
    private javax.swing.JButton login12;
    private javax.swing.JButton login13;
    private javax.swing.JButton login3;
    private javax.swing.JButton login9;
    private javax.swing.JTextField updateaddress;
    private javax.swing.JTextField updateemail;
    private javax.swing.JTextField updatefullname;
    private javax.swing.JTextField updatemobile;
    private javax.swing.JTextField updatenic;
    private javax.swing.JLabel updatepicture;
    private javax.swing.JTable updatetable;
    private javax.swing.JTextField usernamebox;
    // End of variables declaration//GEN-END:variables

    
}
