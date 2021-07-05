package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UserProfile extends AppCompatActivity {
    Button btUserProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        btUserProfile = findViewById(R.id.btUserProfile);
        btUserProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserProfile.this, "Data Changes successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}