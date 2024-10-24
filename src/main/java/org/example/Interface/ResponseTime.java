package org.example.Interface;

import java.util.Timer;
import java.util.TimerTask;

public class ResponseTime {
        public static Timer responseTimer = new Timer();

        public static TimerTask task1 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("The response time is up");
            }
        };

//        TimerTask task2 = new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("You have a minute to give an answer");
//            }
//        };

    }

