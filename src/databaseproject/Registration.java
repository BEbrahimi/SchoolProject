/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package databaseproject;

import javax.swing.*;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Bashir Ebrahimi
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        rbmale.setSelected(true);

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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtRname = new javax.swing.JTextField();
        txtRLname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRusername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordR = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        RePasswordR = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbfemale = new javax.swing.JRadioButton();
        rbmale = new javax.swing.JRadioButton();
        btnReset = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Account Creation");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_close_window_24px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("First Name:");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtRname.setBackground(new java.awt.Color(255, 255, 255));
        txtRname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtRname.setForeground(new java.awt.Color(0, 102, 102));
        txtRname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 102)));
        jPanel2.add(txtRname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 210, -1));

        txtRLname.setBackground(new java.awt.Color(255, 255, 255));
        txtRLname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtRLname.setForeground(new java.awt.Color(0, 102, 102));
        txtRLname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 102)));
        jPanel2.add(txtRLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 210, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Last Name:");
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtRusername.setBackground(new java.awt.Color(255, 255, 255));
        txtRusername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtRusername.setForeground(new java.awt.Color(0, 102, 102));
        txtRusername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 102)));
        txtRusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRusernameKeyTyped(evt);
            }
        });
        jPanel2.add(txtRusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 210, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Password:");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        passwordR.setBackground(new java.awt.Color(255, 255, 255));
        passwordR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordR.setForeground(new java.awt.Color(0, 102, 102));
        passwordR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 102)));
        jPanel2.add(passwordR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 210, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("User Name:");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        RePasswordR.setBackground(new java.awt.Color(255, 255, 255));
        RePasswordR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RePasswordR.setForeground(new java.awt.Color(0, 102, 102));
        RePasswordR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 102)));
        jPanel2.add(RePasswordR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Gender");
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Go Back to login form");
        jLabel9.setToolTipText("");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        rbfemale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbfemale.setForeground(new java.awt.Color(0, 102, 102));
        rbfemale.setText("Female");
        jPanel2.add(rbfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        rbmale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbmale.setForeground(new java.awt.Color(0, 102, 102));
        rbmale.setText("Male");
        jPanel2.add(rbmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 102, 102));
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 140, 40));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 102, 102));
        btnRegister.setText("Create Account");
        btnRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 140, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("RePassword:");
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 340, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        new Login().show();
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String name = txtRname.getText().trim();
        String lname = txtRLname.getText().trim();
        String username = txtRusername.getText().trim();
        String password = new String(passwordR.getPassword());

        String selectGender = null;
        if (rbmale.isSelected()) {
            selectGender = "Male";
        } else if (rbfemale.isSelected()) {
            selectGender = "Female";
        }

        if (!Arrays.equals(passwordR.getPassword(), RePasswordR.getPassword())) {
            JOptionPane.showMessageDialog(null, "Password do not match!");
        } else if (name.isEmpty() || lname.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else {
            String sql = "INSERT INTO users_tbl(fistName,lastName,userName,password,gender) VALUES(?,?,?,?,?)";
            try (Connection con = DatabaseConnection.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

                pstmt.setString(1, name);
                pstmt.setString(2, lname);
                pstmt.setString(3, username);
                pstmt.setString(4, password);
                pstmt.setString(5, selectGender);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Saved");

                txtRname.setText("");
                txtRLname.setText("");
                txtRusername.setText("");
                passwordR.setText("");
                RePasswordR.setText("");
            } catch (SQLException e) {
                System.err.print(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtRname.setText("");
        txtRLname.setText("");
        txtRusername.setText("");
        passwordR.setText("");
        RePasswordR.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtRusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRusernameKeyTyped
        // TODO add your handling code here:
       char c =  evt.getKeyChar();
       
        if (!Character.isDigit(c) && !(c>='a'&& c<='z') && !(c>='A' && c<='Z')&& c!=8) {
            evt.consume();
            
        }
        
    }//GEN-LAST:event_txtRusernameKeyTyped
    int posX = 0,posY = 0;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen()-posX, evt.getYOnScreen()-posY);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField RePasswordR;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordR;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTextField txtRLname;
    private javax.swing.JTextField txtRname;
    private javax.swing.JTextField txtRusername;
    // End of variables declaration//GEN-END:variables
}
