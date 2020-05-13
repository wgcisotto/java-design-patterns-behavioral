package com.wgcisotto.behavioral.mediator;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayExample {

    private Timer timer;
    private Toolkit toolkit;

    public MediatorEverydayExample(int seconds){
        timer = new Timer();
        toolkit = Toolkit.getDefaultToolkit();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTask(), seconds * 2 * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 3 * 1000);
    }

    class RemindTask extends TimerTask {
        public void run(){
            System.out.println("Time's up!");
            toolkit.beep();
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {
        public void run(){
            System.out.println("Now Time's really up!");
            timer.cancel();
        }
    }


    public static void main(String args[]){
        System.out.println("About to schedule task.");
        new MediatorEverydayExample(3);
        System.out.println("Task scheduled.");
    }

}
