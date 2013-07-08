package com.example.testapplication;

import android.app.Activity;

public class ProcessingSpeed extends Activity {

    private int numProcesses = 0;

    public ProcessingSpeed() {

    }

    public void calcRandomStuff() {
        int x;
        int y;
        int z;
        for (int i = 0; i < 1000000; i++) {
            x = (int) (Math.random() * 11);
            y = (int) (Math.random() * 11);
            z = x * y;
            numProcesses++;
        }
    }
}