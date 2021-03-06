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
import com.examsimulator.common.observer.Observer;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lahiru Sandeepa
 */
public class ViewTestDeveloperForm extends javax.swing.JPanel implements Observer{

    /**
     * Creates new form ViewStudentForm
     */
    public ViewTestDeveloperForm() {
        initComponents();
        viewAllTestDeveloper();
        try {
            UnicastRemoteObject.exportObject(this, 0);
        } catch (RemoteException ex) {
            Logger.getLogger(ViewTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableTestDeveloper = new javax.swing.JTable();
        labelRefresh = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tableTestDeveloper.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test Developer Id", "Test Developer Name", "NIC", "Telephone No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableTestDeveloper.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tableTestDeveloper);

        labelRefresh.setBackground(new java.awt.Color(0, 0, 255));
        labelRefresh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelRefresh.setForeground(new java.awt.Color(255, 255, 255));
        labelRefresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRefresh.setText("Refresh");
        labelRefresh.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));
        labelRefresh.setOpaque(true);
        labelRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRefreshMouseClicked
        viewAllTestDeveloper();
    }//GEN-LAST:event_labelRefreshMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRefresh;
    private javax.swing.JTable tableTestDeveloper;
    // End of variables declaration//GEN-END:variables

    private void viewAllTestDeveloper() {
        try {
            TestDeveloperController testDeveloperController=ServerConnector.getServerConnector().getTestDeveloperController();
            List<TestDeveloperDTO> testDeveloperList=testDeveloperController.getAllTestDeveloper();
            DefaultTableModel defaultTableModel=(DefaultTableModel) tableTestDeveloper.getModel();
            defaultTableModel.setRowCount(0);
            for (TestDeveloperDTO testDeveloper : testDeveloperList) {
                Object[] rowData={testDeveloper.getTestDeveloperId(),testDeveloper.getTestDeveloperName(),testDeveloper.getNic(),testDeveloper.getTelephoneNo()};
                defaultTableModel.addRow(rowData);
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(ViewTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ViewTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ViewTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewTestDeveloperForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(String message) throws RemoteException {
        JOptionPane.showMessageDialog(this, message);
    }
}
