package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChangePasswords extends AppCompatActivity {
    Button btChangePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_passwords);

        btChangePassword = findViewById(R.id.btChangePassword);
        btChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChangePasswords.this, "password changes successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}