/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.client.view;

import com.examsimulator.client.connector.ServerConnector;
import com.examsimulator.common.controller.LoginController;
import com.examsimulator.common.dto.LoginDTO;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lahiru Sandeepa
 */
public class SettingPage extends javax.swing.JFrame {

    /**
     * Creates new form SettingPage
     */
    public SettingPage() {
        initComponents();
        setLocationRelativeTo(null);
        generateId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackGround = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelExit = new javax.swing.JLabel();
        labelMinimize = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        comboBoxUserName = new javax.swing.JComboBox();
        passwordField = new javax.swing.JPasswordField();
        labelSave = new javax.swing.JLabel();
        labelRemove = new javax.swing.JLabel();
        labelUserName1 = new javax.swing.JLabel();
        textLoginId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBackGround.setBackground(new java.awt.Color(255, 255, 255));
        panelBackGround.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelTitle.setBackground(new java.awt.Color(153, 0, 102));

        labelTitle.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Setting");

        labelExit.setBackground(new java.awt.Color(255, 255, 255));
        labelExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit.setText("X");
        labelExit.setOpaque(true);
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });

        labelMinimize.setBackground(new java.awt.Color(255, 255, 255));
        labelMinimize.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimize.setText("-");
        labelMinimize.setOpaque(true);
        labelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(labelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMinimize))
                .addGap(91, 91, 91))
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelUserName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelUserName.setText("User Name");

        labelPassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelPassword.setText("Password");

        comboBoxUserName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        comboBoxUserName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Administrator", "TestDeveloper" }));

        passwordField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        labelSave.setBackground(new java.awt.Color(0, 0, 204));
        labelSave.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelSave.setForeground(new java.awt.Color(255, 255, 255));
        labelSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSave.setText("Save");
        labelSave.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));
        labelSave.setOpaque(true);
        labelSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSaveMouseClicked(evt);
            }
        });

        labelRemove.setBackground(new java.awt.Color(0, 0, 204));
        labelRemove.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelRemove.setForeground(new java.awt.Color(255, 255, 255));
        labelRemove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRemove.setText("Remove");
        labelRemove.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));
        labelRemove.setOpaque(true);
        labelRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRemoveMouseClicked(evt);
            }
        });

        labelUserName1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelUserName1.setText("Login Id");

        textLoginId.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout panelBackGroundLayout = new javax.swing.GroupLayout(panelBackGround);
        panelBackGround.setLayout(panelBackGroundLayout);
        panelBackGroundLayout.setHorizontalGroup(
            panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBackGroundLayout.createSequentialGroup()
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackGroundLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBackGroundLayout.createSequentialGroup()
                                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBackGroundLayout.createSequentialGroup()
                                .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBackGroundLayout.createSequentialGroup()
                                .addComponent(labelUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textLoginId))))
                    .addGroup(panelBackGroundLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(labelSave, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panelBackGroundLayout.setVerticalGroup(
            panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackGroundLayout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSave)
                    .addComponent(labelRemove))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        dispose();
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSaveMouseClicked
        addLogin();
    }//GEN-LAST:event_labelSaveMouseClicked

    private void labelRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRemoveMouseClicked
        removeLogin();
    }//GEN-LAST:event_labelRemoveMouseClicked

    private void labelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_labelMinimizeMouseClicked

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
            java.util.logging.Logger.getLogger(SettingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboBoxUserName;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelMinimize;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRemove;
    private javax.swing.JLabel labelSave;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JLabel labelUserName1;
    private javax.swing.JPanel panelBackGround;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textLoginId;
    // End of variables declaration//GEN-END:variables

    private void addLogin() {
        String loginId=textLoginId.getText();
        String userName=(String) comboBoxUserName.getSelectedItem();
        String paaword=passwordField.getText();
        LoginDTO loginDTO=new LoginDTO(loginId, userName, paaword);
        try {
            LoginController loginController=ServerConnector.getServerConnector().getLoginController();
            boolean isAdded=loginController.add(loginDTO);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Added success!");
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void removeLogin() {
        String userName=(String) comboBoxUserName.getSelectedItem();
        String paaword=passwordField.getText();
        try {
            LoginController loginController=ServerConnector.getServerConnector().getLoginController();
            LoginDTO loginDTO=loginController.searchLoginByUNAndPW(userName, paaword);
            if (loginDTO!=null) {
                boolean isRemove=loginController.delete(loginDTO.getLoginId());
                if (isRemove) {
                    JOptionPane.showMessageDialog(this, "Remove success!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Password is incorrect!");
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void generateId() {
        try {
            LoginController loginController=ServerConnector.getServerConnector().getLoginController();
            String id=loginController.generateId();
            textLoginId.setText(id);
        } catch (NotBoundException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SettingPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
