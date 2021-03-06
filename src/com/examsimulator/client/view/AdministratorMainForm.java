/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.client.view;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lahiru Sandeepa
 */
public class AdministratorMainForm extends javax.swing.JFrame {

    /**
     * Creates new form AdministorMainForm
     */
    public AdministratorMainForm() {
        initComponents();
        setTime();
        setDate();
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
        labelTime = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelExit = new javax.swing.JLabel();
        labelMinimize = new javax.swing.JLabel();
        labelStudent = new javax.swing.JLabel();
        labelTestDeveloper = new javax.swing.JLabel();
        labelQuestion = new javax.swing.JLabel();
        labelSubject = new javax.swing.JLabel();
        labelSetting = new javax.swing.JLabel();
        labelRestart = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBackGround.setBackground(new java.awt.Color(255, 255, 255));

        panelTitle.setBackground(new java.awt.Color(153, 0, 102));

        labelTitle.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Administrator Main Form");

        labelTime.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelTime.setText("jLabel1");

        labelDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelDate.setText("jLabel1");

        labelExit.setBackground(new java.awt.Color(255, 255, 255));
        labelExit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelExit.setForeground(new java.awt.Color(204, 0, 0));
        labelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit.setText("X");
        labelExit.setOpaque(true);
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });

        labelMinimize.setBackground(new java.awt.Color(255, 255, 255));
        labelMinimize.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelMinimize.setForeground(new java.awt.Color(204, 0, 0));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(198, 198, 198)
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                        .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        labelStudent.setBackground(new java.awt.Color(0, 102, 204));
        labelStudent.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labelStudent.setForeground(new java.awt.Color(255, 255, 255));
        labelStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStudent.setText("Student");
        labelStudent.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));
        labelStudent.setOpaque(true);
        labelStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelStudentMouseClicked(evt);
            }
        });

        labelTestDeveloper.setBackground(new java.awt.Color(0, 102, 204));
        labelTestDeveloper.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labelTestDeveloper.setForeground(new java.awt.Color(255, 255, 255));
        labelTestDeveloper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTestDeveloper.setText("Test Developer");
        labelTestDeveloper.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));
        labelTestDeveloper.setOpaque(true);
        labelTestDeveloper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTestDeveloperMouseClicked(evt);
            }
        });

        labelQuestion.setBackground(new java.awt.Color(0, 102, 204));
        labelQuestion.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labelQuestion.setForeground(new java.awt.Color(255, 255, 255));
        labelQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQuestion.setText("Question");
        labelQuestion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));
        labelQuestion.setOpaque(true);
        labelQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelQuestionMouseClicked(evt);
            }
        });

        labelSubject.setBackground(new java.awt.Color(0, 102, 204));
        labelSubject.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        labelSubject.setForeground(new java.awt.Color(255, 255, 255));
        labelSubject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubject.setText("Subject");
        labelSubject.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));
        labelSubject.setOpaque(true);
        labelSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSubjectMouseClicked(evt);
            }
        });

        labelSetting.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        labelSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSetting.setText("Setting");
        labelSetting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        labelSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSettingMouseClicked(evt);
            }
        });

        labelRestart.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        labelRestart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRestart.setText("Restart");
        labelRestart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        labelRestart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRestartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBackGroundLayout = new javax.swing.GroupLayout(panelBackGround);
        panelBackGround.setLayout(panelBackGroundLayout);
        panelBackGroundLayout.setHorizontalGroup(
            panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBackGroundLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(labelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(labelTestDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(labelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(labelSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackGroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        panelBackGroundLayout.setVerticalGroup(
            panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackGroundLayout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTestDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
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

    private void labelStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelStudentMouseClicked
        new StudentForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelStudentMouseClicked

    private void labelTestDeveloperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTestDeveloperMouseClicked
        new TestDeveloperForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelTestDeveloperMouseClicked

    private void labelQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelQuestionMouseClicked
        new ViewQuestionForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelQuestionMouseClicked

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSubjectMouseClicked
        new SubjectForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelSubjectMouseClicked

    private void labelSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSettingMouseClicked
        new SettingPage().setVisible(true);
    }//GEN-LAST:event_labelSettingMouseClicked

    private void labelRestartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRestartMouseClicked
        new LoginPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelRestartMouseClicked

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
            java.util.logging.Logger.getLogger(AdministratorMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelMinimize;
    private javax.swing.JLabel labelQuestion;
    private javax.swing.JLabel labelRestart;
    private javax.swing.JLabel labelSetting;
    private javax.swing.JLabel labelStudent;
    private javax.swing.JLabel labelSubject;
    private javax.swing.JLabel labelTestDeveloper;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBackGround;
    private javax.swing.JPanel panelTitle;
    // End of variables declaration//GEN-END:variables

    private void setTime() {
        new Thread(){
            public void run(){
                while (true) {                    
                    SimpleDateFormat dateFormat=new SimpleDateFormat("hh:mm:ss aa");
                    labelTime.setText(dateFormat.format(new Date()));
                }
            }
        }.start();
    }

    private void setDate() {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date=dateFormat.format(new Date());
        labelDate.setText(date);        
    }
}
