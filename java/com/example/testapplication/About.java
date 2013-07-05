package com.example.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText(" App created by: \n  First1 Last1\n  First2 Last2\n  First3 Last3\n  First4 Last4\n\n\n New Jersey Governor's School of Engineering & Technology 2013\n Many open source projects were used in this app, such as:\n  Thing1\n  Thing2\n  Thing3");

        // Set the text view as the activity layout
        setContentView(textView);
    }
}
