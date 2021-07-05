package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FeedBack extends AppCompatActivity {

    Button btFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        btFeedback= findViewById(R.id.btFeedback);
        btFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeedBack.this, " Feedback message send Successfully", Toast.LENGTH_SHORT).show();
            }
        });

    }
}