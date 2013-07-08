package com.example.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ProcessingSpeedActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.procspeed);

        ProcessingSpeed p = new ProcessingSpeed();
        long startTime = System.currentTimeMillis();
        p.calcRandomStuff();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        TextView textView = new TextView(this);
        textView.setTextSize(12);
        textView.setText("The calculations took " + duration + " milliseconds.");

        setContentView(textView);
    }
}
