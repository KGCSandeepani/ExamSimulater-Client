/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.client.view;

import com.examsimulator.client.connector.ServerConnector;
import com.examsimulator.common.controller.ExamController;
import com.examsimulator.common.controller.ExamDetailController;
import com.examsimulator.common.controller.StudentController;
import com.examsimulator.common.controller.SubjectContoller;
import com.examsimulator.common.dto.StudentDTO;
import com.examsimulator.common.dto.SubjectDTO;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lahiru Sandeepa
 */
public class ExamRegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form ExamRegistrationForm
     */
    public ExamRegistrationForm() {
        initComponents();
        setTime();
        setDate();
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
        labelExit1 = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        labelStudentId = new javax.swing.JLabel();
        labelStudentName = new javax.swing.JLabel();
        labelSubject = new javax.swing.JLabel();
        textStudentId = new javax.swing.JTextField();
        textSubject = new javax.swing.JTextField();
        textStudentName = new javax.swing.JTextField();
        labelNext = new javax.swing.JLabel();
        labelExamId = new javax.swing.JLabel();
        textExamId = new javax.swing.JTextField();
        separator = new javax.swing.JSeparator();
        labelSetting = new javax.swing.JLabel();
        labelRestart = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBackGround.setBackground(new java.awt.Color(255, 255, 255));

        panelTitle.setBackground(new java.awt.Color(153, 0, 102));

        labelTitle.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Exam Registration Form");

        labelExit.setBackground(new java.awt.Color(255, 255, 255));
        labelExit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelExit.setForeground(new java.awt.Color(204, 0, 0));
        labelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit.setText("X");
        labelExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelExit.setOpaque(true);
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });

        labelExit1.setBackground(new java.awt.Color(255, 255, 255));
        labelExit1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelExit1.setForeground(new java.awt.Color(204, 0, 0));
        labelExit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit1.setText("-");
        labelExit1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelExit1.setOpaque(true);
        labelExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExit1MouseClicked(evt);
            }
        });

        labelDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelDate.setText("jLabel1");

        labelTime.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelTime.setText("jLabel1");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206)
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                        .addComponent(labelTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDate)
                        .addGap(31, 31, 31))))
        );

        labelStudentId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelStudentId.setText("Student Id");

        labelStudentName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelStudentName.setText("Student Name");

        labelSubject.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelSubject.setText("Subject");

        textStudentId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStudentIdActionPerformed(evt);
            }
        });

        textSubject.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textSubject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSubjectKeyReleased(evt);
            }
        });

        textStudentName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textStudentName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textStudentNameKeyReleased(evt);
            }
        });

        labelNext.setBackground(new java.awt.Color(0, 0, 204));
        labelNext.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelNext.setForeground(new java.awt.Color(255, 255, 255));
        labelNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNext.setText("Next");
        labelNext.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        labelNext.setOpaque(true);
        labelNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNextMouseClicked(evt);
            }
        });

        labelExamId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelExamId.setText("Exam Id");

        textExamId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        separator.setForeground(new java.awt.Color(0, 0, 0));

        labelSetting.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        labelSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSetting.setText("Setting");
        labelSetting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(separator)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackGroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(panelBackGroundLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNext, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBackGroundLayout.createSequentialGroup()
                        .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelExamId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBackGroundLayout.createSequentialGroup()
                                .addComponent(textStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(labelStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        panelBackGroundLayout.setVerticalGroup(
            panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackGroundLayout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStudentId)
                    .addComponent(labelStudentName)
                    .addComponent(textStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSubject)
                    .addComponent(textSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelExamId)
                    .addComponent(textExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(labelNext)
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
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
        System.exit(0);
    }//GEN-LAST:event_labelExitMouseClicked

    private void textStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStudentIdActionPerformed
        searchStudentName();
    }//GEN-LAST:event_textStudentIdActionPerformed

    private void textStudentNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textStudentNameKeyReleased
        searchStudentId();
    }//GEN-LAST:event_textStudentNameKeyReleased

    private void textSubjectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSubjectKeyReleased
        searchSubject();
    }//GEN-LAST:event_textSubjectKeyReleased

    private void labelRestartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRestartMouseClicked
        new LoginPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelRestartMouseClicked

    private void labelNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNextMouseClicked
        if (!(textStudentId.getText().isEmpty()&&textStudentName.getText().isEmpty()&&textSubject.getText().isEmpty()&&textExamId.getText().isEmpty())) {
            ExamForm examForm=new ExamForm();
            String examId=textExamId.getText();
            String studentId=textStudentId.getText();
            String studentName=textStudentName.getText();
            String subject=textSubject.getText();
            examForm.setTextValue(examId,studentId,studentName,subject);
            examForm.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Fill all text field!");
        }
    }//GEN-LAST:event_labelNextMouseClicked

    private void labelExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExit1MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_labelExit1MouseClicked

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
            java.util.logging.Logger.getLogger(ExamRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamRegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelExamId;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelExit1;
    private javax.swing.JLabel labelNext;
    private javax.swing.JLabel labelRestart;
    private javax.swing.JLabel labelSetting;
    private javax.swing.JLabel labelStudentId;
    private javax.swing.JLabel labelStudentName;
    private javax.swing.JLabel labelSubject;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBackGround;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JSeparator separator;
    private javax.swing.JTextField textExamId;
    private javax.swing.JTextField textStudentId;
    private javax.swing.JTextField textStudentName;
    private javax.swing.JTextField textSubject;
    // End of variables declaration//GEN-END:variables

    private void searchStudentName() {
        String id=textStudentId.getText();
        try {
            StudentController studentController=ServerConnector.getServerConnector().getStudentController();
            StudentDTO studentDTO=studentController.search(id);
            if (studentDTO!=null) {
                textStudentName.setText(studentDTO.getStudentName());
                
            } else {
                textStudentName.setText("");
                JOptionPane.showMessageDialog(this, "Not found student!");
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchStudentId() {
        String name=textStudentName.getText();
        int length=name.length();
        try {
            StudentController studentController=ServerConnector.getServerConnector().getStudentController();
            StudentDTO studentDTO=studentController.searchByNameStudent(name);
            if (studentDTO!=null) {
                textStudentName.setText(studentDTO.getStudentName());
                textStudentName.select(length, studentDTO.getStudentName().length());
                textStudentId.setText(studentDTO.getStudentId());
                
            } else {
                textStudentId.setText("");
                JOptionPane.showMessageDialog(this, "Not found student!");
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchSubject() {
        String subject=textSubject.getText();
        int length=subject.length();
        try {
            SubjectContoller subjectContoller=ServerConnector.getServerConnector().getSubjectContoller();
            SubjectDTO subjectDTO=subjectContoller.searchByNameSubject(subject);
            if (subjectDTO!=null) {
                textSubject.setText(subjectDTO.getSubjectName());
                textSubject.select(length, subjectDTO.getSubjectName().length());
                textExamId.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "This subject not found!");
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (StringIndexOutOfBoundsException ex){}
    }

    void setTextValue(String examId, String studentId, String studentName, String subject) {
        textExamId.setText(examId);
        textStudentId.setText(studentId);
        textStudentName.setText(studentName);
        textSubject.setText(subject);
    }

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

    private void generateId() {
        try {
            ExamController examController=ServerConnector.getServerConnector().getExamController();
            String id=examController.generateId();
            textExamId.setText(id);
        } catch (NotBoundException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
