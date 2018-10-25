/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.client.connector;

import com.examsimulator.common.controller.AnswerController;
import com.examsimulator.common.controller.ExamController;
import com.examsimulator.common.controller.ExamDetailController;
import com.examsimulator.common.controller.LoginController;
import com.examsimulator.common.controller.MarksController;
import com.examsimulator.common.controller.QuestionController;
import com.examsimulator.common.controller.StudentController;
import com.examsimulator.common.controller.SubjectContoller;
import com.examsimulator.common.controller.TestDeveloperController;
import com.examsimulator.common.controller.factory.ControllerFactory;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Lahiru Sandeepa
 */
public class ServerConnector {
    private static ServerConnector serverConnector;
    private AnswerController answerController;
    private ExamController examController;
    private ExamDetailController examDetailController;
    private MarksController marksController;
    private QuestionController questionController;
    private StudentController studentController;
    private SubjectContoller subjectContoller;
    private TestDeveloperController testDeveloperController;
    private LoginController loginController;
    private ControllerFactory controllerFactory;
    
    private ServerConnector() throws NotBoundException, MalformedURLException, RemoteException{
        controllerFactory=(ControllerFactory) Naming.lookup("rmi://localhost:5050/ExamSimulatorServer");
    }
    
    public AnswerController getAnswerController() throws RemoteException{
        if (answerController==null) {
            answerController=(AnswerController) controllerFactory.getController(ControllerFactory.ControllerTypes.ANSWER);
        }
        return answerController;
    }
    
    public ExamController getExamController() throws RemoteException{
        if (examController==null) {
            examController=(ExamController) controllerFactory.getController(ControllerFactory.ControllerTypes.EXAM);
        }
        return examController;
    }
    
    public ExamDetailController getExamDetailController() throws RemoteException{
        if (examDetailController==null) {
            examDetailController=(ExamDetailController) controllerFactory.getController(ControllerFactory.ControllerTypes.EXAMDETAIL);
        }
        return examDetailController;
    }
    
    public MarksController getMarksController() throws RemoteException{
        if (marksController==null) {
            marksController=(MarksController) controllerFactory.getController(ControllerFactory.ControllerTypes.MARKS);
        }
        return marksController;
    }
    
    public QuestionController getQuestionController() throws RemoteException{
        if (questionController==null) {
            questionController=(QuestionController) controllerFactory.getController(ControllerFactory.ControllerTypes.QUESTION);
        }
        return questionController;
    }
    
    public StudentController getStudentController() throws RemoteException{
        if (studentController==null) {
            studentController=(StudentController) controllerFactory.getController(ControllerFactory.ControllerTypes.STUDENT);
        }
        return studentController;
    }
    
    public SubjectContoller getSubjectContoller() throws RemoteException{
        if (subjectContoller==null) {
            subjectContoller=(SubjectContoller) controllerFactory.getController(ControllerFactory.ControllerTypes.SUBJECT);
        }
        return subjectContoller;
    }
    
    public TestDeveloperController getTestDeveloperController() throws RemoteException{
        if (testDeveloperController==null) {
            testDeveloperController=(TestDeveloperController) controllerFactory.getController(ControllerFactory.ControllerTypes.TESTDEVELOPER);
        }
        return testDeveloperController;
    }
    
    public LoginController getLoginController() throws RemoteException{
        if (loginController==null) {
            loginController=(LoginController) controllerFactory.getController(ControllerFactory.ControllerTypes.LOGIN);
        }
        return loginController;
    }
    
    public static ServerConnector getServerConnector() throws NotBoundException, MalformedURLException, RemoteException{
        if (serverConnector==null) {
            serverConnector=new ServerConnector();
        }
        return serverConnector;
    }
}
