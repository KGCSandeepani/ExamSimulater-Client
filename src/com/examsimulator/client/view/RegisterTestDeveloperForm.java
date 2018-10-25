/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.client.view;

import com.examsimulator.client.connector.ServerConnector;
import com.examsimulator.common.controller.StudentController;
import com.examsimulator.common.controller.TestDeveloperController;
import com.examsimulator.common.dto.StudentDTO;
import com.examsimulator.common.dto.TestDeveloperDTO;
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
public class RegisterTestDeveloperForm extends javax.swing.JPanel {

    /**
     * Creates new form StudentManagement
     */
    public RegisterTestDeveloperForm() {
        initComponents();
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

        labelTestDeveloperId = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelNIC = new javax.swing.JLabel();
        labelTelephoneNo = new javax.swing.JLabel();
        textTestDeveloperId = new javax.swing.JTextField();
        textTestDeveloperName = new javax.swing.JTextField();
        textNIC = new javax.swing.JTextField();
        textTelephoneNo = new javax.swing.JTextField();
        labelRegisterTestDeveloper = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        labelTestDeveloperId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelTestDeveloperId.setText("Test Developer Id");

        labelName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelName.setText("Name");

        labelNIC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelNIC.setText("NIC");

        labelTelephoneNo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelTelephoneNo.setText("Telephone No");

        textTestDeveloperId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textTestDeveloperId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTestDeveloperIdActionPerformed(evt);
            }
        });

        textTestDeveloperName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textTestDeveloperName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTestDeveloperNameActionPerformed(evt);
            }
        });

        textNIC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNICActionPerformed(evt);
            }
        });
        textNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNICKeyReleased(evt);
            }
        });

        textTelephoneNo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textTelephoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textTelephoneNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelephoneNoKeyTyped(evt);
            }
        });

        labelRegisterTestDeveloper.setBackground(new java.awt.Color(0, 0, 204));
        labelRegisterTestDeveloper.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelRegisterTestDeveloper.setForeground(new java.awt.Color(255, 255, 255));
        labelRegisterTestDeveloper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRegisterTestDeveloper.setText("Register Test Developer");
        labelRegisterTestDeveloper.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));
        labelRegisterTestDeveloper.setOpaque(true);
        labelRegisterTestDeveloper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegisterTestDeveloperMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTestDeveloperId, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(labelTelephoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textTelephoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                    .addComponent(textNIC)
                    .addComponent(textTestDeveloperName)
                    .addComponent(textTestDeveloperId))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelRegisterTestDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTestDeveloperId)
                    .addComponent(textTestDeveloperId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(textTestDeveloperName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNIC)
                    .addComponent(textNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelephoneNo)
                    .addComponent(textTelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(labelRegisterTestDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textTestDeveloperIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTestDeveloperIdActionPerformed
        textTestDeveloperName.requestFocus();
    }//GEN-LAST:event_textTestDeveloperIdActionPerformed

    private void textTestDeveloperNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTestDeveloperNameActionPerformed
        textNIC.requestFocus();
    }//GEN-LAST:event_textTestDeveloperNameActionPerformed

    private void textNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNICActionPerformed
        textTelephoneNo.requestFocus();
    }//GEN-LAST:event_textNICActionPerformed

    private void labelRegisterTestDeveloperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegisterTestDeveloperMouseClicked
        String testDeveloperId=textTestDeveloperId.getText();
        String testDeveloperName=textTestDeveloperName.getText();
        String nic=textNIC.getText();
        int telephoneNo=Integer.parseInt(textTelephoneNo.getText());
        TestDeveloperDTO testDeveloper=new TestDeveloperDTO(testDeveloperId, testDeveloperName, nic, telephoneNo);
        try {
            TestDeveloperController testDeveloperController=ServerConnector.getServerConnector().getTestDeveloperController();
            boolean isAdded=testDeveloperController.add(testDeveloper);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Test Developer register successfully!");
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(RegisterTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RegisterTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RegisterTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegisterTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelRegisterTestDeveloperMouseClicked

    private void textTelephoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelephoneNoKeyTyped
        
    }//GEN-LAST:event_textTelephoneNoKeyTyped

    private void textTelephoneNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelephoneNoKeyReleased
        String telephoneNo=textTelephoneNo.getText();
        telephoneNo=telephoneNo.replaceAll("[\\D]", "");
        textTelephoneNo.setText(telephoneNo);
    }//GEN-LAST:event_textTelephoneNoKeyReleased

    private void textNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNICKeyReleased
        String nic=textNIC.getText();
        nic=nic.replaceAll("[\\D&&[^v]&&[^x]]", "");
        textNIC.setText(nic);
    }//GEN-LAST:event_textNICKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelNIC;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelRegisterTestDeveloper;
    private javax.swing.JLabel labelTelephoneNo;
    private javax.swing.JLabel labelTestDeveloperId;
    private javax.swing.JTextField textNIC;
    private javax.swing.JTextField textTelephoneNo;
    private javax.swing.JTextField textTestDeveloperId;
    private javax.swing.JTextField textTestDeveloperName;
    // End of variables declaration//GEN-END:variables

    private void generateId() {
        try {
            TestDeveloperController testDeveloperController=ServerConnector.getServerConnector().getTestDeveloperController();
            String id=testDeveloperController.generateId();
            textTestDeveloperId.setText(id);
        } catch (NotBoundException ex) {
            Logger.getLogger(RegisterTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RegisterTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RegisterTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegisterTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
