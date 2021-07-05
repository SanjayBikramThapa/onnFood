package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PasswordReset extends AppCompatActivity {

    Button btResetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_reset);

        btResetPassword = findViewById(R.id.btResetPassword);
        btResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PasswordReset.this, "Password Reset successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}