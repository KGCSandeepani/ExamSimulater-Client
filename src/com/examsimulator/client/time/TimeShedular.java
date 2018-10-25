/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.client.time;

import com.examsimulator.client.view.ExamForm;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Lahiru Sandeepa
 */
public class TimeShedular {

    Timer timer;    
    int time;
    ExamForm examForm;

    public TimeShedular(int time, ExamForm examForm) {        
        timer = new Timer();
        timer.schedule(new RemindTask(), 0, 1 * 1000 * 60);
        this.time = time;
        this.examForm = examForm;
    }

    class RemindTask extends TimerTask {

        int numWarningBeeps = 60;

        public void run() {
            if (time > 0) {
                examForm.setTime(time);
                System.out.println("Beep!");
                time--;
            } else {
                examForm.setTime(time);
                System.out.println("Time's up!");
                timer.cancel();
            }
        }
    }
}
